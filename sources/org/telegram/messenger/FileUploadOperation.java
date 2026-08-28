package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
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

    public FileUploadOperation(int i9, String str, boolean z10, long j10, int i10) {
        boolean z11;
        this.currentAccount = i9;
        this.uploadingFilePath = str;
        this.isEncrypted = z10;
        this.estimatedSize = j10;
        this.currentType = i10;
        if (j10 != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.uploadFirstPartLater = z11;
    }

    private void calcTotalPartsCount() {
        if (this.uploadFirstPartLater) {
            if (this.isBigFile) {
                long j10 = this.totalFileSize;
                int i9 = this.uploadChunkSize;
                this.totalPartsCount = ((int) ((((j10 - i9) + i9) - 1) / i9)) + 1;
                return;
            }
            int i10 = this.uploadChunkSize;
            this.totalPartsCount = ((int) ((((this.totalFileSize - 1024) + i10) - 1) / i10)) + 1;
            return;
        }
        long j11 = this.totalFileSize;
        int i11 = this.uploadChunkSize;
        this.totalPartsCount = (int) (((j11 + i11) - 1) / i11);
    }

    private void cleanup() {
        if (this.preferences == null) {
            this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("uploadinfo", 0);
        }
        SharedPreferences.Editor edit = this.preferences.edit();
        SharedPreferences.Editor remove = edit.remove(this.fileKey + "_time");
        SharedPreferences.Editor remove2 = remove.remove(this.fileKey + "_size");
        SharedPreferences.Editor remove3 = remove2.remove(this.fileKey + "_uploaded");
        SharedPreferences.Editor remove4 = remove3.remove(this.fileKey + "_id");
        SharedPreferences.Editor remove5 = remove4.remove(this.fileKey + "_iv");
        SharedPreferences.Editor remove6 = remove5.remove(this.fileKey + "_key");
        remove6.remove(this.fileKey + "_ivc").commit();
        try {
            RandomAccessFile randomAccessFile = this.stream;
            if (randomAccessFile != null) {
                randomAccessFile.close();
                this.stream = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
    }

    public void lambda$cancel$3() {
        for (int i9 = 0; i9 < this.requestTokens.size(); i9++) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestTokens.valueAt(i9), true);
        }
    }

    public void lambda$checkNewDataAvailable$4(java.lang.Float r7, long r8, long r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileUploadOperation.lambda$checkNewDataAvailable$4(java.lang.Float, long, long):void");
    }

    public void lambda$onNetworkChanged$1(boolean z10) {
        int i9;
        if (this.slowNetwork != z10) {
            this.slowNetwork = z10;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("network changed to slow = " + this.slowNetwork);
            }
            int i10 = 0;
            while (true) {
                i9 = 1;
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
            if (!this.slowNetwork) {
                i9 = 8;
            }
            for (int i11 = 0; i11 < i9; i11++) {
                startUploadRequest();
            }
        }
    }

    public void lambda$onNetworkChanged$2() {
        this.uiRequestTokens.clear();
    }

    public void lambda$start$0() {
        int i9;
        this.preferences = ApplicationLoader.applicationContext.getSharedPreferences("uploadinfo", 0);
        this.slowNetwork = ApplicationLoader.isConnectionSlow();
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("start upload on slow network = " + this.slowNetwork);
        }
        if (this.slowNetwork) {
            i9 = 1;
        } else {
            i9 = 8;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            startUploadRequest();
        }
    }

    public void lambda$startUploadRequest$5(int[] iArr) {
        this.uiRequestTokens.remove(Integer.valueOf(iArr[0]));
    }

    public void lambda$startUploadRequest$6(int i9, int[] iArr, int i10, byte[] bArr, int i11, int i12, int i13, long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        int currentNetworkType;
        long j11;
        TLRPC.InputEncryptedFile tL_inputEncryptedFileUploaded;
        TLRPC.InputFile tL_inputFile;
        byte[] bArr2 = bArr;
        if (i9 == this.operationGuid) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("debug_uploading:  response reqId ");
                sb2.append(iArr[0]);
                sb2.append(" time");
                j3.r0.x(this.uploadingFilePath, sb2);
            }
            if (tLObject != null) {
                currentNetworkType = tLObject.networkType;
            } else {
                currentNetworkType = ApplicationLoader.getCurrentNetworkType();
            }
            int i14 = this.currentType;
            if (i14 == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 3, i10);
            } else if (i14 == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 2, i10);
            } else if (i14 == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 4, i10);
            } else if (i14 == 67108864) {
                String str = this.uploadingFilePath;
                if (str != null && (str.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 7, i10);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementSentBytesCount(currentNetworkType, 5, i10);
                }
            }
            if (bArr2 != null) {
                this.freeRequestIvs.add(bArr2);
            }
            this.requestTokens.delete(i11);
            AndroidUtilities.runOnUIThread(new r3(this, iArr, 0));
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                if (this.state == 1) {
                    this.uploadedBytesCount += i12;
                    long j12 = this.estimatedSize;
                    if (j12 != 0) {
                        j11 = Math.max(this.availableSize, j12);
                    } else {
                        j11 = this.totalFileSize;
                    }
                    this.delegate.didChangedUploadProgress(this, this.uploadedBytesCount, j11);
                    int i15 = this.currentUploadRequetsCount - 1;
                    this.currentUploadRequetsCount = i15;
                    if (this.isLastPart && i15 == 0 && this.state == 1) {
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
                        int i16 = this.currentType;
                        if (i16 == 50331648) {
                            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
                            return;
                        } else if (i16 == 33554432) {
                            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
                            return;
                        } else if (i16 == 16777216) {
                            StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
                            return;
                        } else if (i16 == 67108864) {
                            String str3 = this.uploadingFilePath;
                            if (str3 != null && (str3.toLowerCase().endsWith("mp3") || this.uploadingFilePath.toLowerCase().endsWith("m4a"))) {
                                StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
                                return;
                            } else {
                                StatsController.getInstance(this.currentAccount).incrementSentItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (i15 < this.maxRequestsCount) {
                        if (this.estimatedSize == 0 && !this.uploadFirstPartLater && !this.nextPartFirst) {
                            if (this.saveInfoTimes >= 4) {
                                this.saveInfoTimes = 0;
                            }
                            int i17 = this.lastSavedPartNum;
                            if (i13 == i17) {
                                this.lastSavedPartNum = i17 + 1;
                                long j13 = j10;
                                while (true) {
                                    UploadCachedResult uploadCachedResult = this.cachedResults.get(this.lastSavedPartNum);
                                    if (uploadCachedResult == null) {
                                        break;
                                    }
                                    j13 = uploadCachedResult.bytesOffset;
                                    bArr2 = uploadCachedResult.iv;
                                    this.cachedResults.remove(this.lastSavedPartNum);
                                    this.lastSavedPartNum++;
                                }
                                boolean z10 = this.isBigFile;
                                if ((z10 && j13 % 1048576 == 0) || (!z10 && this.saveInfoTimes == 0)) {
                                    SharedPreferences.Editor edit = this.preferences.edit();
                                    edit.putLong(aa.d.r(new StringBuilder(), this.fileKey, "_uploaded"), j13);
                                    if (this.isEncrypted) {
                                        edit.putString(aa.d.r(new StringBuilder(), this.fileKey, "_ivc"), Utilities.bytesToHex(bArr2));
                                    }
                                    edit.commit();
                                }
                            } else {
                                UploadCachedResult uploadCachedResult2 = new UploadCachedResult();
                                uploadCachedResult2.bytesOffset = j10;
                                if (bArr2 != null) {
                                    uploadCachedResult2.iv = new byte[32];
                                    System.arraycopy(bArr2, 0, uploadCachedResult2.iv, 0, 32);
                                }
                                this.cachedResults.put(i13, uploadCachedResult2);
                            }
                            this.saveInfoTimes++;
                        }
                        startUploadRequest();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            }
            this.state = 4;
            this.delegate.didFailedUploadingFile(this);
            cleanup();
        }
    }

    public void lambda$startUploadRequest$7() {
        if (this.currentUploadRequetsCount < this.maxRequestsCount) {
            startUploadRequest();
        }
    }

    public void lambda$startUploadRequest$8() {
        Utilities.stageQueue.postRunnable(new q3(this, 2));
    }

    public void lambda$startUploadRequest$9(int[] iArr) {
        this.uiRequestTokens.add(Integer.valueOf(iArr[0]));
    }

    private void startUploadRequest() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.FileUploadOperation.startUploadRequest():void");
    }

    private void storeFileUploadInfo() {
        SharedPreferences.Editor edit = this.preferences.edit();
        edit.putInt(aa.d.r(new StringBuilder(), this.fileKey, "_time"), this.uploadStartTime);
        edit.putLong(aa.d.r(new StringBuilder(), this.fileKey, "_size"), this.totalFileSize);
        edit.putLong(aa.d.r(new StringBuilder(), this.fileKey, "_id"), this.currentFileId);
        edit.remove(this.fileKey + "_uploaded");
        if (this.isEncrypted) {
            edit.putString(aa.d.r(new StringBuilder(), this.fileKey, "_iv"), Utilities.bytesToHex(this.iv));
            edit.putString(aa.d.r(new StringBuilder(), this.fileKey, "_ivc"), Utilities.bytesToHex(this.ivChange));
            edit.putString(aa.d.r(new StringBuilder(), this.fileKey, "_key"), Utilities.bytesToHex(this.key));
        }
        edit.commit();
    }

    public void cancel() {
        if (this.state == 3) {
            return;
        }
        this.state = 2;
        Utilities.stageQueue.postRunnable(new q3(this, 1));
        AutoDeleteMediaTask.unlockFile(this.uploadingFilePath);
        this.delegate.didFailedUploadingFile(this);
        cleanup();
    }

    public void checkNewDataAvailable(long j10, long j11, Float f10) {
        Utilities.stageQueue.postRunnable(new e5.y(this, f10, j11, j10, 4));
    }

    public long getTotalFileSize() {
        return this.totalFileSize;
    }

    public void onNetworkChanged(boolean z10) {
        if (this.state != 1) {
            return;
        }
        Utilities.stageQueue.postRunnable(new eh.f(14, this, z10));
        AndroidUtilities.runOnUIThread(new q3(this, 3));
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
        Utilities.stageQueue.postRunnable(new q3(this, 0));
    }
}
