package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.File;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

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
        void didChangedUploadProgress(FileUploadOperation fileUploadOperation, long j10, long j11);

        void didFailedUploadingFile(FileUploadOperation fileUploadOperation);

        void didFinishUploadingFile(FileUploadOperation fileUploadOperation, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2);
    }

    public static class UploadCachedResult {
        private long bytesOffset;
        private byte[] iv;

        private UploadCachedResult() {
        }
    }

    public FileUploadOperation(int i10, String str, boolean z10, long j10, int i11) {
        this.currentAccount = i10;
        this.uploadingFilePath = str;
        this.isEncrypted = z10;
        this.estimatedSize = j10;
        this.currentType = i11;
        this.uploadFirstPartLater = (j10 == 0 || z10) ? false : true;
    }

    private void calcTotalPartsCount() {
        if (!this.uploadFirstPartLater) {
            long j10 = this.totalFileSize;
            int i10 = this.uploadChunkSize;
            this.totalPartsCount = (int) (((j10 + ((long) i10)) - 1) / ((long) i10));
        } else if (this.isBigFile) {
            long j11 = this.totalFileSize;
            int i11 = this.uploadChunkSize;
            this.totalPartsCount = ((int) ((((j11 - ((long) i11)) + ((long) i11)) - 1) / ((long) i11))) + 1;
        } else {
            long j12 = this.totalFileSize - 1024;
            int i12 = this.uploadChunkSize;
            this.totalPartsCount = ((int) (((j12 + ((long) i12)) - 1) / ((long) i12))) + 1;
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
    }

    public void lambda$cancel$3() {
        for (int i10 = 0; i10 < this.requestTokens.size(); i10++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i10), true);
        }
    }

    public void lambda$checkNewDataAvailable$4(Float f10, long j10, long j11) {
        if (f10 != null && this.estimatedSize != 0 && j10 == 0) {
            boolean z10 = false;
            boolean z11 = true;
            if (f10.floatValue() > 0.75f) {
                boolean[] zArr = this.recalculatedEstimatedSize;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z10 = true;
                }
            }
            if (f10.floatValue() > 0.95f) {
                boolean[] zArr2 = this.recalculatedEstimatedSize;
                if (zArr2[1]) {
                    z11 = z10;
                } else {
                    zArr2[1] = true;
                }
            } else {
                z11 = z10;
            }
            if (z11) {
                this.estimatedSize = (long) (j11 / f10.floatValue());
            }
        }
        if (this.estimatedSize != 0 && j10 != 0) {
            this.estimatedSize = 0L;
            this.totalFileSize = j10;
            calcTotalPartsCount();
            if (!this.uploadFirstPartLater && this.started) {
                storeFileUploadInfo();
            }
        }
        if (j10 <= 0) {
            j10 = j11;
        }
        this.availableSize = j10;
        if (this.currentUploadRequetsCount < this.maxRequestsCount) {
            startUploadRequest();
        }
    }

    public void lambda$onNetworkChanged$1(boolean z10) {
        if (this.slowNetwork != z10) {
            this.slowNetwork = z10;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("network changed to slow = " + this.slowNetwork);
            }
            int i10 = 0;
            while (true) {
                if (i10 >= this.requestTokens.size()) {
                    break;
                }
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i10), true);
                i10++;
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
            int i11 = this.slowNetwork ? 1 : 8;
            for (int i12 = 0; i12 < i11; i12++) {
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
        int i10 = this.slowNetwork ? 1 : 8;
        for (int i11 = 0; i11 < i10; i11++) {
            startUploadRequest();
        }
    }

    public void lambda$startUploadRequest$5(int[] iArr) {
        this.uiRequestTokens.remove(Integer.valueOf(iArr[0]));
    }

    public void lambda$startUploadRequest$6(int i10, int[] iArr, int i11, byte[] bArr, int i12, int i13, int i14, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.InputEncryptedFile tL_inputEncryptedFileUploaded;
        TLRPC.InputFile tL_inputFile;
        byte[] bArr2 = bArr;
        if (i10 != this.operationGuid) {
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("debug_uploading:  response reqId ");
            sb2.append(iArr[0]);
            sb2.append(" time");
            org.telegram.ui.Cells.pa.v(this.uploadingFilePath, sb2);
        }
        int currentNetworkType = tLObject != null ? tLObject.networkType : ApplicationLoader.getCurrentNetworkType();
        int i15 = this.currentType;
        if (i15 == 50331648) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 3, i11);
        } else if (i15 == 33554432) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 2, i11);
        } else if (i15 == 16777216) {
            StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 4, i11);
        } else if (i15 == 67108864) {
            String str = this.uploadingFilePath;
            if (str == null || !(str.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 5, i11);
            } else {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 7, i11);
            }
        }
        if (bArr2 != null) {
            this.freeRequestIvs.add(bArr2);
        }
        this.requestTokens.delete(i12);
        AndroidUtilities.runOnUIThread(new t3(this, iArr, 0));
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            this.state = 4;
            this.delegate.didFailedUploadingFile(this);
            cleanup();
            return;
        }
        if (this.state != 1) {
            return;
        }
        this.uploadedBytesCount += (long) i13;
        long j11 = this.estimatedSize;
        this.delegate.didChangedUploadProgress(this, this.uploadedBytesCount, j11 != 0 ? Math.max(this.availableSize, j11) : this.totalFileSize);
        int i16 = this.currentUploadRequetsCount - 1;
        this.currentUploadRequetsCount = i16;
        if (!this.isLastPart || i16 != 0 || this.state != 1) {
            if (i16 < this.maxRequestsCount) {
                if (this.estimatedSize == 0 && !this.uploadFirstPartLater && !this.nextPartFirst) {
                    if (this.saveInfoTimes >= 4) {
                        this.saveInfoTimes = 0;
                    }
                    int i17 = this.lastSavedPartNum;
                    if (i14 == i17) {
                        this.lastSavedPartNum = i17 + 1;
                        long j12 = j10;
                        while (true) {
                            UploadCachedResult uploadCachedResult = this.cachedResults.get(this.lastSavedPartNum);
                            if (uploadCachedResult == null) {
                                break;
                            }
                            j12 = uploadCachedResult.bytesOffset;
                            bArr2 = uploadCachedResult.iv;
                            this.cachedResults.remove(this.lastSavedPartNum);
                            this.lastSavedPartNum++;
                        }
                        boolean z10 = this.isBigFile;
                        if ((z10 && j12 % 1048576 == 0) || (!z10 && this.saveInfoTimes == 0)) {
                            SharedPreferences.Editor editorEdit = this.preferences.edit();
                            editorEdit.putLong(a9.p.p(new StringBuilder(), this.fileKey, "_uploaded"), j12);
                            if (this.isEncrypted) {
                                editorEdit.putString(a9.p.p(new StringBuilder(), this.fileKey, "_ivc"), Utilities.bytesToHex(bArr2));
                            }
                            editorEdit.commit();
                        }
                    } else {
                        UploadCachedResult uploadCachedResult2 = new UploadCachedResult();
                        uploadCachedResult2.bytesOffset = j10;
                        if (bArr2 != null) {
                            uploadCachedResult2.iv = new byte[32];
                            System.arraycopy(bArr2, 0, uploadCachedResult2.iv, 0, 32);
                        }
                        this.cachedResults.put(i14, uploadCachedResult2);
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
            tL_inputFile.f22394id = this.currentFileId;
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
            tL_inputEncryptedFileUploaded.f22393id = this.currentFileId;
            tL_inputEncryptedFileUploaded.key_fingerprint = this.fingerprint;
            this.delegate.didFinishUploadingFile(this, null, tL_inputEncryptedFileUploaded, this.key, this.iv);
            cleanup();
        }
        int i18 = this.currentType;
        if (i18 == 50331648) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            return;
        }
        if (i18 == 33554432) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            return;
        }
        if (i18 == 16777216) {
            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            return;
        }
        if (i18 == 67108864) {
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
        Utilities.stageQueue.postRunnable(new s3(this, 2));
    }

    public void lambda$startUploadRequest$9(int[] iArr) {
        this.uiRequestTokens.add(Integer.valueOf(iArr[0]));
    }

    private void startUploadRequest() {
        byte[] bArr;
        int i10;
        byte[] bArr2;
        int i11;
        TLObject tLObject;
        int i12;
        boolean zIsInternalUri;
        boolean z10;
        boolean z11;
        boolean z12;
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
                long j10 = this.estimatedSize;
                if (j10 != 0) {
                    this.totalFileSize = j10;
                } else {
                    this.totalFileSize = file.length();
                }
                if (!this.forceSmallFile && this.totalFileSize > 10485760) {
                    this.isBigFile = true;
                }
                long j11 = MessagesController.getInstance(this.currentAccount).uploadMaxFileParts;
                if (AccountInstance.getInstance(this.currentAccount).getUserConfig().isPremium() && this.totalFileSize > 2097152000) {
                    j11 = MessagesController.getInstance(this.currentAccount).uploadMaxFilePartsPremium;
                }
                long j12 = j11 * 1024;
                int iMax = (int) Math.max(this.slowNetwork ? 32L : 128L, ((this.totalFileSize + j12) - 1) / j12);
                this.uploadChunkSize = iMax;
                if (1024 % iMax != 0) {
                    int i13 = 64;
                    while (this.uploadChunkSize > i13) {
                        i13 *= 2;
                    }
                    this.uploadChunkSize = i13;
                }
                this.maxRequestsCount = Math.max(1, (this.slowNetwork ? 32 : 2048) / this.uploadChunkSize);
                if (this.isEncrypted) {
                    this.freeRequestIvs = new ArrayList<>(this.maxRequestsCount);
                    for (int i14 = 0; i14 < this.maxRequestsCount; i14++) {
                        this.freeRequestIvs.add(new byte[32]);
                    }
                }
                this.uploadChunkSize *= 1024;
                calcTotalPartsCount();
                this.readBuffer = new byte[this.uploadChunkSize];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.uploadingFilePath);
                sb2.append(this.isEncrypted ? "enc" : "");
                this.fileKey = Utilities.MD5(sb2.toString());
                long j13 = this.preferences.getLong(this.fileKey + "_size", 0L);
                this.uploadStartTime = (int) (System.currentTimeMillis() / 1000);
                if (this.uploadFirstPartLater || this.nextPartFirst || this.estimatedSize != 0 || j13 != this.totalFileSize) {
                    bArr = null;
                    z10 = true;
                } else {
                    this.currentFileId = this.preferences.getLong(this.fileKey + "_id", 0L);
                    int i15 = this.preferences.getInt(this.fileKey + "_time", 0);
                    long j14 = this.preferences.getLong(this.fileKey + "_uploaded", 0L);
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
                                z11 = false;
                            }
                        }
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11 || i15 == 0) {
                        bArr = null;
                        z10 = true;
                    } else {
                        boolean z13 = this.isBigFile;
                        if ((z13 && i15 < this.uploadStartTime - 86400) || (!z13 && i15 < this.uploadStartTime - 5400.0f)) {
                            i15 = 0;
                        }
                        if (i15 != 0) {
                            if (j14 > 0) {
                                this.readBytesCount = j14;
                                this.currentPartNum = (int) (j14 / ((long) this.uploadChunkSize));
                                if (!z13) {
                                    int i16 = 0;
                                    while (true) {
                                        z12 = z11;
                                        if (i16 >= this.readBytesCount / ((long) this.uploadChunkSize)) {
                                            break;
                                        }
                                        int i17 = this.stream.read(this.readBuffer);
                                        int i18 = (!this.isEncrypted || i17 % 16 == 0) ? 0 : 16 - (i17 % 16);
                                        int i19 = i17 + i18;
                                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(i19);
                                        if (i17 != this.uploadChunkSize || this.totalPartsCount == this.currentPartNum + 1) {
                                            this.isLastPart = true;
                                        }
                                        int i20 = 0;
                                        nativeByteBuffer.writeBytes(this.readBuffer, 0, i17);
                                        if (this.isEncrypted) {
                                            int i21 = 0;
                                            while (i21 < i18) {
                                                nativeByteBuffer.writeByte(i20);
                                                i21++;
                                                i20 = 0;
                                            }
                                            Utilities.aesIgeEncryption(nativeByteBuffer.buffer, this.key, this.ivChange, true, true, 0, i19);
                                        }
                                        nativeByteBuffer.reuse();
                                        i16++;
                                        z11 = z12;
                                    }
                                } else {
                                    z12 = z11;
                                    this.stream.seek(j14);
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
                                    z10 = z12;
                                }
                            } else {
                                bArr = null;
                            }
                            z10 = true;
                        } else {
                            z12 = z11;
                        }
                        bArr = null;
                        z10 = z12;
                    }
                }
                if (z10) {
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
                        for (int i22 = 0; i22 < 4; i22++) {
                            this.fingerprint |= ((bArrDigest[i22] ^ bArrDigest[i22 + 4]) & 255) << (i22 * 8);
                        }
                    } catch (Exception e9) {
                        FileLog.e(e9);
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
                        i10 = this.stream.read(this.readBuffer);
                        i12 = 0;
                    } else {
                        i12 = 0;
                        i10 = this.stream.read(this.readBuffer, 0, 1024);
                    }
                    this.currentPartNum = i12;
                } else {
                    i10 = this.stream.read(this.readBuffer);
                }
                if (i10 == -1) {
                    return;
                }
                int i23 = (!this.isEncrypted || i10 % 16 == 0) ? 0 : 16 - (i10 % 16);
                int i24 = i10 + i23;
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(i24);
                if (this.nextPartFirst || i10 != this.uploadChunkSize || (this.estimatedSize == 0 && this.totalPartsCount == this.currentPartNum + 1)) {
                    if (this.uploadFirstPartLater) {
                        this.nextPartFirst = true;
                        this.uploadFirstPartLater = false;
                    } else {
                        this.isLastPart = true;
                    }
                }
                int i25 = 0;
                nativeByteBuffer2.writeBytes(this.readBuffer, 0, i10);
                if (this.isEncrypted) {
                    int i26 = 0;
                    while (i26 < i23) {
                        nativeByteBuffer2.writeByte(i25);
                        i26++;
                        i25 = 0;
                    }
                    Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, this.key, this.ivChange, true, true, 0, i24);
                    bArr2 = this.freeRequestIvs.get(0);
                    System.arraycopy(this.ivChange, 0, bArr2, 0, 32);
                    this.freeRequestIvs.remove(0);
                } else {
                    bArr2 = bArr;
                }
                if (this.isBigFile) {
                    TLRPC.TL_upload_saveBigFilePart tL_upload_saveBigFilePart = new TLRPC.TL_upload_saveBigFilePart();
                    i11 = this.currentPartNum;
                    tL_upload_saveBigFilePart.file_part = i11;
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
                    i11 = this.currentPartNum;
                    tL_upload_saveFilePart.file_part = i11;
                    tL_upload_saveFilePart.file_id = this.currentFileId;
                    tL_upload_saveFilePart.bytes = nativeByteBuffer2;
                    tLObject = tL_upload_saveFilePart;
                }
                TLObject tLObject2 = tLObject;
                final int i27 = i11;
                if (this.isLastPart && this.nextPartFirst) {
                    this.nextPartFirst = false;
                    this.currentPartNum = this.totalPartsCount - 1;
                    this.stream.seek(this.totalFileSize);
                }
                this.readBytesCount += (long) i10;
                this.currentPartNum++;
                this.currentUploadRequetsCount++;
                final int i28 = this.requestNum;
                this.requestNum = i28 + 1;
                final long j15 = i27 + i10;
                final int objectSize = tLObject2.getObjectSize() + 4;
                final int i29 = this.operationGuid;
                int i30 = this.slowNetwork ? 4 : ((i28 % 4) << 16) | 4;
                System.currentTimeMillis();
                final int[] iArr = new int[1];
                final byte[] bArr7 = bArr2;
                final int i31 = i10;
                iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject2, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                        this.f21679a.lambda$startUploadRequest$6(i29, iArr, objectSize, bArr7, i28, i31, i27, j15, tLObject3, tL_error);
                    }
                }, null, new d(this, 4), this.forceSmallFile ? 4 : 0, Integer.MAX_VALUE, i30, true);
                if (BuildVars.LOGS_ENABLED) {
                    StringBuilder sb3 = new StringBuilder("debug_uploading:  send reqId ");
                    sb3.append(iArr[0]);
                    sb3.append(" ");
                    sb3.append(this.uploadingFilePath);
                    sb3.append(" file_part=");
                    sb3.append(i27);
                    sb3.append(" isBig=");
                    sb3.append(this.isBigFile);
                    sb3.append(" file_id=");
                    i0.a.y(sb3, this.currentFileId);
                }
                this.requestTokens.put(i28, iArr[0]);
                AndroidUtilities.runOnUIThread(new t3(this, iArr, 1));
            }
        } catch (Exception e10) {
            FileLog.e(e10);
            this.state = 4;
            this.delegate.didFailedUploadingFile(this);
            cleanup();
        }
    }

    private void storeFileUploadInfo() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        editorEdit.putInt(a9.p.p(new StringBuilder(), this.fileKey, "_time"), this.uploadStartTime);
        editorEdit.putLong(a9.p.p(new StringBuilder(), this.fileKey, "_size"), this.totalFileSize);
        editorEdit.putLong(a9.p.p(new StringBuilder(), this.fileKey, "_id"), this.currentFileId);
        editorEdit.remove(this.fileKey + "_uploaded");
        if (this.isEncrypted) {
            editorEdit.putString(a9.p.p(new StringBuilder(), this.fileKey, "_iv"), Utilities.bytesToHex(this.iv));
            editorEdit.putString(a9.p.p(new StringBuilder(), this.fileKey, "_ivc"), Utilities.bytesToHex(this.ivChange));
            editorEdit.putString(a9.p.p(new StringBuilder(), this.fileKey, "_key"), Utilities.bytesToHex(this.key));
        }
        editorEdit.commit();
    }

    public void cancel() {
        if (this.state == 3) {
            return;
        }
        this.state = 2;
        Utilities.stageQueue.postRunnable(new s3(this, 1));
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
        this.delegate.didFailedUploadingFile(this);
        cleanup();
    }

    public void checkNewDataAvailable(long j10, long j11, Float f10) {
        Utilities.stageQueue.postRunnable(new e5.w(this, f10, j11, j10, 4));
    }

    public long getTotalFileSize() {
        return this.totalFileSize;
    }

    public void onNetworkChanged(boolean z10) {
        if (this.state != 1) {
            return;
        }
        Utilities.stageQueue.postRunnable(new fh.f(14, this, z10));
        AndroidUtilities.runOnUIThread(new s3(this, 3));
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
        Utilities.stageQueue.postRunnable(new s3(this, 0));
    }
}
