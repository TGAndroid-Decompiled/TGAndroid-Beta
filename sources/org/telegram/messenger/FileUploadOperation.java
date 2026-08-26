package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_language_id_common.zzjj;
import java.io.File;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda37;

public class FileUploadOperation {
    private static final int initialRequestsCount = 8;
    private static final int initialRequestsSlowNetworkCount = 1;
    private static final int maxUploadingKBytes = 2048;
    private static final int maxUploadingSlowNetworkKBytes = 32;
    private static final int minUploadChunkSize = 128;
    private static final int minUploadChunkSlowNetworkSize = 32;
    private long availableSize;
    public volatile boolean caughtPremiumFloodWait;
    private int currentAccount;
    private long currentFileId;
    private int currentPartNum;
    private int currentType;
    private int currentUploadRequetsCount;
    private FileUploadOperationDelegate delegate;
    private long estimatedSize;
    private String fileKey;
    private int fingerprint;
    private boolean forceSmallFile;
    private ArrayList<byte[]> freeRequestIvs;
    private boolean isBigFile;
    private boolean isEncrypted;
    private boolean isLastPart;
    private byte[] iv;
    private byte[] ivChange;
    private byte[] key;
    protected long lastProgressUpdateTime;
    private int lastSavedPartNum;
    private int maxRequestsCount;
    private boolean nextPartFirst;
    private int operationGuid;
    private SharedPreferences preferences;
    private byte[] readBuffer;
    private long readBytesCount;
    private int requestNum;
    private int saveInfoTimes;
    private boolean slowNetwork;
    private boolean started;
    private int state;
    private RandomAccessFile stream;
    private long totalFileSize;
    private int totalPartsCount;
    private boolean uploadFirstPartLater;
    private int uploadStartTime;
    private long uploadedBytesCount;
    private String uploadingFilePath;
    private int uploadChunkSize = 65536;
    public final SparseIntArray requestTokens = new SparseIntArray();
    public final ArrayList<Integer> uiRequestTokens = new ArrayList<>();
    private SparseArray<UploadCachedResult> cachedResults = new SparseArray<>();
    private boolean[] recalculatedEstimatedSize = {false, false};

    public interface FileUploadOperationDelegate {
        void didChangedUploadProgress(FileUploadOperation fileUploadOperation, long j, long j2);

        void didFailedUploadingFile(FileUploadOperation fileUploadOperation);

        void didFinishUploadingFile(FileUploadOperation fileUploadOperation, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2);
    }

    public static class UploadCachedResult {
        private long bytesOffset;
        private byte[] iv;

        private UploadCachedResult() {
        }
    }

    public FileUploadOperation(int i, String str, boolean z, long j, int i2) {
        boolean z2 = false;
        this.currentAccount = i;
        this.uploadingFilePath = str;
        this.isEncrypted = z;
        this.estimatedSize = j;
        this.currentType = i2;
        if (j != 0 && !z) {
            z2 = true;
        }
        this.uploadFirstPartLater = z2;
    }

    private void calcTotalPartsCount() {
        if (!this.uploadFirstPartLater) {
            long j = this.totalFileSize;
            long j2 = this.uploadChunkSize;
            this.totalPartsCount = (int) (((j + j2) - 1) / j2);
        } else if (this.isBigFile) {
            long j3 = this.totalFileSize;
            long j4 = this.uploadChunkSize;
            this.totalPartsCount = ((int) ((((j3 - j4) + j4) - 1) / j4)) + 1;
        } else {
            long j5 = this.totalFileSize - 1024;
            long j6 = this.uploadChunkSize;
            this.totalPartsCount = ((int) (((j5 + j6) - 1) / j6)) + 1;
        }
    }

    private void cleanup() {
        if (this.preferences == null) {
            this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("uploadinfo", 0);
        }
        this.preferences.edit().remove(this.fileKey + "_time").remove(this.fileKey + "_size").remove(this.fileKey + "_uploaded").remove(this.fileKey + "_id").remove(this.fileKey + "_iv").remove(this.fileKey + "_key").remove(this.fileKey + "_ivc").commit();
        try {
            RandomAccessFile randomAccessFile = this.stream;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.stream = null;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
    }

    public void lambda$cancel$3() {
        for (int i = 0; i < this.requestTokens.size(); i++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i), true);
        }
    }

    public void lambda$checkNewDataAvailable$4(Float f, long j, long j2) {
        if (f != null && this.estimatedSize != 0 && j == 0) {
            boolean z = false;
            boolean z2 = true;
            if (f.floatValue() > 0.75f) {
                boolean[] zArr = this.recalculatedEstimatedSize;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z = true;
                }
            }
            if (f.floatValue() > 0.95f) {
                boolean[] zArr2 = this.recalculatedEstimatedSize;
                if (zArr2[1]) {
                    z2 = z;
                } else {
                    zArr2[1] = true;
                }
            } else {
                z2 = z;
            }
            if (z2) {
                this.estimatedSize = (long) (j2 / f.floatValue());
            }
        }
        if (this.estimatedSize != 0 && j != 0) {
            this.estimatedSize = 0L;
            this.totalFileSize = j;
            calcTotalPartsCount();
            if (!this.uploadFirstPartLater && this.started) {
                storeFileUploadInfo();
            }
        }
        if (j <= 0) {
            j = j2;
        }
        this.availableSize = j;
        if (this.currentUploadRequetsCount < this.maxRequestsCount) {
            startUploadRequest();
        }
    }

    public void lambda$onNetworkChanged$1(boolean z) {
        if (this.slowNetwork != z) {
            this.slowNetwork = z;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("network changed to slow = " + this.slowNetwork);
            }
            int i = 0;
            while (true) {
                if (i >= this.requestTokens.size()) {
                    break;
                }
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i), true);
                i++;
            }
            this.requestTokens.clear();
            cleanup();
            this.isLastPart = false;
            this.nextPartFirst = false;
            this.requestNum = 0;
            this.currentPartNum = 0;
            this.readBytesCount = 0L;
            this.uploadedBytesCount = 0L;
            this.saveInfoTimes = 0;
            this.key = null;
            this.iv = null;
            this.ivChange = null;
            this.currentUploadRequetsCount = 0;
            this.lastSavedPartNum = 0;
            this.uploadFirstPartLater = false;
            this.cachedResults.clear();
            this.operationGuid++;
            int i2 = this.slowNetwork ? 1 : 8;
            for (int i3 = 0; i3 < i2; i3++) {
                startUploadRequest();
            }
        }
    }

    public void lambda$onNetworkChanged$2() {
        this.uiRequestTokens.clear();
    }

    public void lambda$start$0() {
        this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("uploadinfo", 0);
        this.slowNetwork = ApplicationLoader.isConnectionSlow();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload on slow network = " + this.slowNetwork);
        }
        int i = this.slowNetwork ? 1 : 8;
        for (int i2 = 0; i2 < i; i2++) {
            startUploadRequest();
        }
    }

    public void lambda$startUploadRequest$5(int[] iArr) {
        this.uiRequestTokens.remove(Integer.valueOf(iArr[0]));
    }

    public void lambda$startUploadRequest$6(int i, int[] iArr, int i2, byte[] bArr, int i3, int i4, int i5, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.InputEncryptedFile tL_inputEncryptedFileUploaded;
        TLRPC.InputFile tL_inputFile;
        byte[] bArr2 = bArr;
        if (i != this.operationGuid) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb = new StringBuilder("debug_uploading:  response reqId ");
            sb.append(iArr[0]);
            sb.append(" time");
            SQLitePreparedStatement$$ExternalSyntheticOutline0.m(this.uploadingFilePath, sb);
        }
        int currentNetworkType = tLObject != null ? tLObject.networkType : ApplicationLoader.getCurrentNetworkType();
        int i6 = this.currentType;
        if (i6 == 50331648) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 3, i2);
        } else if (i6 == 33554432) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 2, i2);
        } else if (i6 == 16777216) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 4, i2);
        } else if (i6 == 67108864) {
            String str = this.uploadingFilePath;
            if (str == null || !(str.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 5, i2);
            } else {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 7, i2);
            }
        }
        if (bArr2 != null) {
            this.freeRequestIvs.add(bArr2);
        }
        this.requestTokens.delete(i3);
        AndroidUtilities.runOnUIThread(new FileUploadOperation$$ExternalSyntheticLambda3(this, iArr, 0));
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            this.state = 4;
            this.delegate.didFailedUploadingFile(this);
            cleanup();
            return;
        }
        if (this.state != 1) {
            return;
        }
        this.uploadedBytesCount += (long) i4;
        long j2 = this.estimatedSize;
        this.delegate.didChangedUploadProgress(this, this.uploadedBytesCount, j2 != 0 ? Math.max(this.availableSize, j2) : this.totalFileSize);
        int i7 = this.currentUploadRequetsCount - 1;
        this.currentUploadRequetsCount = i7;
        if (!this.isLastPart || i7 != 0 || this.state != 1) {
            if (i7 < this.maxRequestsCount) {
                if (this.estimatedSize == 0 && !this.uploadFirstPartLater && !this.nextPartFirst) {
                    if (this.saveInfoTimes >= 4) {
                        this.saveInfoTimes = 0;
                    }
                    int i8 = this.lastSavedPartNum;
                    if (i5 == i8) {
                        this.lastSavedPartNum = i8 + 1;
                        long j3 = j;
                        while (true) {
                            UploadCachedResult uploadCachedResult = this.cachedResults.get(this.lastSavedPartNum);
                            if (uploadCachedResult == null) {
                                break;
                            }
                            j3 = uploadCachedResult.bytesOffset;
                            bArr2 = uploadCachedResult.iv;
                            this.cachedResults.remove(this.lastSavedPartNum);
                            this.lastSavedPartNum++;
                        }
                        boolean z = this.isBigFile;
                        if ((z && j3 % 1048576 == 0) || (!z && this.saveInfoTimes == 0)) {
                            SharedPreferences.Editor editorEdit = this.preferences.edit();
                            editorEdit.putLong(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.fileKey, "_uploaded"), j3);
                            if (this.isEncrypted) {
                                editorEdit.putString(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.fileKey, "_ivc"), Utilities.bytesToHex(bArr2));
                            }
                            editorEdit.commit();
                        }
                    } else {
                        UploadCachedResult uploadCachedResult2 = new UploadCachedResult();
                        uploadCachedResult2.bytesOffset = j;
                        if (bArr2 != null) {
                            uploadCachedResult2.iv = new byte[32];
                            System.arraycopy(bArr2, 0, uploadCachedResult2.iv, 0, 32);
                        }
                        this.cachedResults.put(i5, uploadCachedResult2);
                    }
                    this.saveInfoTimes++;
                }
                startUploadRequest();
                return;
            }
            return;
        }
        this.state = 3;
        if (this.key == null) {
            if (this.isBigFile) {
                tL_inputFile = new TLRPC.TL_inputFileBig();
            } else {
                tL_inputFile = new TLRPC.TL_inputFile();
                tL_inputFile.md5_checksum = "";
            }
            tL_inputFile.parts = this.currentPartNum;
            tL_inputFile.id = this.currentFileId;
            String str2 = this.uploadingFilePath;
            tL_inputFile.name = str2.substring(str2.lastIndexOf("/") + 1);
            this.delegate.didFinishUploadingFile(this, tL_inputFile, null, null, null);
            cleanup();
        } else {
            if (this.isBigFile) {
                tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileBigUploaded();
            } else {
                tL_inputEncryptedFileUploaded = new TLRPC.TL_inputEncryptedFileUploaded();
                tL_inputEncryptedFileUploaded.md5_checksum = "";
            }
            tL_inputEncryptedFileUploaded.parts = this.currentPartNum;
            tL_inputEncryptedFileUploaded.id = this.currentFileId;
            tL_inputEncryptedFileUploaded.key_fingerprint = this.fingerprint;
            this.delegate.didFinishUploadingFile(this, null, tL_inputEncryptedFileUploaded, this.key, this.iv);
            cleanup();
        }
        int i9 = this.currentType;
        if (i9 == 50331648) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            return;
        }
        if (i9 == 33554432) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            return;
        }
        if (i9 == 16777216) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            return;
        }
        if (i9 == 67108864) {
            String str3 = this.uploadingFilePath;
            if (str3 == null || !(str3.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
            } else {
                StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
            }
        }
    }

    public void lambda$startUploadRequest$7() {
        if (this.currentUploadRequetsCount < this.maxRequestsCount) {
            startUploadRequest();
        }
    }

    public void lambda$startUploadRequest$8() {
        Utilities.stageQueue.postRunnable(new FileUploadOperation$$ExternalSyntheticLambda1(this, 2));
    }

    public void lambda$startUploadRequest$9(int[] iArr) {
        this.uiRequestTokens.add(Integer.valueOf(iArr[0]));
    }

    private void startUploadRequest() {
        byte[] bArr;
        int i;
        byte[] bArr2;
        int i2;
        TLObject tLObject;
        int i3;
        boolean zIsInternalUri;
        boolean z;
        boolean z2;
        boolean z3;
        if (this.state != 1) {
            return;
        }
        try {
            this.started = true;
            if (this.stream == null) {
                File file = new File(this.uploadingFilePath);
                this.stream = new RandomAccessFile(file, "r");
                try {
                    zIsInternalUri = AndroidUtilities.isInternalUri(((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(this.stream.getFD(), null)).intValue());
                } catch (Throwable th) {
                    FileLog.e(th);
                    zIsInternalUri = false;
                }
                if (zIsInternalUri) {
                    throw new Exception("trying to upload internal file");
                }
                long j = this.estimatedSize;
                if (j != 0) {
                    this.totalFileSize = j;
                } else {
                    this.totalFileSize = file.length();
                }
                if (!this.forceSmallFile && this.totalFileSize > 10485760) {
                    this.isBigFile = true;
                }
                long j2 = MessagesController.getInstance(this.currentAccount).uploadMaxFileParts;
                if (AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium() && this.totalFileSize > 2097152000) {
                    j2 = MessagesController.getInstance(this.currentAccount).uploadMaxFilePartsPremium;
                }
                long j3 = j2 * 1024;
                int iMax = (int) Math.max(this.slowNetwork ? 32L : 128L, ((this.totalFileSize + j3) - 1) / j3);
                this.uploadChunkSize = iMax;
                if (1024 % iMax != 0) {
                    int i4 = 64;
                    while (this.uploadChunkSize > i4) {
                        i4 *= 2;
                    }
                    this.uploadChunkSize = i4;
                }
                this.maxRequestsCount = Math.max(1, (this.slowNetwork ? 32 : 2048) / this.uploadChunkSize);
                if (this.isEncrypted) {
                    this.freeRequestIvs = new ArrayList<>(this.maxRequestsCount);
                    for (int i5 = 0; i5 < this.maxRequestsCount; i5++) {
                        this.freeRequestIvs.add(new byte[32]);
                    }
                }
                this.uploadChunkSize *= 1024;
                calcTotalPartsCount();
                this.readBuffer = new byte[this.uploadChunkSize];
                StringBuilder sb = new StringBuilder();
                sb.append(this.uploadingFilePath);
                sb.append(this.isEncrypted ? "enc" : "");
                this.fileKey = Utilities.MD5(sb.toString());
                long j4 = this.preferences.getLong(this.fileKey + "_size", 0L);
                this.uploadStartTime = (int) (System.currentTimeMillis() / 1000);
                if (this.uploadFirstPartLater || this.nextPartFirst || this.estimatedSize != 0 || j4 != this.totalFileSize) {
                    bArr = null;
                    z = true;
                } else {
                    this.currentFileId = this.preferences.getLong(this.fileKey + "_id", 0L);
                    int i6 = this.preferences.getInt(this.fileKey + "_time", 0);
                    long j5 = this.preferences.getLong(this.fileKey + "_uploaded", 0L);
                    if (this.isEncrypted) {
                        String string = this.preferences.getString(this.fileKey + "_iv", null);
                        String string2 = this.preferences.getString(this.fileKey + "_key", null);
                        if (string != null && string2 != null) {
                            this.key = Utilities.hexToBytes(string2);
                            byte[] bArrHexToBytes = Utilities.hexToBytes(string);
                            this.iv = bArrHexToBytes;
                            byte[] bArr3 = this.key;
                            if (bArr3 != null && bArrHexToBytes != null && bArr3.length == 32 && bArrHexToBytes.length == 32) {
                                byte[] bArr4 = new byte[32];
                                this.ivChange = bArr4;
                                System.arraycopy(bArrHexToBytes, 0, bArr4, 0, 32);
                                z2 = false;
                            }
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 || i6 == 0) {
                        bArr = null;
                        z = true;
                    } else {
                        boolean z4 = this.isBigFile;
                        if ((z4 && i6 < this.uploadStartTime - 86400) || (!z4 && i6 < this.uploadStartTime - 5400.0f)) {
                            i6 = 0;
                        }
                        if (i6 != 0) {
                            if (j5 > 0) {
                                this.readBytesCount = j5;
                                this.currentPartNum = (int) (j5 / ((long) this.uploadChunkSize));
                                if (!z4) {
                                    int i7 = 0;
                                    while (true) {
                                        z3 = z2;
                                        if (i7 >= this.readBytesCount / ((long) this.uploadChunkSize)) {
                                            break;
                                        }
                                        int i8 = this.stream.read(this.readBuffer);
                                        int i9 = (!this.isEncrypted || i8 % 16 == 0) ? 0 : 16 - (i8 % 16);
                                        int i10 = i8 + i9;
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i10);
                                        if (i8 != this.uploadChunkSize || this.totalPartsCount == this.currentPartNum + 1) {
                                            this.isLastPart = true;
                                        }
                                        int i11 = 0;
                                        nativeByteBuffer.writeBytes(this.readBuffer, 0, i8);
                                        if (this.isEncrypted) {
                                            int i12 = 0;
                                            while (i12 < i9) {
                                                nativeByteBuffer.writeByte(i11);
                                                i12++;
                                                i11 = 0;
                                            }
                                            Utilities.aesIgeEncryption(nativeByteBuffer.buffer, this.key, this.ivChange, true, true, 0, i10);
                                        }
                                        nativeByteBuffer.reuse();
                                        i7++;
                                        z2 = z3;
                                    }
                                } else {
                                    z3 = z2;
                                    this.stream.seek(j5);
                                    if (this.isEncrypted) {
                                        bArr = null;
                                        String string3 = this.preferences.getString(this.fileKey + "_ivc", null);
                                        if (string3 != null) {
                                            byte[] bArrHexToBytes2 = Utilities.hexToBytes(string3);
                                            this.ivChange = bArrHexToBytes2;
                                            if (bArrHexToBytes2 == null || bArrHexToBytes2.length != 32) {
                                                this.readBytesCount = 0L;
                                                this.currentPartNum = 0;
                                            }
                                        } else {
                                            this.readBytesCount = 0L;
                                            this.currentPartNum = 0;
                                        }
                                    }
                                    z = z3;
                                }
                            } else {
                                bArr = null;
                            }
                            z = true;
                        } else {
                            z3 = z2;
                        }
                        bArr = null;
                        z = z3;
                    }
                }
                if (z) {
                    if (this.isEncrypted) {
                        byte[] bArr5 = new byte[32];
                        this.iv = bArr5;
                        this.key = new byte[32];
                        this.ivChange = new byte[32];
                        Utilities.random.nextBytes(bArr5);
                        Utilities.random.nextBytes(this.key);
                        System.arraycopy(this.iv, 0, this.ivChange, 0, 32);
                    }
                    this.currentFileId = Utilities.random.nextLong();
                    if (!this.nextPartFirst && !this.uploadFirstPartLater && this.estimatedSize == 0) {
                        storeFileUploadInfo();
                    }
                }
                if (this.isEncrypted) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        byte[] bArr6 = new byte[64];
                        System.arraycopy(this.key, 0, bArr6, 0, 32);
                        System.arraycopy(this.iv, 0, bArr6, 32, 32);
                        byte[] bArrDigest = messageDigest.digest(bArr6);
                        for (int i13 = 0; i13 < 4; i13++) {
                            this.fingerprint |= ((bArrDigest[i13] ^ bArrDigest[i13 + 4]) & 255) << (i13 * 8);
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                this.uploadedBytesCount = this.readBytesCount;
                this.lastSavedPartNum = this.currentPartNum;
                if (this.uploadFirstPartLater) {
                    if (this.isBigFile) {
                        this.stream.seek(this.uploadChunkSize);
                        this.readBytesCount = this.uploadChunkSize;
                    } else {
                        this.stream.seek(1024L);
                        this.readBytesCount = 1024L;
                    }
                    this.currentPartNum = 1;
                }
            } else {
                bArr = null;
            }
            if (this.estimatedSize == 0 || this.readBytesCount + ((long) this.uploadChunkSize) <= this.availableSize) {
                if (this.nextPartFirst) {
                    this.stream.seek(0L);
                    if (this.isBigFile) {
                        i = this.stream.read(this.readBuffer);
                        i3 = 0;
                    } else {
                        i3 = 0;
                        i = this.stream.read(this.readBuffer, 0, 1024);
                    }
                    this.currentPartNum = i3;
                } else {
                    i = this.stream.read(this.readBuffer);
                }
                if (i == -1) {
                    return;
                }
                int i14 = (!this.isEncrypted || i % 16 == 0) ? 0 : 16 - (i % 16);
                int i15 = i + i14;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i15);
                if (this.nextPartFirst || i != this.uploadChunkSize || (this.estimatedSize == 0 && this.totalPartsCount == this.currentPartNum + 1)) {
                    if (this.uploadFirstPartLater) {
                        this.nextPartFirst = true;
                        this.uploadFirstPartLater = false;
                    } else {
                        this.isLastPart = true;
                    }
                }
                int i16 = 0;
                nativeByteBuffer2.writeBytes(this.readBuffer, 0, i);
                if (this.isEncrypted) {
                    int i17 = 0;
                    while (i17 < i14) {
                        nativeByteBuffer2.writeByte(i16);
                        i17++;
                        i16 = 0;
                    }
                    Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, this.key, this.ivChange, true, true, 0, i15);
                    bArr2 = this.freeRequestIvs.get(0);
                    System.arraycopy(this.ivChange, 0, bArr2, 0, 32);
                    this.freeRequestIvs.remove(0);
                } else {
                    bArr2 = bArr;
                }
                if (this.isBigFile) {
                    TLRPC.TL_upload_saveBigFilePart tL_upload_saveBigFilePart = new TLRPC.TL_upload_saveBigFilePart();
                    i2 = this.currentPartNum;
                    tL_upload_saveBigFilePart.file_part = i2;
                    tL_upload_saveBigFilePart.file_id = this.currentFileId;
                    if (this.estimatedSize != 0) {
                        tL_upload_saveBigFilePart.file_total_parts = -1;
                    } else {
                        tL_upload_saveBigFilePart.file_total_parts = this.totalPartsCount;
                    }
                    tL_upload_saveBigFilePart.bytes = nativeByteBuffer2;
                    tLObject = tL_upload_saveBigFilePart;
                } else {
                    TLRPC.TL_upload_saveFilePart tL_upload_saveFilePart = new TLRPC.TL_upload_saveFilePart();
                    i2 = this.currentPartNum;
                    tL_upload_saveFilePart.file_part = i2;
                    tL_upload_saveFilePart.file_id = this.currentFileId;
                    tL_upload_saveFilePart.bytes = nativeByteBuffer2;
                    tLObject = tL_upload_saveFilePart;
                }
                TLObject tLObject2 = tLObject;
                final int i18 = i2;
                if (this.isLastPart && this.nextPartFirst) {
                    this.nextPartFirst = false;
                    this.currentPartNum = this.totalPartsCount - 1;
                    this.stream.seek(this.totalFileSize);
                }
                this.readBytesCount += (long) i;
                this.currentPartNum++;
                this.currentUploadRequetsCount++;
                final int i19 = this.requestNum;
                this.requestNum = i19 + 1;
                final long j6 = i18 + i;
                final int objectSize = tLObject2.getObjectSize() + 4;
                final int i20 = this.operationGuid;
                int i21 = this.slowNetwork ? 4 : ((i19 % 4) << 16) | 4;
                System.currentTimeMillis();
                final int[] iArr = new int[1];
                final byte[] bArr7 = bArr2;
                final int i22 = i;
                iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$startUploadRequest$6(i20, iArr, objectSize, bArr7, i19, i22, i18, j6, tLObject3, tL_error);
                    }
                }, null, new BillingController$$ExternalSyntheticLambda0(this, 4), this.forceSmallFile ? 4 : 0, Integer.MAX_VALUE, i21, true);
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb2 = new StringBuilder("debug_uploading:  send reqId ");
                    sb2.append(iArr[0]);
                    sb2.append(" ");
                    sb2.append(this.uploadingFilePath);
                    sb2.append(" file_part=");
                    sb2.append(i18);
                    sb2.append(" isBig=");
                    sb2.append(this.isBigFile);
                    sb2.append(" file_id=");
                    zzjj.m(sb2, this.currentFileId);
                }
                this.requestTokens.put(i19, iArr[0]);
                AndroidUtilities.runOnUIThread(new FileUploadOperation$$ExternalSyntheticLambda3(this, iArr, 1));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            this.state = 4;
            this.delegate.didFailedUploadingFile(this);
            cleanup();
        }
    }

    private void storeFileUploadInfo() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putInt(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.fileKey, "_time"), this.uploadStartTime);
        editorEdit.putLong(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.fileKey, "_size"), this.totalFileSize);
        editorEdit.putLong(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.fileKey, "_id"), this.currentFileId);
        editorEdit.remove(this.fileKey + "_uploaded");
        if (this.isEncrypted) {
            editorEdit.putString(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.fileKey, "_iv"), Utilities.bytesToHex(this.iv));
            editorEdit.putString(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.fileKey, "_ivc"), Utilities.bytesToHex(this.ivChange));
            editorEdit.putString(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.fileKey, "_key"), Utilities.bytesToHex(this.key));
        }
        editorEdit.commit();
    }

    public void cancel() {
        if (this.state == 3) {
            return;
        }
        this.state = 2;
        Utilities.stageQueue.postRunnable(new FileUploadOperation$$ExternalSyntheticLambda1(this, 1));
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
        this.delegate.didFailedUploadingFile(this);
        cleanup();
    }

    public void checkNewDataAvailable(long j, long j2, Float f) {
        Utilities.stageQueue.postRunnable(new LaunchActivity$$ExternalSyntheticLambda37(this, f, j2, j));
    }

    public long getTotalFileSize() {
        return this.totalFileSize;
    }

    public void onNetworkChanged(boolean z) {
        if (this.state != 1) {
            return;
        }
        Utilities.stageQueue.postRunnable(new FileLoader$$ExternalSyntheticLambda1(2, this, z));
        AndroidUtilities.runOnUIThread(new FileUploadOperation$$ExternalSyntheticLambda1(this, 3));
    }

    public void setDelegate(FileUploadOperationDelegate fileUploadOperationDelegate) {
        this.delegate = fileUploadOperationDelegate;
    }

    public void setForceSmallFile() {
        this.forceSmallFile = true;
    }

    public void start() {
        if (this.state != 0) {
            return;
        }
        this.state = 1;
        AutoDeleteMediaTask.lockFile(this.uploadingFilePath);
        Utilities.stageQueue.postRunnable(new FileUploadOperation$$ExternalSyntheticLambda1(this, 0));
    }
}
