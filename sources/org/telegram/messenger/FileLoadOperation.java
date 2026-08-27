package org.telegram.messenger;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;

public class FileLoadOperation {
    private static final int FINISH_CODE_DEFAULT = 0;
    private static final int FINISH_CODE_FILE_ALREADY_EXIST = 1;
    public static gf.d0 filesQueueByteBuffer = null;
    private static int globalRequestPointer = 0;
    private static final int preloadMaxBytes = 2097152;
    private static final int stateCanceled = 4;
    private static final int stateCancelling = 5;
    private static final int stateDownloading = 1;
    private static final int stateFailed = 2;
    private static final int stateFinished = 3;
    private static final int stateIdle = 0;
    private final boolean FULL_LOGS;
    private boolean allowDisordererFileSave;
    private int bigFileSizeFrom;
    private long bytesCountPadding;
    private File cacheFileFinal;
    private boolean cacheFileFinalReady;
    private File cacheFileGzipTemp;
    private File cacheFileParts;
    private File cacheFilePreload;
    private File cacheFileTemp;
    private File cacheIvTemp;
    private final Runnable cancelAfterNoStreamListeners;
    private ArrayList<RequestInfo> cancelledRequestInfos;
    public volatile boolean caughtPremiumFloodWait;
    private byte[] cdnCheckBytes;
    private int cdnChunkCheckSize;
    private int cdnDatacenterId;
    private HashMap<Long, TLRPC.TL_fileHash> cdnHashes;
    private byte[] cdnIv;
    private byte[] cdnKey;
    private byte[] cdnToken;
    private volatile boolean closeFilePartsStreamOnWriteEnd;
    public int currentAccount;
    private int currentDownloadChunkSize;
    private int currentMaxDownloadRequests;
    private int currentType;
    private int datacenterId;
    private ArrayList<RequestInfo> delayedRequestInfos;
    private FileLoadOperationDelegate delegate;
    private long documentId;
    private int downloadChunkSize;
    private int downloadChunkSizeAnimation;
    private int downloadChunkSizeBig;
    private long downloadedBytes;
    private boolean encryptFile;
    private byte[] encryptIv;
    private byte[] encryptKey;
    private String ext;
    private FilePathDatabase.FileMeta fileMetadata;
    private String fileName;
    private RandomAccessFile fileOutputStream;
    private RandomAccessFile filePartsStream;
    private RandomAccessFile fileReadStream;
    private Runnable fileWriteRunnable;
    private RandomAccessFile fiv;
    private boolean forceSmallChunk;
    private long foundMoovSize;
    private int initialDatacenterId;
    private boolean isCdn;
    private boolean isForceRequest;
    private boolean isPreloadVideoOperation;
    public boolean isStory;
    private boolean isStream;
    private byte[] iv;
    private byte[] key;
    protected long lastProgressUpdateTime;
    protected TLRPC.InputFileLocation location;
    private int maxCdnParts;
    private int maxDownloadRequests;
    private int maxDownloadRequestsAnimation;
    private int maxDownloadRequestsBig;
    private int moovFound;
    private long nextAtomOffset;
    private boolean nextPartWasPreloaded;
    private long nextPreloadDownloadOffset;
    private ArrayList<Range> notCheckedCdnRanges;
    private ArrayList<Range> notLoadedBytesRanges;
    private volatile ArrayList<Range> notLoadedBytesRangesCopy;
    private ArrayList<Range> notRequestedBytesRanges;
    public Object parentObject;
    public FilePathDatabase.PathData pathSaveData;
    private volatile boolean paused;
    public boolean preFinished;
    private boolean preloadFinished;
    private long preloadNotRequestedBytesCount;
    private int preloadPrefixSize;
    private RandomAccessFile preloadStream;
    private int preloadStreamFileOffset;
    private byte[] preloadTempBuffer;
    private int preloadTempBufferCount;
    private HashMap<Long, PreloadRange> preloadedBytesRanges;
    private int priority;
    private FileLoaderPriorityQueue priorityQueue;
    private RequestInfo priorityRequestInfo;
    private int renameRetryCount;
    public ArrayList<RequestInfo> requestInfos;
    private long requestedBytesCount;
    private HashMap<Long, Integer> requestedPreloadedBytesRanges;
    private boolean requestedReference;
    private boolean requestingCdnOffsets;
    protected boolean requestingReference;
    private int requestsCount;
    private boolean reuploadingCdn;
    private long startTime;
    private boolean started;
    private volatile int state;
    private String storeFileName;
    private File storePath;
    FileLoadOperationStream stream;
    private ArrayList<FileLoadOperationStream> streamListeners;
    long streamOffset;
    boolean streamPriority;
    private long streamPriorityStartOffset;
    private long streamStartOffset;
    private boolean supportsPreloading;
    private File tempPath;
    public long totalBytesCount;
    private int totalPreloadedBytes;
    long totalTime;
    public final ArrayList<Integer> uiRequestTokens;
    private boolean ungzip;
    private WebFile webFile;
    private TLRPC.InputWebFileLocation webLocation;
    private volatile boolean writingToFilePartsStream;
    public static volatile DispatchQueue filesQueue = new DispatchQueue("writeFileQueue");
    private static final Object lockObject = new Object();

    public interface FileLoadOperationDelegate {
        void didChangedLoadProgress(FileLoadOperation fileLoadOperation, long j10, long j11);

        void didFailedLoadingFile(FileLoadOperation fileLoadOperation, int i10);

        void didFinishLoadingFile(FileLoadOperation fileLoadOperation, File file);

        void didPreFinishLoading(FileLoadOperation fileLoadOperation, File file);

        boolean hasAnotherRefOnFile(String str);

        boolean isLocallyCreatedFile(String str);

        void saveFilePath(FilePathDatabase.PathData pathData, File file);
    }

    public static class PreloadRange {
        private long fileOffset;
        private long length;

        private PreloadRange(long j10, long j11) {
            this.fileOffset = j10;
            this.length = j11;
        }
    }

    public static class Range {
        private long end;
        private long start;

        public String toString() {
            return "Range{start=" + this.start + ", end=" + this.end + '}';
        }

        private Range(long j10, long j11) {
            this.start = j10;
            this.end = j11;
        }
    }

    public static class RequestInfo {
        public boolean cancelled;
        public boolean cancelling;
        public int chunkSize;
        public int connectionType;
        private boolean forceSmallChunk;
        private long offset;
        public long requestStartTime;
        public int requestToken;
        private TLRPC.TL_upload_file response;
        private TLRPC.TL_upload_cdnFile responseCdn;
        private TLRPC.TL_upload_webFile responseWeb;
        public Runnable whenCancelled;
    }

    public FileLoadOperation(ImageLocation imageLocation, Object obj, String str, long j10) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new p2(this, 5);
        updateParams();
        this.parentObject = obj;
        this.isStory = obj instanceof TL_stories.TL_storyItem;
        this.fileMetadata = FileLoader.getFileMetadataFromParent(this.currentAccount, obj);
        this.isStream = imageLocation.imageType == 2;
        if (imageLocation.isEncrypted()) {
            TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
            this.location = tL_inputEncryptedFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = imageLocation.location;
            long j11 = tL_fileLocationToBeDeprecated.volume_id;
            tL_inputEncryptedFileLocation.f22395id = j11;
            tL_inputEncryptedFileLocation.volume_id = j11;
            tL_inputEncryptedFileLocation.local_id = tL_fileLocationToBeDeprecated.local_id;
            tL_inputEncryptedFileLocation.access_hash = imageLocation.access_hash;
            byte[] bArr = new byte[32];
            this.iv = bArr;
            System.arraycopy(imageLocation.iv, 0, bArr, 0, 32);
            this.key = imageLocation.key;
        } else if (imageLocation.photoPeer != null) {
            TLRPC.TL_inputPeerPhotoFileLocation tL_inputPeerPhotoFileLocation = new TLRPC.TL_inputPeerPhotoFileLocation();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = imageLocation.location;
            long j12 = tL_fileLocationToBeDeprecated2.volume_id;
            tL_inputPeerPhotoFileLocation.f22395id = j12;
            tL_inputPeerPhotoFileLocation.volume_id = j12;
            tL_inputPeerPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated2.local_id;
            tL_inputPeerPhotoFileLocation.photo_id = imageLocation.photoId;
            tL_inputPeerPhotoFileLocation.big = imageLocation.photoPeerType == 0;
            tL_inputPeerPhotoFileLocation.peer = imageLocation.photoPeer;
            this.location = tL_inputPeerPhotoFileLocation;
        } else if (imageLocation.stickerSet != null) {
            TLRPC.TL_inputStickerSetThumb tL_inputStickerSetThumb = new TLRPC.TL_inputStickerSetThumb();
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = imageLocation.location;
            long j13 = tL_fileLocationToBeDeprecated3.volume_id;
            tL_inputStickerSetThumb.f22395id = j13;
            tL_inputStickerSetThumb.volume_id = j13;
            tL_inputStickerSetThumb.local_id = tL_fileLocationToBeDeprecated3.local_id;
            tL_inputStickerSetThumb.thumb_version = imageLocation.thumbVersion;
            tL_inputStickerSetThumb.stickerset = imageLocation.stickerSet;
            this.location = tL_inputStickerSetThumb;
        } else if (imageLocation.thumbSize != null) {
            if (imageLocation.photoId != 0) {
                TLRPC.TL_inputPhotoFileLocation tL_inputPhotoFileLocation = new TLRPC.TL_inputPhotoFileLocation();
                this.location = tL_inputPhotoFileLocation;
                tL_inputPhotoFileLocation.f22395id = imageLocation.photoId;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated4 = imageLocation.location;
                tL_inputPhotoFileLocation.volume_id = tL_fileLocationToBeDeprecated4.volume_id;
                tL_inputPhotoFileLocation.local_id = tL_fileLocationToBeDeprecated4.local_id;
                tL_inputPhotoFileLocation.access_hash = imageLocation.access_hash;
                tL_inputPhotoFileLocation.file_reference = imageLocation.file_reference;
                tL_inputPhotoFileLocation.thumb_size = imageLocation.thumbSize;
                if (imageLocation.imageType == 2) {
                    this.allowDisordererFileSave = true;
                }
            } else {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.location = tL_inputDocumentFileLocation;
                long j14 = imageLocation.documentId;
                tL_inputDocumentFileLocation.f22395id = j14;
                this.documentId = j14;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated5 = imageLocation.location;
                tL_inputDocumentFileLocation.volume_id = tL_fileLocationToBeDeprecated5.volume_id;
                tL_inputDocumentFileLocation.local_id = tL_fileLocationToBeDeprecated5.local_id;
                tL_inputDocumentFileLocation.access_hash = imageLocation.access_hash;
                tL_inputDocumentFileLocation.file_reference = imageLocation.file_reference;
                tL_inputDocumentFileLocation.thumb_size = imageLocation.thumbSize;
            }
            TLRPC.InputFileLocation inputFileLocation = this.location;
            if (inputFileLocation.file_reference == null) {
                inputFileLocation.file_reference = new byte[0];
            }
        } else {
            TLRPC.TL_inputFileLocation tL_inputFileLocation = new TLRPC.TL_inputFileLocation();
            this.location = tL_inputFileLocation;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated6 = imageLocation.location;
            tL_inputFileLocation.volume_id = tL_fileLocationToBeDeprecated6.volume_id;
            tL_inputFileLocation.local_id = tL_fileLocationToBeDeprecated6.local_id;
            tL_inputFileLocation.secret = imageLocation.access_hash;
            byte[] bArr2 = imageLocation.file_reference;
            tL_inputFileLocation.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputFileLocation.file_reference = new byte[0];
            }
            this.allowDisordererFileSave = true;
        }
        int i10 = imageLocation.imageType;
        this.ungzip = i10 == 1 || i10 == 3;
        int i11 = imageLocation.dc_id;
        this.datacenterId = i11;
        this.initialDatacenterId = i11;
        this.currentType = 16777216;
        this.totalBytesCount = j10;
        this.ext = str == null ? "jpg" : str;
    }

    private void addPart(ArrayList<Range> arrayList, long j10, long j11, boolean z10) {
        long j12;
        if (arrayList == null || j11 < j10) {
            return;
        }
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                Range range = arrayList.get(i10);
                if (j10 <= range.start) {
                    if (j11 >= range.end) {
                        arrayList.remove(i10);
                    } else if (j11 > range.start) {
                        range.start = j11;
                    } else {
                        i10++;
                    }
                    j12 = j10;
                    z11 = true;
                } else {
                    if (j11 < range.end) {
                        j12 = j10;
                        arrayList.add(0, new Range(range.start, j12));
                        range.start = j11;
                    } else {
                        j12 = j10;
                        if (j12 < range.end) {
                            range.end = j12;
                        } else {
                            i10++;
                        }
                    }
                    z11 = true;
                }
            } else {
                j12 = j10;
            }
            if (z10) {
                if (!z11) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e(this.cacheFileFinal + " downloaded duplicate file part " + j12 + " - " + j11);
                        return;
                    }
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                if (this.fileWriteRunnable != null) {
                    filesQueue.cancelRunnable(this.fileWriteRunnable);
                }
                synchronized (this) {
                    this.writingToFilePartsStream = true;
                }
                DispatchQueue dispatchQueue = filesQueue;
                d2 d2Var = new d2(4, this, arrayList2);
                this.fileWriteRunnable = d2Var;
                dispatchQueue.postRunnable(d2Var);
                notifyStreamListeners();
                return;
            }
            return;
        }
    }

    private boolean canFinishPreload() {
        return this.isStory && this.priority < 3;
    }

    public void lambda$cancel$13(boolean z10) {
        if (this.state != 3 && this.state != 2) {
            this.state = 5;
            cancelRequests(new p2(this, 4));
        }
        if (z10) {
            File file = this.cacheFileFinal;
            if (file != null) {
                try {
                    if (!file.delete()) {
                        this.cacheFileFinal.deleteOnExit();
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            File file2 = this.cacheFileTemp;
            if (file2 != null) {
                try {
                    if (!file2.delete()) {
                        this.cacheFileTemp.deleteOnExit();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            File file3 = this.cacheFileParts;
            if (file3 != null) {
                try {
                    if (!file3.delete()) {
                        this.cacheFileParts.deleteOnExit();
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            File file4 = this.cacheIvTemp;
            if (file4 != null) {
                try {
                    if (!file4.delete()) {
                        this.cacheIvTemp.deleteOnExit();
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
            }
            File file5 = this.cacheFilePreload;
            if (file5 != null) {
                try {
                    if (file5.delete()) {
                        return;
                    }
                    this.cacheFilePreload.deleteOnExit();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
            }
        }
    }

    private void cancelRequests(Runnable runnable) {
        FileLog.d("cancelRequests".concat(runnable != null ? " with callback" : ""));
        if (this.requestInfos != null) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[2];
            int i10 = 0;
            for (int i11 = 0; i11 < this.requestInfos.size(); i11++) {
                RequestInfo requestInfo = this.requestInfos.get(i11);
                if (requestInfo.requestToken != 0) {
                    requestInfo.cancelling = true;
                    if (runnable == null) {
                        requestInfo.cancelled = true;
                        i0.a.v(requestInfo.requestToken, new StringBuilder("cancelRequests cancel "));
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true);
                    } else {
                        requestInfo.whenCancelled = new f0(requestInfo, iArr, runnable, 20);
                        iArr[0] = iArr[0] + 1;
                        FileLog.d("cancelRequests cancel " + requestInfo.requestToken + " with callback");
                        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo.requestToken, true, new o2(requestInfo, 1));
                    }
                    char c10 = requestInfo.connectionType == 2 ? (char) 0 : (char) 1;
                    iArr2[c10] = iArr2[c10] + requestInfo.chunkSize;
                }
            }
            while (i10 < 2) {
                int i12 = i10 == 0 ? 2 : 65538;
                if (iArr2[i10] > 1048576) {
                    ConnectionsManager.getInstance(this.currentAccount).discardConnection(this.isCdn ? this.cdnDatacenterId : this.datacenterId, i12);
                }
                i10++;
            }
        }
    }

    private void cleanup() {
        try {
            RandomAccessFile randomAccessFile = this.fileOutputStream;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.getChannel().close();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                this.fileOutputStream.close();
                this.fileOutputStream = null;
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        try {
            RandomAccessFile randomAccessFile2 = this.preloadStream;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.getChannel().close();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                this.preloadStream.close();
                this.preloadStream = null;
            }
        } catch (Exception e12) {
            FileLog.e(e12);
        }
        try {
            RandomAccessFile randomAccessFile3 = this.fileReadStream;
            if (randomAccessFile3 != null) {
                try {
                    randomAccessFile3.getChannel().close();
                } catch (Exception e13) {
                    FileLog.e(e13);
                }
                this.fileReadStream.close();
                this.fileReadStream = null;
            }
        } catch (Exception e14) {
            FileLog.e(e14);
        }
        try {
            if (this.filePartsStream != null) {
                synchronized (this) {
                    if (this.writingToFilePartsStream) {
                        this.closeFilePartsStreamOnWriteEnd = true;
                    } else {
                        try {
                            this.filePartsStream.getChannel().close();
                        } catch (Exception e15) {
                            FileLog.e(e15);
                        }
                        this.filePartsStream.close();
                        this.filePartsStream = null;
                    }
                }
            }
        } catch (Exception e16) {
            FileLog.e(e16);
        }
        try {
            RandomAccessFile randomAccessFile4 = this.fiv;
            if (randomAccessFile4 != null) {
                randomAccessFile4.close();
                this.fiv = null;
            }
        } catch (Exception e17) {
            FileLog.e(e17);
        }
        if (this.delayedRequestInfos != null) {
            for (int i10 = 0; i10 < this.delayedRequestInfos.size(); i10++) {
                RequestInfo requestInfo = this.delayedRequestInfos.get(i10);
                if (requestInfo.response != null) {
                    requestInfo.response.disableFree = false;
                    requestInfo.response.freeResources();
                } else if (requestInfo.responseWeb != null) {
                    requestInfo.responseWeb.disableFree = false;
                    requestInfo.responseWeb.freeResources();
                } else if (requestInfo.responseCdn != null) {
                    requestInfo.responseCdn.disableFree = false;
                    requestInfo.responseCdn.freeResources();
                }
            }
            this.delayedRequestInfos.clear();
        }
    }

    private void clearOperation(RequestInfo requestInfo, boolean z10, boolean z11) {
        int[] iArr = new int[2];
        long j10 = Long.MAX_VALUE;
        int i10 = 0;
        while (i10 < this.requestInfos.size()) {
            RequestInfo requestInfo2 = this.requestInfos.get(i10);
            long jMin = Math.min(requestInfo2.offset, j10);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo2.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo2.offset, requestInfo2.offset + ((long) requestInfo2.chunkSize));
            }
            if (requestInfo != requestInfo2 && requestInfo2.requestToken != 0) {
                requestInfo2.cancelling = true;
                if (z11) {
                    this.cancelledRequestInfos.add(requestInfo2);
                    requestInfo2.whenCancelled = new t2(this, requestInfo2, 1);
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true, new o2(requestInfo2, 0));
                } else {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(requestInfo2.requestToken, true);
                    requestInfo2.cancelled = true;
                }
            }
            i10++;
            j10 = jMin;
        }
        int i11 = 0;
        while (i11 < 2) {
            int i12 = i11 == 0 ? 2 : 65538;
            if (iArr[i11] > 1048576) {
                ConnectionsManager.getInstance(this.currentAccount).discardConnection(this.isCdn ? this.cdnDatacenterId : this.datacenterId, i12);
            }
            i11++;
        }
        this.requestInfos.clear();
        AndroidUtilities.runOnUIThread(new p2(this, 0));
        long jMin2 = j10;
        for (int i13 = 0; i13 < this.delayedRequestInfos.size(); i13++) {
            RequestInfo requestInfo3 = this.delayedRequestInfos.get(i13);
            if (this.isPreloadVideoOperation) {
                this.requestedPreloadedBytesRanges.remove(Long.valueOf(requestInfo3.offset));
            } else {
                removePart(this.notRequestedBytesRanges, requestInfo3.offset, requestInfo3.offset + ((long) requestInfo3.chunkSize));
            }
            if (requestInfo3.response != null) {
                requestInfo3.response.disableFree = false;
                requestInfo3.response.freeResources();
            } else if (requestInfo3.responseWeb != null) {
                requestInfo3.responseWeb.disableFree = false;
                requestInfo3.responseWeb.freeResources();
            } else if (requestInfo3.responseCdn != null) {
                requestInfo3.responseCdn.disableFree = false;
                requestInfo3.responseCdn.freeResources();
            }
            jMin2 = Math.min(requestInfo3.offset, jMin2);
        }
        this.delayedRequestInfos.clear();
        this.requestsCount = 0;
        if (!z10 && this.isPreloadVideoOperation) {
            this.requestedBytesCount = this.totalPreloadedBytes;
        } else if (this.notLoadedBytesRanges == null) {
            this.downloadedBytes = jMin2;
            this.requestedBytesCount = jMin2;
        }
    }

    private void copyNotLoadedRanges() {
        if (this.notLoadedBytesRanges == null) {
            return;
        }
        this.notLoadedBytesRangesCopy = new ArrayList<>(this.notLoadedBytesRanges);
    }

    private void delayRequestInfo(RequestInfo requestInfo) {
        this.delayedRequestInfos.add(requestInfo);
        if (requestInfo.response != null) {
            requestInfo.response.disableFree = true;
        } else if (requestInfo.responseWeb != null) {
            requestInfo.responseWeb.disableFree = true;
        } else if (requestInfo.responseCdn != null) {
            requestInfo.responseCdn.disableFree = true;
        }
    }

    private long findNextPreloadDownloadOffset(long j10, long j11, NativeByteBuffer nativeByteBuffer) {
        long j12;
        int iLimit = nativeByteBuffer.limit();
        long j13 = j10;
        do {
            if (j13 >= j11 - ((long) (this.preloadTempBuffer != null ? 16 : 0))) {
                j12 = j11 + ((long) iLimit);
                if (j13 < j12) {
                    if (j13 >= j12 - 16) {
                        long j14 = j12 - j13;
                        if (j14 > 2147483647L) {
                            throw new RuntimeException("!!!");
                        }
                        this.preloadTempBufferCount = (int) j14;
                        nativeByteBuffer.position(nativeByteBuffer.limit() - this.preloadTempBufferCount);
                        nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, this.preloadTempBufferCount, false);
                        return j12;
                    }
                    if (this.preloadTempBufferCount != 0) {
                        nativeByteBuffer.position(0);
                        byte[] bArr = this.preloadTempBuffer;
                        int i10 = this.preloadTempBufferCount;
                        nativeByteBuffer.readBytes(bArr, i10, 16 - i10, false);
                        this.preloadTempBufferCount = 0;
                    } else {
                        long j15 = j13 - j11;
                        if (j15 > 2147483647L) {
                            throw new RuntimeException("!!!");
                        }
                        nativeByteBuffer.position((int) j15);
                        nativeByteBuffer.readBytes(this.preloadTempBuffer, 0, 16, false);
                    }
                    byte[] bArr2 = this.preloadTempBuffer;
                    int i11 = ((bArr2[0] & 255) << 24) + ((bArr2[1] & 255) << 16) + ((bArr2[2] & 255) << 8) + (bArr2[3] & 255);
                    if (i11 == 0) {
                        return 0L;
                    }
                    if (i11 == 1) {
                        i11 = ((bArr2[12] & 255) << 24) + ((bArr2[13] & 255) << 16) + ((bArr2[14] & 255) << 8) + (bArr2[15] & 255);
                    }
                    if (bArr2[4] == 109 && bArr2[5] == 111 && bArr2[6] == 111 && bArr2[7] == 118) {
                        return -i11;
                    }
                    j13 += (long) i11;
                }
            }
            return 0L;
        } while (j13 < j12);
        return j13;
    }

    public static long floorDiv(long j10, long j11) {
        long j12 = j10 / j11;
        return ((j10 ^ j11) >= 0 || j11 * j12 == j10) ? j12 : j12 - 1;
    }

    private long getDownloadedLengthFromOffsetInternal(ArrayList<Range> arrayList, long j10, long j11) {
        long j12;
        if (arrayList == null || this.state == 3 || arrayList.isEmpty()) {
            if (this.state == 3) {
                return j11;
            }
            long j13 = this.downloadedBytes;
            if (j13 == 0) {
                return 0L;
            }
            return Math.min(j11, Math.max(j13 - j10, 0L));
        }
        int size = arrayList.size();
        Range range = null;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                j12 = j11;
                break;
            }
            Range range2 = arrayList.get(i10);
            if (j10 <= range2.start && (range == null || range2.start < range.start)) {
                range = range2;
            }
            if (range2.start <= j10 && range2.end > j10) {
                j12 = 0;
                break;
            }
            i10++;
        }
        if (j12 == 0) {
            return 0L;
        }
        return range != null ? Math.min(j11, range.start - j10) : Math.min(j11, Math.max(this.totalBytesCount - j10, 0L));
    }

    public void lambda$addPart$2(ArrayList arrayList) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            if (this.filePartsStream == null) {
                return;
            }
            int size = arrayList.size();
            int i10 = (size * 16) + 4;
            gf.d0 d0Var = filesQueueByteBuffer;
            if (d0Var == null) {
                filesQueueByteBuffer = new gf.d0(i10);
            } else {
                d0Var.b();
            }
            filesQueueByteBuffer.c(size);
            for (int i11 = 0; i11 < size; i11++) {
                Range range = (Range) arrayList.get(i11);
                filesQueueByteBuffer.d(range.start);
                filesQueueByteBuffer.d(range.end);
            }
            synchronized (this) {
                try {
                    RandomAccessFile randomAccessFile = this.filePartsStream;
                    if (randomAccessFile == null) {
                        return;
                    }
                    randomAccessFile.seek(0L);
                    this.filePartsStream.write(filesQueueByteBuffer.f6961a, 0, i10);
                    this.writingToFilePartsStream = false;
                    if (this.closeFilePartsStreamOnWriteEnd) {
                        try {
                            this.filePartsStream.getChannel().close();
                        } catch (Exception e9) {
                            FileLog.e(e9);
                        }
                        this.filePartsStream.close();
                        this.filePartsStream = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e10) {
            FileLog.e((Throwable) e10, false);
            if (AndroidUtilities.isENOSPC(e10)) {
                LaunchActivity.E(1);
            } else if (AndroidUtilities.isEROFS(e10)) {
                SharedConfig.checkSdCard(this.cacheFileFinal);
            }
        }
        this.totalTime = (System.currentTimeMillis() - jCurrentTimeMillis) + this.totalTime;
    }

    public void lambda$cancelOnStage$14() {
        if (this.state == 5) {
            onFail(false, 1);
        }
    }

    public static void lambda$cancelRequests$15(RequestInfo requestInfo, int[] iArr, Runnable runnable) {
        requestInfo.whenCancelled = null;
        requestInfo.cancelled = true;
        int i10 = iArr[0] - 1;
        iArr[0] = i10;
        if (i10 == 0) {
            runnable.run();
        }
    }

    public static void lambda$cancelRequests$16(RequestInfo requestInfo) {
        Runnable runnable = requestInfo.whenCancelled;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$clearOperation$24(RequestInfo requestInfo) {
        requestInfo.whenCancelled = null;
        this.cancelledRequestInfos.remove(requestInfo);
        requestInfo.cancelled = true;
    }

    public static void lambda$clearOperation$25(RequestInfo requestInfo) {
        Runnable runnable = requestInfo.whenCancelled;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$clearOperation$26() {
        this.uiRequestTokens.clear();
    }

    public void lambda$getCurrentFile$3(File[] fileArr, CountDownLatch countDownLatch) {
        if (this.state != 3 || this.preloadFinished) {
            fileArr[0] = this.cacheFileTemp;
        } else {
            fileArr[0] = this.cacheFileFinal;
        }
        countDownLatch.countDown();
    }

    public void lambda$getDownloadedLengthFromOffset$4(long[] jArr, long j10, long j11, CountDownLatch countDownLatch) {
        FileLoadOperation fileLoadOperation;
        try {
            fileLoadOperation = this;
            try {
                jArr[0] = fileLoadOperation.getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, j10, j11);
            } catch (Throwable th) {
                th = th;
                FileLog.e(th);
                jArr[0] = 0;
            }
        } catch (Throwable th2) {
            th = th2;
            fileLoadOperation = this;
        }
        if (fileLoadOperation.state == 3) {
            jArr[1] = 1;
        }
        countDownLatch.countDown();
    }

    public void lambda$new$6() {
        pause();
        FileLoader.getInstance(this.currentAccount).cancelLoadFile(getFileName());
    }

    public void lambda$onFail$23(int i10) {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i10);
        }
        notifyStreamListeners();
    }

    public void lambda$onFinishLoadingFile$17(boolean z10) {
        try {
            onFinishLoadingFile(z10, 0, false);
        } catch (Exception unused) {
            onFail(false, 0);
        }
    }

    public void lambda$onFinishLoadingFile$18() {
        onFail(false, 0);
    }

    public void lambda$onFinishLoadingFile$19(boolean z10) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("finished downloading file to " + this.cacheFileFinal + " time = " + (System.currentTimeMillis() - this.startTime) + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
        }
        if (z10) {
            int i10 = this.currentType;
            if (i10 == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 3, 1);
            } else if (i10 == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 2, 1);
            } else if (i10 == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 4, 1);
            } else if (i10 == 67108864) {
                String str = this.ext;
                if (str == null || !(str.toLowerCase().endsWith("mp3") || this.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 5, 1);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementReceivedItemsCount(ApplicationLoader.getCurrentNetworkType(), 7, 1);
                }
            }
        }
        this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
    }

    public void lambda$onFinishLoadingFile$20(File file, File file2, File file3, File file4, boolean z10) {
        File file5;
        boolean zCopyFile;
        int i10;
        int i11;
        int iLastIndexOf;
        String str;
        if (file != null) {
            file.delete();
        }
        if (file2 != null) {
            file2.delete();
        }
        if (file3 != null) {
            file3.delete();
        }
        if (file4 != null) {
            if (this.ungzip) {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file4));
                    FileLoader.copyFile(gZIPInputStream, this.cacheFileGzipTemp, 2097152);
                    gZIPInputStream.close();
                    file4.delete();
                    file5 = this.cacheFileGzipTemp;
                    try {
                        this.ungzip = false;
                    } catch (ZipException unused) {
                        file4 = file5;
                        this.ungzip = false;
                        if (!this.ungzip) {
                            Utilities.stageQueue.postRunnable(new p2(this, 3));
                            return;
                        }
                        if (this.parentObject instanceof TLRPC.TL_theme) {
                            try {
                                zCopyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
                            } catch (Exception e9) {
                                FileLog.e(e9);
                                zCopyFile = false;
                            }
                        } else {
                            try {
                                if (this.pathSaveData != null) {
                                    synchronized (lockObject) {
                                        try {
                                            this.cacheFileFinal = new File(this.storePath, this.storeFileName);
                                            i11 = 1;
                                            while (this.cacheFileFinal.exists()) {
                                                iLastIndexOf = this.storeFileName.lastIndexOf(46);
                                                if (iLastIndexOf > 0) {
                                                    str = this.storeFileName.substring(0, iLastIndexOf) + " (" + i11 + ")" + this.storeFileName.substring(iLastIndexOf);
                                                } else {
                                                    str = this.storeFileName + " (" + i11 + ")";
                                                }
                                                this.cacheFileFinal = new File(this.storePath, str);
                                                i11++;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                zCopyFile = file4.renameTo(this.cacheFileFinal);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                zCopyFile = false;
                            }
                        }
                        if (!zCopyFile) {
                            try {
                                zCopyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
                                if (zCopyFile) {
                                    this.cacheFileFinal.delete();
                                }
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                            }
                        }
                        if (zCopyFile) {
                            this.cacheFileFinalReady = true;
                            if (this.pathSaveData != null) {
                                this.delegate.saveFilePath(this.pathSaveData, this.cacheFileFinal);
                            }
                        } else {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("unable to rename temp = " + file4 + " to final = " + this.cacheFileFinal + " retry = " + this.renameRetryCount);
                            }
                            i10 = this.renameRetryCount + 1;
                            this.renameRetryCount = i10;
                            if (i10 < 3) {
                                this.state = 1;
                                Utilities.stageQueue.postRunnable(new q2(this, z10, 2), 200L);
                                return;
                            } else {
                                this.cacheFileFinal = file4;
                                this.cacheFileFinalReady = false;
                            }
                        }
                        Utilities.stageQueue.postRunnable(new q2(this, z10, 3));
                    } catch (Throwable th3) {
                        th = th3;
                        FileLog.e(th, !AndroidUtilities.isFilNotFoundException(th));
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.e("unable to ungzip temp = " + file4 + " to final = " + this.cacheFileFinal);
                        }
                    }
                } catch (ZipException unused2) {
                } catch (Throwable th4) {
                    th = th4;
                    file5 = file4;
                }
                file4 = file5;
            }
            if (!this.ungzip) {
                Utilities.stageQueue.postRunnable(new p2(this, 3));
                return;
            }
            if (this.parentObject instanceof TLRPC.TL_theme) {
                zCopyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
            } else {
                if (this.pathSaveData != null) {
                    synchronized (lockObject) {
                        this.cacheFileFinal = new File(this.storePath, this.storeFileName);
                        i11 = 1;
                        while (this.cacheFileFinal.exists()) {
                            iLastIndexOf = this.storeFileName.lastIndexOf(46);
                            if (iLastIndexOf > 0) {
                                str = this.storeFileName.substring(0, iLastIndexOf) + " (" + i11 + ")" + this.storeFileName.substring(iLastIndexOf);
                            } else {
                                str = this.storeFileName + " (" + i11 + ")";
                            }
                            this.cacheFileFinal = new File(this.storePath, str);
                            i11++;
                        }
                    }
                }
                zCopyFile = file4.renameTo(this.cacheFileFinal);
            }
            if (!zCopyFile && this.renameRetryCount == 3) {
                zCopyFile = AndroidUtilities.copyFile(file4, this.cacheFileFinal);
                if (zCopyFile) {
                    this.cacheFileFinal.delete();
                }
            }
            if (zCopyFile) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("unable to rename temp = " + file4 + " to final = " + this.cacheFileFinal + " retry = " + this.renameRetryCount);
                }
                i10 = this.renameRetryCount + 1;
                this.renameRetryCount = i10;
                if (i10 < 3) {
                    this.state = 1;
                    Utilities.stageQueue.postRunnable(new q2(this, z10, 2), 200L);
                    return;
                } else {
                    this.cacheFileFinal = file4;
                    this.cacheFileFinalReady = false;
                }
            } else {
                this.cacheFileFinalReady = true;
                if (this.pathSaveData != null && this.cacheFileFinal.exists()) {
                    this.delegate.saveFilePath(this.pathSaveData, this.cacheFileFinal);
                }
            }
        }
        Utilities.stageQueue.postRunnable(new q2(this, z10, 3));
    }

    public void lambda$pause$7() {
        if (!this.isStory) {
            for (int i10 = 0; i10 < this.requestInfos.size(); i10++) {
                ConnectionsManager.getInstance(this.currentAccount).failNotRunningRequest(this.requestInfos.get(i10).requestToken);
            }
        } else {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " pause operation, clear requests");
            }
            clearOperation(null, false, true);
        }
    }

    public void lambda$processRequestResult$22(int i10) {
        this.uiRequestTokens.remove(Integer.valueOf(i10));
    }

    public static int lambda$removePart$1(Range range, Range range2) {
        if (range.start > range2.start) {
            return 1;
        }
        return range.start < range2.start ? -1 : 0;
    }

    public void lambda$removeStreamListener$5(FileLoadOperationStream fileLoadOperationStream) {
        if (this.streamListeners == null) {
            return;
        }
        FileLog.e("FileLoadOperation " + getFileName() + " removing stream listener " + fileLoadOperationStream);
        this.streamListeners.remove(fileLoadOperationStream);
    }

    public void lambda$requestFileOffsets$21(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            onFail(false, 0);
            return;
        }
        if (tLObject instanceof Vector) {
            this.requestingCdnOffsets = false;
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i10);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            for (int i11 = 0; i11 < this.delayedRequestInfos.size(); i11++) {
                RequestInfo requestInfo = this.delayedRequestInfos.get(i11);
                if (this.notLoadedBytesRanges != null || this.downloadedBytes == requestInfo.offset) {
                    this.delayedRequestInfos.remove(i11);
                    if (processRequestResult(requestInfo, null)) {
                        return;
                    }
                    if (requestInfo.response != null) {
                        requestInfo.response.disableFree = false;
                        requestInfo.response.freeResources();
                        return;
                    } else if (requestInfo.responseWeb != null) {
                        requestInfo.responseWeb.disableFree = false;
                        requestInfo.responseWeb.freeResources();
                        return;
                    } else {
                        if (requestInfo.responseCdn != null) {
                            requestInfo.responseCdn.disableFree = false;
                            requestInfo.responseCdn.freeResources();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public void lambda$setIsPreloadVideoOperation$12(boolean z10) {
        this.requestedBytesCount = 0L;
        clearOperation(null, true, true);
        this.isPreloadVideoOperation = z10;
        startDownloadRequest(-1);
    }

    public void lambda$setStream$0(FileLoadOperationStream fileLoadOperationStream) {
        if (this.streamListeners == null) {
            this.streamListeners = new ArrayList<>();
        }
        if (fileLoadOperationStream != null && !this.streamListeners.contains(fileLoadOperationStream)) {
            this.streamListeners.add(fileLoadOperationStream);
        }
        if (!this.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(this.cancelAfterNoStreamListeners);
        }
        if (fileLoadOperationStream == null || this.state == 1 || this.state == 0) {
            return;
        }
        fileLoadOperationStream.newDataAvailable();
    }

    public void lambda$start$10() {
        startDownloadRequest(-1);
    }

    public void lambda$start$11(boolean[] zArr) {
        boolean z10 = this.isPreloadVideoOperation && zArr[0];
        int i10 = this.preloadPrefixSize;
        boolean z11 = i10 > 0 && this.downloadedBytes >= ((long) i10) && canFinishPreload();
        long j10 = this.totalBytesCount;
        if (j10 == 0 || !(z10 || this.downloadedBytes == j10 || z11)) {
            startDownloadRequest(-1);
            return;
        }
        try {
            onFinishLoadingFile(false, 1, true);
        } catch (Exception unused) {
            onFail(true, 0);
        }
    }

    public void lambda$start$8(int i10) {
        this.uiRequestTokens.remove(Integer.valueOf(i10));
    }

    public void lambda$start$9(boolean z10, long j10, FileLoadOperationStream fileLoadOperationStream, boolean z11) {
        if (this.streamListeners == null) {
            this.streamListeners = new ArrayList<>();
        }
        if (z10) {
            long j11 = this.currentDownloadChunkSize;
            long j12 = (j10 / j11) * j11;
            RequestInfo requestInfo = this.priorityRequestInfo;
            if (requestInfo != null && requestInfo.offset != j12) {
                RequestInfo requestInfo2 = this.priorityRequestInfo;
                int i10 = requestInfo2.requestToken;
                this.requestInfos.remove(requestInfo2);
                AndroidUtilities.runOnUIThread(new n2(this, i10, 2));
                this.requestedBytesCount -= (long) this.currentDownloadChunkSize;
                removePart(this.notRequestedBytesRanges, this.priorityRequestInfo.offset, this.priorityRequestInfo.offset + ((long) this.currentDownloadChunkSize));
                if (this.priorityRequestInfo.requestToken != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.priorityRequestInfo.requestToken, true);
                    this.requestsCount--;
                }
                if (BuildVars.DEBUG_VERSION) {
                    FileLog.d("frame get cancel request at offset " + this.priorityRequestInfo.offset);
                }
                this.priorityRequestInfo = null;
            }
            if (this.priorityRequestInfo == null) {
                this.streamPriorityStartOffset = j12;
            }
        } else {
            long j13 = this.currentDownloadChunkSize;
            this.streamStartOffset = (j10 / j13) * j13;
        }
        if (!this.streamListeners.contains(fileLoadOperationStream)) {
            this.streamListeners.add(fileLoadOperationStream);
            FileLog.e("FileLoadOperation " + getFileName() + " start, adding stream " + fileLoadOperationStream);
        }
        if (!this.streamListeners.isEmpty()) {
            Utilities.stageQueue.cancelRunnable(this.cancelAfterNoStreamListeners);
        }
        if (z11) {
            if (this.preloadedBytesRanges != null && getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, this.streamStartOffset, 1L) == 0 && this.preloadedBytesRanges.get(Long.valueOf(this.streamStartOffset)) != null) {
                this.nextPartWasPreloaded = true;
            }
            startDownloadRequest(-1);
            this.nextPartWasPreloaded = false;
        }
        if (this.notLoadedBytesRanges != null) {
            notifyStreamListeners();
        }
    }

    public void lambda$startDownloadRequest$27(RequestInfo requestInfo) {
        processRequestResult(requestInfo, null);
        requestInfo.response.freeResources();
    }

    public void lambda$startDownloadRequest$28(int i10, RequestInfo requestInfo, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.reuploadingCdn = false;
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            if (!vector.objects.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                    TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i11);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            startDownloadRequest(i10);
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("FILE_TOKEN_INVALID") && !tL_error.text.equals("REQUEST_TOKEN_INVALID")) {
                onFail(false, 0);
                return;
            }
            this.isCdn = false;
            clearOperation(requestInfo, false, false);
            startDownloadRequest(i10);
        }
    }

    public void lambda$startDownloadRequest$29(RequestInfo requestInfo, int i10, int i11, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
        byte[] bArr;
        if (requestInfo.cancelled) {
            FileLog.e("received chunk but definitely cancelled offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
            return;
        }
        if (requestInfo.cancelling) {
            FileLog.e("received cancelled chunk after cancelRequests! offset=" + requestInfo.offset + " size=" + requestInfo.chunkSize + " token=" + requestInfo.requestToken);
        }
        if (!this.requestInfos.contains(requestInfo)) {
            if (!this.cancelledRequestInfos.contains(requestInfo)) {
                return;
            }
            int i12 = 0;
            boolean z10 = false;
            while (i12 < this.requestInfos.size()) {
                RequestInfo requestInfo2 = this.requestInfos.get(i12);
                if (requestInfo2 != null && requestInfo2 != requestInfo && requestInfo2.offset == requestInfo.offset && requestInfo2.chunkSize == requestInfo.chunkSize) {
                    FileLog.e("received cancelled chunk faster than new one! received=" + requestInfo.requestToken + " new=" + requestInfo2.requestToken);
                    if (z10) {
                        this.requestInfos.remove(i12);
                        i12--;
                    } else {
                        this.requestInfos.set(i12, requestInfo);
                        z10 = true;
                    }
                }
                i12++;
            }
        }
        int i13 = 0;
        while (i13 < this.cancelledRequestInfos.size()) {
            RequestInfo requestInfo3 = this.cancelledRequestInfos.get(i13);
            if (requestInfo3 != null && requestInfo3 != requestInfo && requestInfo3.offset == requestInfo.offset && requestInfo3.chunkSize == requestInfo.chunkSize) {
                FileLog.e("received new chunk faster than cancelled one! received=" + requestInfo.requestToken + " cancelled=" + requestInfo3.requestToken);
                this.cancelledRequestInfos.remove(i13);
                i13 += -1;
            }
            i13++;
        }
        if (BuildVars.LOGS_ENABLED) {
            StringBuilder sb2 = new StringBuilder("debug_loading: ");
            sb2.append(this.cacheFileFinal.getName());
            sb2.append(" time=");
            sb2.append(System.currentTimeMillis() - requestInfo.requestStartTime);
            sb2.append(" dcId=");
            sb2.append(i10);
            sb2.append(" cdn=");
            sb2.append(this.isCdn);
            sb2.append(" conType=");
            sb2.append(i11);
            sb2.append(" reqId");
            i0.a.v(requestInfo.requestToken, sb2);
        }
        if (requestInfo == this.priorityRequestInfo) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("frame get request completed " + this.priorityRequestInfo.offset);
            }
            this.priorityRequestInfo = null;
        }
        if (tL_error != null) {
            Runnable runnable = requestInfo.whenCancelled;
            if (runnable != null) {
                runnable.run();
            }
            if (tL_error.code == -2000) {
                this.requestInfos.remove(requestInfo);
                this.requestedBytesCount -= (long) requestInfo.chunkSize;
                removePart(this.notRequestedBytesRanges, requestInfo.offset, requestInfo.offset + ((long) requestInfo.chunkSize));
                return;
            } else if (FileRefController.isFileRefError(tL_error.text)) {
                requestReference(requestInfo);
                return;
            } else if ((tLObject instanceof TLRPC.TL_upload_getCdnFile) && tL_error.text.equals("FILE_TOKEN_INVALID")) {
                this.isCdn = false;
                clearOperation(requestInfo, false, false);
                startDownloadRequest(i11);
                return;
            }
        }
        if (tLObject2 instanceof TLRPC.TL_upload_fileCdnRedirect) {
            TLRPC.TL_upload_fileCdnRedirect tL_upload_fileCdnRedirect = (TLRPC.TL_upload_fileCdnRedirect) tLObject2;
            if (!tL_upload_fileCdnRedirect.file_hashes.isEmpty()) {
                if (this.cdnHashes == null) {
                    this.cdnHashes = new HashMap<>();
                }
                for (int i14 = 0; i14 < tL_upload_fileCdnRedirect.file_hashes.size(); i14++) {
                    TLRPC.TL_fileHash tL_fileHash = tL_upload_fileCdnRedirect.file_hashes.get(i14);
                    this.cdnHashes.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                }
            }
            byte[] bArr2 = tL_upload_fileCdnRedirect.encryption_iv;
            if (bArr2 == null || (bArr = tL_upload_fileCdnRedirect.encryption_key) == null || bArr2.length != 16 || bArr.length != 32) {
                Runnable runnable2 = requestInfo.whenCancelled;
                if (runnable2 != null) {
                    runnable2.run();
                }
                TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                tL_error2.text = "bad redirect response";
                tL_error2.code = 400;
                processRequestResult(requestInfo, tL_error2);
                return;
            }
            this.isCdn = true;
            if (this.notCheckedCdnRanges == null) {
                ArrayList<Range> arrayList = new ArrayList<>();
                this.notCheckedCdnRanges = arrayList;
                arrayList.add(new Range(0L, this.maxCdnParts));
            }
            this.cdnDatacenterId = tL_upload_fileCdnRedirect.dc_id;
            this.cdnIv = tL_upload_fileCdnRedirect.encryption_iv;
            this.cdnKey = tL_upload_fileCdnRedirect.encryption_key;
            this.cdnToken = tL_upload_fileCdnRedirect.file_token;
            clearOperation(requestInfo, false, false);
            startDownloadRequest(i11);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_upload_cdnFileReuploadNeeded) {
            if (this.reuploadingCdn) {
                return;
            }
            clearOperation(requestInfo, false, false);
            this.reuploadingCdn = true;
            TLRPC.TL_upload_reuploadCdnFile tL_upload_reuploadCdnFile = new TLRPC.TL_upload_reuploadCdnFile();
            tL_upload_reuploadCdnFile.file_token = this.cdnToken;
            tL_upload_reuploadCdnFile.request_token = ((TLRPC.TL_upload_cdnFileReuploadNeeded) tLObject2).request_token;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_reuploadCdnFile, new wa(this, i11, requestInfo, 1), null, null, 0, this.datacenterId, 1, true);
            return;
        }
        if (tLObject2 instanceof TLRPC.TL_upload_file) {
            requestInfo.response = (TLRPC.TL_upload_file) tLObject2;
        } else if (tLObject2 instanceof TLRPC.TL_upload_webFile) {
            requestInfo.responseWeb = (TLRPC.TL_upload_webFile) tLObject2;
            if (this.totalBytesCount == 0 && requestInfo.responseWeb.size != 0) {
                this.totalBytesCount = requestInfo.responseWeb.size;
            }
        } else {
            requestInfo.responseCdn = (TLRPC.TL_upload_cdnFile) tLObject2;
        }
        if (tLObject2 != null) {
            int i15 = this.currentType;
            if (i15 == 50331648) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 3, tLObject2.getObjectSize() + 4);
            } else if (i15 == 33554432) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 2, tLObject2.getObjectSize() + 4);
            } else if (i15 == 16777216) {
                StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 4, tLObject2.getObjectSize() + 4);
            } else if (i15 == 67108864) {
                String str = this.ext;
                if (str == null || !(str.toLowerCase().endsWith("mp3") || this.ext.toLowerCase().endsWith("m4a"))) {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 5, tLObject2.getObjectSize() + 4);
                } else {
                    StatsController.getInstance(this.currentAccount).incrementReceivedBytesCount(tLObject2.networkType, 7, tLObject2.getObjectSize() + 4);
                }
            }
        }
        processRequestResult(requestInfo, tL_error);
        Runnable runnable3 = requestInfo.whenCancelled;
        if (runnable3 != null) {
            runnable3.run();
        }
    }

    public void lambda$startDownloadRequest$30(int i10) {
        this.uiRequestTokens.add(Integer.valueOf(i10));
    }

    private void notifyStreamListeners() {
        ArrayList<FileLoadOperationStream> arrayList = this.streamListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.streamListeners.get(i10).newDataAvailable();
            }
        }
    }

    private void onFinishLoadingFile(boolean z10, int i10, boolean z11) {
        if (this.state == 1 || this.state == 5) {
            this.state = 3;
            notifyStreamListeners();
            cleanup();
            if (!this.isPreloadVideoOperation && !z11) {
                filesQueue.postRunnable(new h3.p1(this, this.cacheIvTemp, this.cacheFileParts, this.cacheFilePreload, this.cacheFileTemp, z10, 3));
                this.cacheIvTemp = null;
                this.cacheFileParts = null;
                this.cacheFilePreload = null;
                this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
                return;
            }
            this.preloadFinished = true;
            if (BuildVars.DEBUG_VERSION) {
                if (i10 == 1) {
                    FileLog.d("file already exist " + this.cacheFileTemp);
                } else {
                    StringBuilder sb2 = new StringBuilder("finished preloading file to ");
                    sb2.append(this.cacheFileTemp);
                    sb2.append(" loaded ");
                    sb2.append(this.downloadedBytes);
                    sb2.append(" of ");
                    sb2.append(this.totalBytesCount);
                    sb2.append(" prefSize=");
                    i0.a.v(this.preloadPrefixSize, sb2);
                }
            }
            if (this.fileMetadata != null) {
                if (this.cacheFileTemp != null) {
                    FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new ih.a(this.cacheFileTemp)));
                }
                if (this.cacheFileParts != null) {
                    FileLoader.getInstance(this.currentAccount).getFileDatabase().removeFiles(Collections.singletonList(new ih.a(this.cacheFileParts)));
                }
            }
            this.delegate.didPreFinishLoading(this, this.cacheFileFinal);
            this.delegate.didFinishLoadingFile(this, this.cacheFileFinal);
        }
    }

    private void removePart(ArrayList<Range> arrayList, long j10, long j11) {
        boolean z10;
        if (arrayList == null || j11 < j10) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z10 = false;
                break;
            }
            Range range = arrayList.get(i11);
            if (j10 == range.end) {
                range.end = j11;
            } else if (j11 == range.start) {
                range.start = j10;
            } else {
                i11++;
            }
            z10 = true;
            break;
        }
        Collections.sort(arrayList, new q(5));
        while (i10 < arrayList.size() - 1) {
            Range range2 = arrayList.get(i10);
            int i12 = i10 + 1;
            Range range3 = arrayList.get(i12);
            if (range2.end == range3.start) {
                range2.end = range3.end;
                arrayList.remove(i12);
                i10--;
            }
            i10++;
        }
        if (z10) {
            return;
        }
        arrayList.add(new Range(j10, j11));
    }

    private void requestFileOffsets(long j10) {
        if (this.requestingCdnOffsets) {
            return;
        }
        this.requestingCdnOffsets = true;
        TLRPC.TL_upload_getCdnFileHashes tL_upload_getCdnFileHashes = new TLRPC.TL_upload_getCdnFileHashes();
        tL_upload_getCdnFileHashes.file_token = this.cdnToken;
        tL_upload_getCdnFileHashes.offset = j10;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_upload_getCdnFileHashes, new g0(this, 3), null, null, 0, this.datacenterId, 1, true);
    }

    private void requestReference(RequestInfo requestInfo) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (this.requestingReference) {
            return;
        }
        clearOperation(null, false, false);
        this.requestingReference = true;
        this.requestedReference = true;
        Object obj = this.parentObject;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            if (messageObject.getId() < 0 && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null) {
                this.parentObject = webPage;
                this.isStory = false;
            }
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("debug_loading: " + this.cacheFileFinal.getName() + " file reference expired ");
        }
        FileRefController.getInstance(this.currentAccount).requestReference(this.parentObject, this.location, this, requestInfo);
    }

    private void updateParams() {
        if ((this.preloadPrefixSize > 0 || MessagesController.getInstance(this.currentAccount).getfileExperimentalParams) && !this.forceSmallChunk) {
            this.downloadChunkSizeBig = 524288;
            this.maxDownloadRequests = 8;
            this.maxDownloadRequestsBig = 8;
        } else {
            this.downloadChunkSizeBig = 131072;
            this.maxDownloadRequests = 4;
            this.maxDownloadRequestsBig = 4;
        }
        this.maxCdnParts = (int) (2097152000 / ((long) this.downloadChunkSizeBig));
    }

    public void cancel() {
        cancel(false);
    }

    public boolean checkPrefixPreloadFinished() {
        int i10 = this.preloadPrefixSize;
        if (i10 > 0 && this.downloadedBytes > i10) {
            ArrayList<Range> arrayList = this.notLoadedBytesRanges;
            if (arrayList == null) {
                return true;
            }
            long jMin = Long.MAX_VALUE;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                try {
                    jMin = Math.min(jMin, arrayList.get(i11).start);
                } catch (Throwable th) {
                    FileLog.e(th);
                    return true;
                }
            }
            if (jMin > this.preloadPrefixSize) {
                return true;
            }
        }
        return false;
    }

    public File getCacheFileFinal() {
        return this.cacheFileFinal;
    }

    public File getCurrentFile() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        File[] fileArr = new File[1];
        Utilities.stageQueue.postRunnable(new f0(this, fileArr, countDownLatch, 19));
        try {
            countDownLatch.await();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        return fileArr[0];
    }

    public File getCurrentFileFast() {
        return (this.state == 3 && !this.preloadFinished && this.cacheFileFinalReady) ? this.cacheFileFinal : this.cacheFileTemp;
    }

    public int getCurrentType() {
        return this.currentType;
    }

    public int getDatacenterId() {
        return this.initialDatacenterId;
    }

    public long getDocumentId() {
        return this.documentId;
    }

    public float getDownloadedLengthFromOffset(float f10) {
        ArrayList<Range> arrayList = this.notLoadedBytesRangesCopy;
        long j10 = this.totalBytesCount;
        if (j10 == 0 || arrayList == null) {
            return 0.0f;
        }
        return (getDownloadedLengthFromOffsetInternal(arrayList, (int) (j10 * f10), j10) / this.totalBytesCount) + f10;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getPositionInQueue() {
        return getQueue().getPosition(this);
    }

    public int getPriority() {
        return this.priority;
    }

    public FileLoaderPriorityQueue getQueue() {
        return this.priorityQueue;
    }

    public boolean isFinished() {
        return this.state == 3;
    }

    public boolean isForceRequest() {
        return this.isForceRequest;
    }

    public boolean isPaused() {
        return this.paused;
    }

    public boolean isPreloadFinished() {
        return this.preloadFinished;
    }

    public boolean isPreloadVideoOperation() {
        return this.isPreloadVideoOperation;
    }

    public void onFail(boolean z10, int i10) {
        cleanup();
        this.state = i10 == 1 ? 4 : 2;
        if (this.delegate != null && BuildVars.LOGS_ENABLED) {
            long jCurrentTimeMillis = this.startTime != 0 ? System.currentTimeMillis() - this.startTime : 0L;
            if (i10 == 1) {
                FileLog.d("cancel downloading file to " + this.cacheFileFinal + " time = " + jCurrentTimeMillis + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            } else {
                FileLog.d("failed downloading file to " + this.cacheFileFinal + " reason = " + i10 + " time = " + jCurrentTimeMillis + " dc = " + this.datacenterId + " size = " + AndroidUtilities.formatFileSize(this.totalBytesCount));
            }
        }
        if (z10) {
            Utilities.stageQueue.postRunnable(new n2(this, i10, 0));
            return;
        }
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            fileLoadOperationDelegate.didFailedLoadingFile(this, i10);
        }
        notifyStreamListeners();
    }

    public void pause() {
        if (this.state != 1) {
            return;
        }
        this.paused = true;
        Utilities.stageQueue.postRunnable(new p2(this, 2));
    }

    public boolean processRequestResult(RequestInfo requestInfo, TLRPC.TL_error tL_error) {
        long j10;
        NativeByteBuffer nativeByteBuffer;
        char c10;
        char c11;
        char c12;
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        long j11;
        long j12;
        String str;
        long j13;
        long j14;
        RandomAccessFile randomAccessFile;
        boolean z13;
        long j15;
        int size;
        int i10;
        Range range;
        TLRPC.TL_fileHash tL_fileHash;
        long j16;
        String str2;
        long jLimit;
        int i11;
        int i12;
        Integer numValueOf;
        int i13 = 1;
        if (this.state != 1 && this.state != 5) {
            if (!BuildVars.DEBUG_VERSION || this.state != 3) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder("trying to write to finished file ");
            sb2.append(this.fileName);
            sb2.append(" offset ");
            sb2.append(requestInfo.offset);
            sb2.append(" ");
            sb2.append(this.totalBytesCount);
            sb2.append(" reqToken=");
            sb2.append(requestInfo.requestToken);
            sb2.append(" (state=");
            FileLog.e(new FileLog.IgnoreSentException(a9.p.k(this.state, ")", sb2)));
            return false;
        }
        int i14 = requestInfo.requestToken;
        this.requestInfos.remove(requestInfo);
        AndroidUtilities.runOnUIThread(new n2(this, i14, i13));
        String str3 = " id = ";
        if (tL_error == null) {
            try {
                if (this.notLoadedBytesRanges == null) {
                    j10 = 0;
                    if (this.downloadedBytes != requestInfo.offset) {
                        delayRequestInfo(requestInfo);
                        return false;
                    }
                } else {
                    j10 = 0;
                }
                if (requestInfo.response != null) {
                    nativeByteBuffer = requestInfo.response.bytes;
                } else if (requestInfo.responseWeb != null) {
                    nativeByteBuffer = requestInfo.responseWeb.bytes;
                } else {
                    nativeByteBuffer = requestInfo.responseCdn != null ? requestInfo.responseCdn.bytes : null;
                }
                if (nativeByteBuffer == null || nativeByteBuffer.limit() == 0) {
                    onFinishLoadingFile(true, 0, false);
                    return false;
                }
                int iLimit = nativeByteBuffer.limit();
                if (this.isCdn) {
                    try {
                        long j17 = requestInfo.offset;
                        long j18 = this.cdnChunkCheckSize;
                        long j19 = j18 * (j17 / j18);
                        HashMap<Long, TLRPC.TL_fileHash> map = this.cdnHashes;
                        if ((map != null ? map.get(Long.valueOf(j19)) : null) == null) {
                            delayRequestInfo(requestInfo);
                            requestFileOffsets(j19);
                            return true;
                        }
                    } catch (Exception e9) {
                        e = e9;
                        FileLog.e(e, (AndroidUtilities.isFilNotFoundException(e) || AndroidUtilities.isENOSPC(e)) ? false : true);
                        if (AndroidUtilities.isENOSPC(e)) {
                            onFail(false, -1);
                        } else if (AndroidUtilities.isEROFS(e)) {
                            SharedConfig.checkSdCard(this.cacheFileFinal);
                            onFail(true, -1);
                        } else {
                            onFail(false, 0);
                        }
                    }
                }
                if (requestInfo.responseCdn != null) {
                    long j20 = requestInfo.offset / 16;
                    byte[] bArr2 = this.cdnIv;
                    c10 = '\r';
                    c12 = '\b';
                    bArr2[15] = (byte) (j20 & 255);
                    bArr2[14] = (byte) ((j20 >> 8) & 255);
                    bArr2[13] = (byte) ((j20 >> 16) & 255);
                    bArr2[12] = (byte) ((j20 >> 24) & 255);
                    c11 = '\f';
                    Utilities.aesCtrDecryption(nativeByteBuffer.buffer, this.cdnKey, bArr2, 0, nativeByteBuffer.limit());
                } else {
                    c10 = '\r';
                    c11 = '\f';
                    c12 = '\b';
                }
                if (this.isPreloadVideoOperation) {
                    this.preloadStream.writeLong(requestInfo.offset);
                    long j21 = iLimit;
                    this.preloadStream.writeLong(j21);
                    this.preloadStreamFileOffset += 16;
                    this.preloadStream.getChannel().write(nativeByteBuffer.buffer);
                    if (BuildVars.DEBUG_VERSION) {
                        FileLog.d("save preload file part " + this.cacheFilePreload + " offset " + requestInfo.offset + " size " + iLimit);
                    }
                    if (this.preloadedBytesRanges == null) {
                        this.preloadedBytesRanges = new HashMap<>();
                    }
                    this.preloadedBytesRanges.put(Long.valueOf(requestInfo.offset), new PreloadRange(this.preloadStreamFileOffset, j21));
                    this.totalPreloadedBytes += iLimit;
                    this.preloadStreamFileOffset += iLimit;
                    if (this.moovFound == 0) {
                        long jFindNextPreloadDownloadOffset = findNextPreloadDownloadOffset(this.nextAtomOffset, requestInfo.offset, nativeByteBuffer);
                        if (jFindNextPreloadDownloadOffset < j10) {
                            jFindNextPreloadDownloadOffset *= -1;
                            long j22 = this.nextPreloadDownloadOffset + ((long) this.currentDownloadChunkSize);
                            this.nextPreloadDownloadOffset = j22;
                            if (j22 < this.totalBytesCount / 2) {
                                long j23 = 1048576 + jFindNextPreloadDownloadOffset;
                                this.foundMoovSize = j23;
                                this.preloadNotRequestedBytesCount = j23;
                                this.moovFound = 1;
                            } else {
                                this.foundMoovSize = 2097152L;
                                this.preloadNotRequestedBytesCount = 2097152L;
                                this.moovFound = 2;
                            }
                            this.nextPreloadDownloadOffset = -1L;
                        } else {
                            this.nextPreloadDownloadOffset += (long) this.currentDownloadChunkSize;
                        }
                        this.nextAtomOffset = jFindNextPreloadDownloadOffset;
                    }
                    this.preloadStream.writeLong(this.foundMoovSize);
                    this.preloadStream.writeLong(this.nextPreloadDownloadOffset);
                    this.preloadStream.writeLong(this.nextAtomOffset);
                    this.preloadStreamFileOffset += 24;
                    long j24 = this.nextPreloadDownloadOffset;
                    z13 = j24 == j10 || (this.moovFound != 0 && this.foundMoovSize < j10) || this.totalPreloadedBytes > 2097152 || j24 >= this.totalBytesCount;
                    if (z13) {
                        this.preloadStream.seek(j10);
                        this.preloadStream.write(1);
                    } else if (this.moovFound != 0) {
                        this.foundMoovSize -= (long) this.currentDownloadChunkSize;
                    }
                    z12 = false;
                } else {
                    NativeByteBuffer nativeByteBuffer2 = nativeByteBuffer;
                    long j25 = iLimit;
                    long j26 = this.downloadedBytes + j25;
                    this.downloadedBytes = j26;
                    long j27 = this.totalBytesCount;
                    if (j27 > 0) {
                        z10 = j26 >= j27 || ((i11 = this.preloadPrefixSize) > 0 && j26 >= ((long) i11) && canFinishPreload() && this.requestInfos.isEmpty());
                        if (this.downloadedBytes < this.totalBytesCount) {
                            z11 = z10;
                            z12 = true;
                        }
                        boolean z14 = BuildVars.DEBUG_VERSION;
                        bArr = this.key;
                        if (bArr != null) {
                            Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, bArr, this.iv, false, true, 0, nativeByteBuffer2.limit());
                            if (z11) {
                                j12 = 2147483647L;
                                j11 = 0;
                                if (this.bytesCountPadding != 0) {
                                    jLimit = ((long) nativeByteBuffer2.limit()) - this.bytesCountPadding;
                                    if (BuildVars.DEBUG_VERSION && jLimit > 2147483647L) {
                                        throw new RuntimeException("Out of limit" + jLimit);
                                    }
                                    nativeByteBuffer2.limit((int) jLimit);
                                }
                            } else {
                                j11 = 0;
                                j12 = 2147483647L;
                            }
                        } else {
                            j11 = 0;
                            j12 = 2147483647L;
                        }
                        if (this.encryptFile) {
                            long j28 = requestInfo.offset / 16;
                            byte[] bArr3 = this.encryptIv;
                            bArr3[15] = (byte) (j28 & 255);
                            bArr3[14] = (byte) ((j28 >> c12) & 255);
                            bArr3[c10] = (byte) ((j28 >> 16) & 255);
                            bArr3[c11] = (byte) ((j28 >> 24) & 255);
                            Utilities.aesCtrDecryption(nativeByteBuffer2.buffer, this.encryptKey, bArr3, 0, nativeByteBuffer2.limit());
                        }
                        if (this.notLoadedBytesRanges != null) {
                            this.fileOutputStream.seek(requestInfo.offset);
                            if (BuildVars.DEBUG_VERSION) {
                                FileLog.d("save file part " + this.fileName + " offset=" + requestInfo.offset + " chunk_size=" + this.currentDownloadChunkSize + " isCdn=" + this.isCdn);
                            }
                        }
                        this.fileOutputStream.getChannel().write(nativeByteBuffer2.buffer);
                        str = " local_id = ";
                        j13 = j11;
                        addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j25, true);
                        if (this.isCdn) {
                            j14 = j13;
                            break;
                        }
                        j15 = requestInfo.offset / ((long) this.cdnChunkCheckSize);
                        size = this.notCheckedCdnRanges.size();
                        i10 = 0;
                        while (true) {
                            if (i10 < size) {
                                range = this.notCheckedCdnRanges.get(i10);
                                if (range.start > j15 && j15 <= range.end) {
                                    long j29 = this.cdnChunkCheckSize;
                                    long j30 = j15 * j29;
                                    long downloadedLengthFromOffsetInternal = getDownloadedLengthFromOffsetInternal(this.notLoadedBytesRanges, j30, j29);
                                    if (downloadedLengthFromOffsetInternal != j13) {
                                        j14 = j13;
                                        if (downloadedLengthFromOffsetInternal == this.cdnChunkCheckSize) {
                                            tL_fileHash = this.cdnHashes.get(Long.valueOf(j30));
                                            if (this.fileReadStream == null) {
                                                this.cdnCheckBytes = new byte[this.cdnChunkCheckSize];
                                                this.fileReadStream = new RandomAccessFile(this.cacheFileTemp, "r");
                                            }
                                            this.fileReadStream.seek(j30);
                                            if (BuildVars.DEBUG_VERSION) {
                                                throw new RuntimeException("!!!");
                                            }
                                            this.fileReadStream.readFully(this.cdnCheckBytes, 0, (int) downloadedLengthFromOffsetInternal);
                                            if (this.encryptFile) {
                                                long j31 = j30 / 16;
                                                byte[] bArr4 = this.encryptIv;
                                                bArr4[15] = (byte) (j31 & 255);
                                                bArr4[14] = (byte) ((j31 >> c12) & 255);
                                                bArr4[c10] = (byte) ((j31 >> 16) & 255);
                                                bArr4[c11] = (byte) ((j31 >> 24) & 255);
                                                Utilities.aesCtrDecryptionByteArray(this.cdnCheckBytes, this.encryptKey, bArr4, 0, downloadedLengthFromOffsetInternal, 0);
                                                j16 = downloadedLengthFromOffsetInternal;
                                            } else {
                                                j16 = downloadedLengthFromOffsetInternal;
                                            }
                                            if (!Arrays.equals(Utilities.computeSHA256(this.cdnCheckBytes, 0, j16), tL_fileHash.hash)) {
                                                this.cdnHashes.remove(Long.valueOf(j30));
                                                addPart(this.notCheckedCdnRanges, j15, j15 + 1, false);
                                                break;
                                            }
                                            if (BuildVars.LOGS_ENABLED) {
                                                if (this.location != null) {
                                                    FileLog.e("invalid cdn hash " + this.location + str3 + this.location.f22395id + str + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + " secret = " + this.location.secret);
                                                } else {
                                                    str2 = str3;
                                                    if (this.webLocation != null) {
                                                        FileLog.e("invalid cdn hash  " + this.webLocation + str2 + this.fileName);
                                                    }
                                                }
                                            }
                                            onFail(false, 0);
                                            this.cacheFileTemp.delete();
                                            return false;
                                        }
                                        long j32 = this.totalBytesCount;
                                        if ((j32 <= j14 || downloadedLengthFromOffsetInternal != j32 - j30) && (j32 > j14 || !z11)) {
                                            break;
                                            break;
                                        }
                                        tL_fileHash = this.cdnHashes.get(Long.valueOf(j30));
                                        if (this.fileReadStream == null) {
                                            this.cdnCheckBytes = new byte[this.cdnChunkCheckSize];
                                            this.fileReadStream = new RandomAccessFile(this.cacheFileTemp, "r");
                                        }
                                        this.fileReadStream.seek(j30);
                                        if (BuildVars.DEBUG_VERSION && downloadedLengthFromOffsetInternal > j12) {
                                            throw new RuntimeException("!!!");
                                        }
                                        this.fileReadStream.readFully(this.cdnCheckBytes, 0, (int) downloadedLengthFromOffsetInternal);
                                        if (this.encryptFile) {
                                            long j33 = j30 / 16;
                                            byte[] bArr5 = this.encryptIv;
                                            bArr5[15] = (byte) (j33 & 255);
                                            bArr5[14] = (byte) ((j33 >> c12) & 255);
                                            bArr5[c10] = (byte) ((j33 >> 16) & 255);
                                            bArr5[c11] = (byte) ((j33 >> 24) & 255);
                                            Utilities.aesCtrDecryptionByteArray(this.cdnCheckBytes, this.encryptKey, bArr5, 0, downloadedLengthFromOffsetInternal, 0);
                                            j16 = downloadedLengthFromOffsetInternal;
                                        } else {
                                            j16 = downloadedLengthFromOffsetInternal;
                                        }
                                        if (!Arrays.equals(Utilities.computeSHA256(this.cdnCheckBytes, 0, j16), tL_fileHash.hash)) {
                                            this.cdnHashes.remove(Long.valueOf(j30));
                                            addPart(this.notCheckedCdnRanges, j15, j15 + 1, false);
                                            break;
                                        }
                                        if (BuildVars.LOGS_ENABLED) {
                                            if (this.location != null) {
                                                FileLog.e("invalid cdn hash " + this.location + str3 + this.location.f22395id + str + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + " secret = " + this.location.secret);
                                            } else {
                                                str2 = str3;
                                                if (this.webLocation != null) {
                                                    FileLog.e("invalid cdn hash  " + this.webLocation + str2 + this.fileName);
                                                }
                                            }
                                        }
                                        onFail(false, 0);
                                        this.cacheFileTemp.delete();
                                        return false;
                                    }
                                } else {
                                    i10++;
                                    str3 = str3;
                                    j15 = j15;
                                    str = str;
                                    j13 = j13;
                                }
                            }
                            j14 = j13;
                            break;
                        }
                        randomAccessFile = this.fiv;
                        if (randomAccessFile != null) {
                            randomAccessFile.seek(j14);
                            this.fiv.write(this.iv);
                        }
                        if (this.totalBytesCount > 0 && this.state == 1) {
                            copyNotLoadedRanges();
                            this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                        }
                        z13 = z11;
                    } else {
                        int i15 = this.currentDownloadChunkSize;
                        z10 = iLimit != i15 || ((j27 == j26 || j26 % ((long) i15) != 0) && (j27 <= 0 || j27 <= j26));
                    }
                    z11 = z10;
                    z12 = false;
                    boolean z15 = BuildVars.DEBUG_VERSION;
                    bArr = this.key;
                    if (bArr != null) {
                        Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, bArr, this.iv, false, true, 0, nativeByteBuffer2.limit());
                        if (z11) {
                            j12 = 2147483647L;
                            j11 = 0;
                            if (this.bytesCountPadding != 0) {
                                jLimit = ((long) nativeByteBuffer2.limit()) - this.bytesCountPadding;
                                if (BuildVars.DEBUG_VERSION) {
                                    throw new RuntimeException("Out of limit" + jLimit);
                                }
                                nativeByteBuffer2.limit((int) jLimit);
                            }
                        } else {
                            j11 = 0;
                            j12 = 2147483647L;
                        }
                    } else {
                        j11 = 0;
                        j12 = 2147483647L;
                    }
                    if (this.encryptFile) {
                        long j210 = requestInfo.offset / 16;
                        byte[] bArr6 = this.encryptIv;
                        bArr6[15] = (byte) (j210 & 255);
                        bArr6[14] = (byte) ((j210 >> c12) & 255);
                        bArr6[c10] = (byte) ((j210 >> 16) & 255);
                        bArr6[c11] = (byte) ((j210 >> 24) & 255);
                        Utilities.aesCtrDecryption(nativeByteBuffer2.buffer, this.encryptKey, bArr6, 0, nativeByteBuffer2.limit());
                    }
                    if (this.notLoadedBytesRanges != null) {
                        this.fileOutputStream.seek(requestInfo.offset);
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("save file part " + this.fileName + " offset=" + requestInfo.offset + " chunk_size=" + this.currentDownloadChunkSize + " isCdn=" + this.isCdn);
                        }
                    }
                    this.fileOutputStream.getChannel().write(nativeByteBuffer2.buffer);
                    str = " local_id = ";
                    j13 = j11;
                    addPart(this.notLoadedBytesRanges, requestInfo.offset, requestInfo.offset + j25, true);
                    if (this.isCdn) {
                        j14 = j13;
                        break;
                    }
                    j15 = requestInfo.offset / ((long) this.cdnChunkCheckSize);
                    size = this.notCheckedCdnRanges.size();
                    i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            range = this.notCheckedCdnRanges.get(i10);
                            if (range.start > j15) {
                            }
                            i10++;
                            str3 = str3;
                            j15 = j15;
                            str = str;
                            j13 = j13;
                        }
                        j14 = j13;
                        break;
                    }
                    randomAccessFile = this.fiv;
                    if (randomAccessFile != null) {
                        randomAccessFile.seek(j14);
                        this.fiv.write(this.iv);
                    }
                    if (this.totalBytesCount > 0) {
                        copyNotLoadedRanges();
                        this.delegate.didChangedLoadProgress(this, this.downloadedBytes, this.totalBytesCount);
                    }
                    z13 = z11;
                }
                while (i12 < this.delayedRequestInfos.size()) {
                    RequestInfo requestInfo2 = this.delayedRequestInfos.get(i12);
                    i12 = (this.notLoadedBytesRanges == null && this.downloadedBytes != requestInfo2.offset) ? i12 + 1 : 0;
                    this.delayedRequestInfos.remove(i12);
                    if (!processRequestResult(requestInfo2, null)) {
                        if (requestInfo2.response == null) {
                            if (requestInfo2.responseWeb == null) {
                                if (requestInfo2.responseCdn == null) {
                                    break;
                                }
                                requestInfo2.responseCdn.disableFree = false;
                                requestInfo2.responseCdn.freeResources();
                                break;
                            }
                            requestInfo2.responseWeb.disableFree = false;
                            requestInfo2.responseWeb.freeResources();
                            break;
                        }
                        requestInfo2.response.disableFree = false;
                        requestInfo2.response.freeResources();
                        break;
                    }
                    break;
                }
                if (z13) {
                    onFinishLoadingFile(true, 0, z12);
                    return false;
                }
                if (this.state != 4 && this.state != 5) {
                    startDownloadRequest(requestInfo.connectionType);
                    return false;
                }
            } catch (Exception e10) {
                e = e10;
            }
        } else {
            if (tL_error.text.contains("LIMIT_INVALID") && !requestInfo.forceSmallChunk) {
                Runnable runnable = requestInfo.whenCancelled;
                if (runnable != null) {
                    runnable.run();
                }
                removePart(this.notRequestedBytesRanges, requestInfo.offset, requestInfo.offset + ((long) requestInfo.chunkSize));
                if (!this.forceSmallChunk) {
                    this.forceSmallChunk = true;
                    this.currentDownloadChunkSize = 32768;
                    this.currentMaxDownloadRequests = 4;
                }
                startDownloadRequest(requestInfo.connectionType);
                return false;
            }
            if (!tL_error.text.contains("FILE_MIGRATE_")) {
                if (tL_error.text.contains("OFFSET_INVALID")) {
                    if (this.downloadedBytes % ((long) this.currentDownloadChunkSize) != 0) {
                        onFail(false, 0);
                        return false;
                    }
                    try {
                        onFinishLoadingFile(true, 0, false);
                        return false;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        onFail(false, 0);
                        return false;
                    }
                }
                if (tL_error.text.contains("RETRY_LIMIT")) {
                    onFail(false, 2);
                    return false;
                }
                if (BuildVars.LOGS_ENABLED) {
                    TLRPC.InputFileLocation inputFileLocation = this.location;
                    if (inputFileLocation != null) {
                        if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                            FileLog.e(tL_error.text + " " + this.location + " peer_did = " + DialogObject.getPeerDialogId(((TLRPC.TL_inputPeerPhotoFileLocation) this.location).peer) + " peer_access_hash=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).peer.access_hash + " photo_id=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).photo_id + " big=" + ((TLRPC.TL_inputPeerPhotoFileLocation) this.location).big);
                        } else {
                            FileLog.e(tL_error.text + " " + this.location + " id = " + this.location.f22395id + " local_id = " + this.location.local_id + " access_hash = " + this.location.access_hash + " volume_id = " + this.location.volume_id + " secret = " + this.location.secret);
                        }
                    } else if (this.webLocation != null) {
                        FileLog.e(tL_error.text + " " + this.webLocation + " id = " + this.fileName);
                    }
                }
                onFail(false, 0);
                return false;
            }
            Scanner scanner = new Scanner(tL_error.text.replace("FILE_MIGRATE_", ""));
            scanner.useDelimiter("");
            try {
                numValueOf = Integer.valueOf(scanner.nextInt());
            } catch (Exception unused) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                onFail(false, 0);
            } else {
                this.datacenterId = numValueOf.intValue();
                this.downloadedBytes = 0L;
                this.requestedBytesCount = 0L;
                startDownloadRequest(requestInfo.connectionType);
            }
        }
        return false;
    }

    public void removeStreamListener(FileLoadOperationStream fileLoadOperationStream) {
        Utilities.stageQueue.postRunnable(new r2(this, fileLoadOperationStream, 0));
    }

    public void setDelegate(FileLoadOperationDelegate fileLoadOperationDelegate) {
        this.delegate = fileLoadOperationDelegate;
    }

    public void setEncryptFile(boolean z10) {
        this.encryptFile = z10;
        if (z10) {
            this.allowDisordererFileSave = false;
        }
    }

    public void setForceRequest(boolean z10) {
        this.isForceRequest = z10;
    }

    public void setIsPreloadVideoOperation(boolean z10) {
        if (this.isPreloadVideoOperation != z10) {
            if (!z10 || this.totalBytesCount > 2097152) {
                FileLog.e("setIsPreloadVideoOperation " + z10 + " file=" + this.fileName);
                if (z10 || !this.isPreloadVideoOperation) {
                    this.isPreloadVideoOperation = z10;
                    return;
                }
                if (this.state == 3) {
                    this.isPreloadVideoOperation = z10;
                    this.state = 0;
                    this.preloadFinished = false;
                    start();
                    return;
                }
                if (this.state == 1) {
                    Utilities.stageQueue.postRunnable(new q2(this, z10, 0));
                } else {
                    this.isPreloadVideoOperation = z10;
                }
            }
        }
    }

    public void setPaths(int i10, String str, FileLoaderPriorityQueue fileLoaderPriorityQueue, File file, File file2, String str2) {
        this.storePath = file;
        this.tempPath = file2;
        this.currentAccount = i10;
        this.fileName = str;
        this.storeFileName = str2;
        this.priorityQueue = fileLoaderPriorityQueue;
    }

    public void setPriority(int i10) {
        this.priority = i10;
    }

    public void setStream(FileLoadOperationStream fileLoadOperationStream, boolean z10, long j10) {
        this.stream = fileLoadOperationStream;
        this.streamOffset = j10;
        this.streamPriority = z10;
        Utilities.stageQueue.postRunnable(new r2(this, fileLoadOperationStream, 1));
    }

    public boolean start() {
        return start(this.stream, this.streamOffset, this.streamPriority);
    }

    public void startDownloadRequest(int i10) {
        int i11;
        int iMax;
        int i12;
        ArrayList<Range> arrayList;
        long j10;
        long j11;
        int size;
        int i13;
        long j12;
        long jMin;
        Range range;
        long j13;
        int i14;
        long j14;
        long j15;
        boolean z10;
        int i15;
        int i16;
        TLObject tLObject;
        TLObject tLObject2;
        RequestInfo requestInfo;
        long j16;
        TLRPC.InputFileLocation inputFileLocation;
        int i17;
        int i18;
        HashMap<Long, PreloadRange> map;
        PreloadRange preloadRange;
        int i19;
        ArrayList<Range> arrayList2;
        int i20;
        long j17;
        boolean z11;
        long j18;
        FileLoadOperation fileLoadOperation = this;
        if (BuildVars.DEBUG_PRIVATE_VERSION && Utilities.stageQueue != null && Utilities.stageQueue.getHandler() != null && Thread.currentThread() != Utilities.stageQueue.getHandler().getLooper().getThread()) {
            throw new RuntimeException("Wrong thread!!!");
        }
        if (fileLoadOperation.state == 5) {
            fileLoadOperation.state = 1;
        }
        if (fileLoadOperation.paused || fileLoadOperation.reuploadingCdn || fileLoadOperation.state != 1 || fileLoadOperation.requestingReference) {
            return;
        }
        long j19 = 0;
        if (fileLoadOperation.isStory || fileLoadOperation.streamPriorityStartOffset != 0 || fileLoadOperation.nextPartWasPreloaded || fileLoadOperation.delayedRequestInfos.size() + fileLoadOperation.requestInfos.size() < fileLoadOperation.currentMaxDownloadRequests) {
            if (fileLoadOperation.isPreloadVideoOperation) {
                if (fileLoadOperation.requestedBytesCount > 2097152) {
                    return;
                }
                if (fileLoadOperation.moovFound != 0 && fileLoadOperation.requestInfos.size() > 0) {
                    return;
                }
            }
            int i21 = 0;
            if (!fileLoadOperation.isStory) {
                if (fileLoadOperation.streamPriorityStartOffset != 0 || fileLoadOperation.nextPartWasPreloaded || ((fileLoadOperation.isPreloadVideoOperation && fileLoadOperation.moovFound == 0) || fileLoadOperation.totalBytesCount <= 0)) {
                    i11 = 1;
                } else {
                    iMax = Math.max(0, fileLoadOperation.currentMaxDownloadRequests - fileLoadOperation.requestInfos.size());
                }
                if (!fileLoadOperation.requestedReference && FileRefController.getInstance(fileLoadOperation.currentAccount).applyCachedFileReference(fileLoadOperation.parentObject, fileLoadOperation.location, fileLoadOperation)) {
                    FileLog.d(fileLoadOperation.fileName + " before download updated file ref from file ref cache!");
                }
                i12 = 0;
                while (i12 < i11) {
                    if (!fileLoadOperation.isPreloadVideoOperation) {
                        j19 = j19;
                        arrayList = fileLoadOperation.notRequestedBytesRanges;
                        if (arrayList != null) {
                            j11 = fileLoadOperation.streamPriorityStartOffset;
                            if (j11 == j19) {
                                j11 = fileLoadOperation.streamStartOffset;
                            }
                            size = arrayList.size();
                            i13 = 0;
                            j12 = Long.MAX_VALUE;
                            jMin = Long.MAX_VALUE;
                            while (true) {
                                if (i13 < size) {
                                    j11 = j12;
                                    break;
                                }
                                range = fileLoadOperation.notRequestedBytesRanges.get(i13);
                                if (j11 == j19) {
                                    if (range.start > j11 && range.end > j11) {
                                        jMin = Long.MAX_VALUE;
                                        break;
                                    } else if (j11 >= range.start && range.start < j12) {
                                        j12 = range.start;
                                    }
                                }
                                jMin = Math.min(jMin, range.start);
                                i13++;
                            }
                            if (j11 != Long.MAX_VALUE) {
                                j10 = j11;
                            } else {
                                if (jMin != Long.MAX_VALUE) {
                                    boolean z12 = BuildVars.DEBUG_VERSION;
                                    return;
                                }
                                j10 = jMin;
                            }
                        } else {
                            j10 = fileLoadOperation.requestedBytesCount;
                        }
                    } else {
                        if (fileLoadOperation.moovFound == 0 && fileLoadOperation.preloadNotRequestedBytesCount <= j19) {
                            boolean z13 = BuildVars.DEBUG_VERSION;
                            return;
                        }
                        j10 = fileLoadOperation.nextPreloadDownloadOffset;
                        if (j10 == -1) {
                            i20 = (2097152 / fileLoadOperation.currentDownloadChunkSize) + 2;
                            j17 = j19;
                            while (true) {
                                if (i20 != 0) {
                                    j10 = j17;
                                } else {
                                    if (!fileLoadOperation.requestedPreloadedBytesRanges.containsKey(Long.valueOf(j17))) {
                                        j10 = j17;
                                        j19 = j19;
                                        z11 = true;
                                        break;
                                    }
                                    int i22 = fileLoadOperation.currentDownloadChunkSize;
                                    long j20 = i22;
                                    j17 += j20;
                                    j18 = fileLoadOperation.totalBytesCount;
                                    if (j17 > j18) {
                                        j10 = j17;
                                    } else {
                                        long j21 = j19;
                                        if (fileLoadOperation.moovFound != 2 && j17 == i22 * 8) {
                                            j17 = ((j18 - 1048576) / j20) * j20;
                                        }
                                        i20--;
                                        j19 = j21;
                                    }
                                }
                                z11 = false;
                                break;
                            }
                            if (!z11 && fileLoadOperation.requestInfos.isEmpty()) {
                                fileLoadOperation.onFinishLoadingFile(false, 0, false);
                            }
                        } else {
                            j19 = j19;
                        }
                        if (fileLoadOperation.requestedPreloadedBytesRanges == null) {
                            fileLoadOperation.requestedPreloadedBytesRanges = new HashMap<>();
                        }
                        fileLoadOperation.requestedPreloadedBytesRanges.put(Long.valueOf(j10), 1);
                        if (BuildVars.DEBUG_VERSION) {
                            StringBuilder sbQ = a9.p.q(j10, "start next preload from ", " size ");
                            sbQ.append(fileLoadOperation.totalBytesCount);
                            sbQ.append(" for ");
                            sbQ.append(fileLoadOperation.cacheFilePreload);
                            FileLog.d(sbQ.toString());
                        }
                        fileLoadOperation.preloadNotRequestedBytesCount -= (long) fileLoadOperation.currentDownloadChunkSize;
                    }
                    j13 = j10;
                    i14 = fileLoadOperation.preloadPrefixSize;
                    if (i14 <= 0 && j13 >= i14 && fileLoadOperation.canFinishPreload()) {
                        boolean z14 = BuildVars.DEBUG_VERSION;
                        return;
                    }
                    j14 = fileLoadOperation.totalBytesCount;
                    if (j14 <= j19 && j13 > j19 && j13 >= j14) {
                        boolean z15 = BuildVars.DEBUG_VERSION;
                        return;
                    }
                    if (!fileLoadOperation.isPreloadVideoOperation && (arrayList2 = fileLoadOperation.notRequestedBytesRanges) != null) {
                        fileLoadOperation.addPart(arrayList2, j13, ((long) fileLoadOperation.currentDownloadChunkSize) + j13, false);
                        boolean z16 = BuildVars.DEBUG_VERSION;
                    }
                    j15 = fileLoadOperation.totalBytesCount;
                    if (j15 > j19 || i12 == i11 - 1 || (j15 > j19 && ((long) fileLoadOperation.currentDownloadChunkSize) + j13 >= j15)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == -1) {
                        if (fileLoadOperation.requestsCount % 2 == 0) {
                            i19 = 2;
                        } else {
                            i19 = 65538;
                        }
                        i15 = i19;
                    } else {
                        i15 = i10;
                    }
                    if (fileLoadOperation.isForceRequest) {
                        i16 = 32;
                    } else {
                        i16 = 0;
                    }
                    if (fileLoadOperation.isCdn) {
                        TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile = new TLRPC.TL_upload_getCdnFile();
                        tL_upload_getCdnFile.file_token = fileLoadOperation.cdnToken;
                        tL_upload_getCdnFile.offset = j13;
                        tL_upload_getCdnFile.limit = fileLoadOperation.currentDownloadChunkSize;
                        i16 |= 1;
                        tLObject = tL_upload_getCdnFile;
                    } else if (fileLoadOperation.webLocation != null) {
                        TLRPC.TL_upload_getWebFile tL_upload_getWebFile = new TLRPC.TL_upload_getWebFile();
                        tL_upload_getWebFile.location = fileLoadOperation.webLocation;
                        tL_upload_getWebFile.offset = (int) j13;
                        tL_upload_getWebFile.limit = fileLoadOperation.currentDownloadChunkSize;
                        tLObject = tL_upload_getWebFile;
                    } else {
                        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                        tL_upload_getFile.location = fileLoadOperation.location;
                        tL_upload_getFile.offset = j13;
                        tL_upload_getFile.limit = fileLoadOperation.currentDownloadChunkSize;
                        tL_upload_getFile.cdn_supported = true;
                        tLObject = tL_upload_getFile;
                    }
                    tLObject2 = tLObject;
                    fileLoadOperation.requestedBytesCount += (long) fileLoadOperation.currentDownloadChunkSize;
                    requestInfo = new RequestInfo();
                    fileLoadOperation.requestInfos.add(requestInfo);
                    requestInfo.offset = j13;
                    requestInfo.chunkSize = fileLoadOperation.currentDownloadChunkSize;
                    requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                    requestInfo.connectionType = i15;
                    if (!fileLoadOperation.isPreloadVideoOperation || !fileLoadOperation.supportsPreloading || fileLoadOperation.preloadStream == null || (map = fileLoadOperation.preloadedBytesRanges) == null || (preloadRange = map.get(Long.valueOf(requestInfo.offset))) == null) {
                        if (fileLoadOperation.streamPriorityStartOffset != j19) {
                            if (BuildVars.DEBUG_VERSION) {
                                i0.a.y(new StringBuilder("frame get offset = "), fileLoadOperation.streamPriorityStartOffset);
                            }
                            j16 = j19;
                            fileLoadOperation.streamPriorityStartOffset = j16;
                            fileLoadOperation.priorityRequestInfo = requestInfo;
                        } else {
                            j16 = j19;
                        }
                        inputFileLocation = fileLoadOperation.location;
                        if ((inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) || ((TLRPC.TL_inputPeerPhotoFileLocation) inputFileLocation).photo_id != j16) {
                            requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                            if (BuildVars.LOGS_ENABLED) {
                                requestInfo.requestStartTime = System.currentTimeMillis();
                            }
                            int i23 = i16 | 2048;
                            if (fileLoadOperation.isCdn) {
                                i17 = fileLoadOperation.cdnDatacenterId;
                            } else {
                                i17 = fileLoadOperation.datacenterId;
                            }
                            i18 = i17;
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                            FileLoadOperation fileLoadOperation2 = fileLoadOperation;
                            fileLoadOperation = fileLoadOperation2;
                            int iSendRequestSync = connectionsManager.sendRequestSync(tLObject2, new u2(fileLoadOperation2, requestInfo, i18, i15, tLObject2, 0), null, null, i23, i18, i15, z10);
                            requestInfo.requestToken = iSendRequestSync;
                            if (BuildVars.LOGS_ENABLED) {
                                StringBuilder sb2 = new StringBuilder("debug_loading: ");
                                sb2.append(fileLoadOperation.cacheFileFinal.getName());
                                sb2.append(" dc=");
                                sb2.append(i18);
                                sb2.append(" send reqId ");
                                sb2.append(requestInfo.requestToken);
                                sb2.append(" offset=");
                                sb2.append(requestInfo.offset);
                                sb2.append(" conType=");
                                sb2.append(i15);
                                sb2.append(" priority=");
                                i0.a.v(fileLoadOperation.priority, sb2);
                            }
                            AndroidUtilities.runOnUIThread(new n2(fileLoadOperation, iSendRequestSync, 3));
                            fileLoadOperation.requestsCount++;
                        } else {
                            fileLoadOperation.requestReference(requestInfo);
                        }
                    } else {
                        requestInfo.response = new TLRPC.TL_upload_file();
                        try {
                            if (BuildVars.DEBUG_VERSION && preloadRange.length > 2147483647L) {
                                throw new RuntimeException("cast long to integer");
                            }
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer((int) preloadRange.length);
                            fileLoadOperation.preloadStream.seek(preloadRange.fileOffset);
                            fileLoadOperation.preloadStream.getChannel().read(nativeByteBuffer.buffer);
                            nativeByteBuffer.buffer.position(0);
                            requestInfo.response.bytes = nativeByteBuffer;
                            Utilities.stageQueue.postRunnable(new t2(fileLoadOperation, requestInfo, i21));
                            j16 = j19;
                        } catch (Exception unused) {
                            if (fileLoadOperation.streamPriorityStartOffset != j19) {
                                if (BuildVars.DEBUG_VERSION) {
                                    i0.a.y(new StringBuilder("frame get offset = "), fileLoadOperation.streamPriorityStartOffset);
                                }
                                j16 = j19;
                                fileLoadOperation.streamPriorityStartOffset = j16;
                                fileLoadOperation.priorityRequestInfo = requestInfo;
                            } else {
                                j16 = j19;
                            }
                            inputFileLocation = fileLoadOperation.location;
                            if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                                requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                                if (BuildVars.LOGS_ENABLED) {
                                    requestInfo.requestStartTime = System.currentTimeMillis();
                                }
                                int i24 = i16 | 2048;
                                if (fileLoadOperation.isCdn) {
                                    i17 = fileLoadOperation.cdnDatacenterId;
                                } else {
                                    i17 = fileLoadOperation.datacenterId;
                                }
                                i18 = i17;
                                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                                FileLoadOperation fileLoadOperation3 = fileLoadOperation;
                                fileLoadOperation = fileLoadOperation3;
                                int iSendRequestSync2 = connectionsManager2.sendRequestSync(tLObject2, new u2(fileLoadOperation3, requestInfo, i18, i15, tLObject2, 0), null, null, i24, i18, i15, z10);
                                requestInfo.requestToken = iSendRequestSync2;
                                if (BuildVars.LOGS_ENABLED) {
                                    StringBuilder sb3 = new StringBuilder("debug_loading: ");
                                    sb3.append(fileLoadOperation.cacheFileFinal.getName());
                                    sb3.append(" dc=");
                                    sb3.append(i18);
                                    sb3.append(" send reqId ");
                                    sb3.append(requestInfo.requestToken);
                                    sb3.append(" offset=");
                                    sb3.append(requestInfo.offset);
                                    sb3.append(" conType=");
                                    sb3.append(i15);
                                    sb3.append(" priority=");
                                    i0.a.v(fileLoadOperation.priority, sb3);
                                }
                                AndroidUtilities.runOnUIThread(new n2(fileLoadOperation, iSendRequestSync2, 3));
                                fileLoadOperation.requestsCount++;
                            } else {
                                requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                                if (BuildVars.LOGS_ENABLED) {
                                    requestInfo.requestStartTime = System.currentTimeMillis();
                                }
                                int i25 = i16 | 2048;
                                if (fileLoadOperation.isCdn) {
                                    i17 = fileLoadOperation.cdnDatacenterId;
                                } else {
                                    i17 = fileLoadOperation.datacenterId;
                                }
                                i18 = i17;
                                ConnectionsManager connectionsManager3 = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                                FileLoadOperation fileLoadOperation4 = fileLoadOperation;
                                fileLoadOperation = fileLoadOperation4;
                                int iSendRequestSync3 = connectionsManager3.sendRequestSync(tLObject2, new u2(fileLoadOperation4, requestInfo, i18, i15, tLObject2, 0), null, null, i25, i18, i15, z10);
                                requestInfo.requestToken = iSendRequestSync3;
                                if (BuildVars.LOGS_ENABLED) {
                                    StringBuilder sb4 = new StringBuilder("debug_loading: ");
                                    sb4.append(fileLoadOperation.cacheFileFinal.getName());
                                    sb4.append(" dc=");
                                    sb4.append(i18);
                                    sb4.append(" send reqId ");
                                    sb4.append(requestInfo.requestToken);
                                    sb4.append(" offset=");
                                    sb4.append(requestInfo.offset);
                                    sb4.append(" conType=");
                                    sb4.append(i15);
                                    sb4.append(" priority=");
                                    i0.a.v(fileLoadOperation.priority, sb4);
                                }
                                AndroidUtilities.runOnUIThread(new n2(fileLoadOperation, iSendRequestSync3, 3));
                                fileLoadOperation.requestsCount++;
                            }
                        }
                    }
                    i12++;
                    j19 = j16;
                }
            }
            iMax = Math.max(0, fileLoadOperation.currentMaxDownloadRequests - fileLoadOperation.requestInfos.size());
            i11 = iMax;
            if (!fileLoadOperation.requestedReference) {
                FileLog.d(fileLoadOperation.fileName + " before download updated file ref from file ref cache!");
            }
            i12 = 0;
            while (i12 < i11) {
                if (!fileLoadOperation.isPreloadVideoOperation) {
                    if (fileLoadOperation.moovFound == 0) {
                    }
                    j10 = fileLoadOperation.nextPreloadDownloadOffset;
                    if (j10 == -1) {
                        i20 = (2097152 / fileLoadOperation.currentDownloadChunkSize) + 2;
                        j17 = j19;
                        while (true) {
                            if (i20 != 0) {
                                j10 = j17;
                            } else {
                                if (!fileLoadOperation.requestedPreloadedBytesRanges.containsKey(Long.valueOf(j17))) {
                                    j10 = j17;
                                    j19 = j19;
                                    z11 = true;
                                    break;
                                }
                                int i26 = fileLoadOperation.currentDownloadChunkSize;
                                long j22 = i26;
                                j17 += j22;
                                j18 = fileLoadOperation.totalBytesCount;
                                if (j17 > j18) {
                                    j10 = j17;
                                } else {
                                    long j23 = j19;
                                    if (fileLoadOperation.moovFound != 2) {
                                    }
                                    i20--;
                                    j19 = j23;
                                }
                            }
                            z11 = false;
                            break;
                        }
                        if (!z11) {
                            fileLoadOperation.onFinishLoadingFile(false, 0, false);
                        }
                    } else {
                        j19 = j19;
                    }
                    if (fileLoadOperation.requestedPreloadedBytesRanges == null) {
                        fileLoadOperation.requestedPreloadedBytesRanges = new HashMap<>();
                    }
                    fileLoadOperation.requestedPreloadedBytesRanges.put(Long.valueOf(j10), 1);
                    if (BuildVars.DEBUG_VERSION) {
                        StringBuilder sbQ2 = a9.p.q(j10, "start next preload from ", " size ");
                        sbQ2.append(fileLoadOperation.totalBytesCount);
                        sbQ2.append(" for ");
                        sbQ2.append(fileLoadOperation.cacheFilePreload);
                        FileLog.d(sbQ2.toString());
                    }
                    fileLoadOperation.preloadNotRequestedBytesCount -= (long) fileLoadOperation.currentDownloadChunkSize;
                } else {
                    j19 = j19;
                    arrayList = fileLoadOperation.notRequestedBytesRanges;
                    if (arrayList != null) {
                        j11 = fileLoadOperation.streamPriorityStartOffset;
                        if (j11 == j19) {
                            j11 = fileLoadOperation.streamStartOffset;
                        }
                        size = arrayList.size();
                        i13 = 0;
                        j12 = Long.MAX_VALUE;
                        jMin = Long.MAX_VALUE;
                        while (true) {
                            if (i13 < size) {
                                j11 = j12;
                                break;
                            }
                            range = fileLoadOperation.notRequestedBytesRanges.get(i13);
                            if (j11 == j19) {
                                if (range.start > j11) {
                                }
                                if (j11 >= range.start) {
                                }
                            }
                            jMin = Math.min(jMin, range.start);
                            i13++;
                        }
                        if (j11 != Long.MAX_VALUE) {
                            j10 = j11;
                        } else {
                            if (jMin != Long.MAX_VALUE) {
                                boolean z17 = BuildVars.DEBUG_VERSION;
                                return;
                            }
                            j10 = jMin;
                        }
                    } else {
                        j10 = fileLoadOperation.requestedBytesCount;
                    }
                }
                j13 = j10;
                i14 = fileLoadOperation.preloadPrefixSize;
                if (i14 <= 0) {
                }
                j14 = fileLoadOperation.totalBytesCount;
                if (j14 <= j19) {
                }
                if (!fileLoadOperation.isPreloadVideoOperation) {
                    fileLoadOperation.addPart(arrayList2, j13, ((long) fileLoadOperation.currentDownloadChunkSize) + j13, false);
                    boolean z18 = BuildVars.DEBUG_VERSION;
                }
                j15 = fileLoadOperation.totalBytesCount;
                if (j15 > j19) {
                    z10 = true;
                } else {
                    z10 = true;
                }
                if (i10 == -1) {
                    if (fileLoadOperation.requestsCount % 2 == 0) {
                        i19 = 2;
                    } else {
                        i19 = 65538;
                    }
                    i15 = i19;
                } else {
                    i15 = i10;
                }
                if (fileLoadOperation.isForceRequest) {
                    i16 = 32;
                } else {
                    i16 = 0;
                }
                if (fileLoadOperation.isCdn) {
                    TLRPC.TL_upload_getCdnFile tL_upload_getCdnFile2 = new TLRPC.TL_upload_getCdnFile();
                    tL_upload_getCdnFile2.file_token = fileLoadOperation.cdnToken;
                    tL_upload_getCdnFile2.offset = j13;
                    tL_upload_getCdnFile2.limit = fileLoadOperation.currentDownloadChunkSize;
                    i16 |= 1;
                    tLObject = tL_upload_getCdnFile2;
                } else if (fileLoadOperation.webLocation != null) {
                    TLRPC.TL_upload_getWebFile tL_upload_getWebFile2 = new TLRPC.TL_upload_getWebFile();
                    tL_upload_getWebFile2.location = fileLoadOperation.webLocation;
                    tL_upload_getWebFile2.offset = (int) j13;
                    tL_upload_getWebFile2.limit = fileLoadOperation.currentDownloadChunkSize;
                    tLObject = tL_upload_getWebFile2;
                } else {
                    TLRPC.TL_upload_getFile tL_upload_getFile2 = new TLRPC.TL_upload_getFile();
                    tL_upload_getFile2.location = fileLoadOperation.location;
                    tL_upload_getFile2.offset = j13;
                    tL_upload_getFile2.limit = fileLoadOperation.currentDownloadChunkSize;
                    tL_upload_getFile2.cdn_supported = true;
                    tLObject = tL_upload_getFile2;
                }
                tLObject2 = tLObject;
                fileLoadOperation.requestedBytesCount += (long) fileLoadOperation.currentDownloadChunkSize;
                requestInfo = new RequestInfo();
                fileLoadOperation.requestInfos.add(requestInfo);
                requestInfo.offset = j13;
                requestInfo.chunkSize = fileLoadOperation.currentDownloadChunkSize;
                requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                requestInfo.connectionType = i15;
                if (fileLoadOperation.isPreloadVideoOperation) {
                    if (fileLoadOperation.streamPriorityStartOffset != j19) {
                        if (BuildVars.DEBUG_VERSION) {
                            i0.a.y(new StringBuilder("frame get offset = "), fileLoadOperation.streamPriorityStartOffset);
                        }
                        j16 = j19;
                        fileLoadOperation.streamPriorityStartOffset = j16;
                        fileLoadOperation.priorityRequestInfo = requestInfo;
                    } else {
                        j16 = j19;
                    }
                    inputFileLocation = fileLoadOperation.location;
                    if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                        requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                        if (BuildVars.LOGS_ENABLED) {
                            requestInfo.requestStartTime = System.currentTimeMillis();
                        }
                        int i27 = i16 | 2048;
                        if (fileLoadOperation.isCdn) {
                            i17 = fileLoadOperation.cdnDatacenterId;
                        } else {
                            i17 = fileLoadOperation.datacenterId;
                        }
                        i18 = i17;
                        ConnectionsManager connectionsManager4 = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                        FileLoadOperation fileLoadOperation5 = fileLoadOperation;
                        fileLoadOperation = fileLoadOperation5;
                        int iSendRequestSync4 = connectionsManager4.sendRequestSync(tLObject2, new u2(fileLoadOperation5, requestInfo, i18, i15, tLObject2, 0), null, null, i27, i18, i15, z10);
                        requestInfo.requestToken = iSendRequestSync4;
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb5 = new StringBuilder("debug_loading: ");
                            sb5.append(fileLoadOperation.cacheFileFinal.getName());
                            sb5.append(" dc=");
                            sb5.append(i18);
                            sb5.append(" send reqId ");
                            sb5.append(requestInfo.requestToken);
                            sb5.append(" offset=");
                            sb5.append(requestInfo.offset);
                            sb5.append(" conType=");
                            sb5.append(i15);
                            sb5.append(" priority=");
                            i0.a.v(fileLoadOperation.priority, sb5);
                        }
                        AndroidUtilities.runOnUIThread(new n2(fileLoadOperation, iSendRequestSync4, 3));
                        fileLoadOperation.requestsCount++;
                    } else {
                        requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                        if (BuildVars.LOGS_ENABLED) {
                            requestInfo.requestStartTime = System.currentTimeMillis();
                        }
                        int i28 = i16 | 2048;
                        if (fileLoadOperation.isCdn) {
                            i17 = fileLoadOperation.cdnDatacenterId;
                        } else {
                            i17 = fileLoadOperation.datacenterId;
                        }
                        i18 = i17;
                        ConnectionsManager connectionsManager5 = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                        FileLoadOperation fileLoadOperation6 = fileLoadOperation;
                        fileLoadOperation = fileLoadOperation6;
                        int iSendRequestSync5 = connectionsManager5.sendRequestSync(tLObject2, new u2(fileLoadOperation6, requestInfo, i18, i15, tLObject2, 0), null, null, i28, i18, i15, z10);
                        requestInfo.requestToken = iSendRequestSync5;
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb6 = new StringBuilder("debug_loading: ");
                            sb6.append(fileLoadOperation.cacheFileFinal.getName());
                            sb6.append(" dc=");
                            sb6.append(i18);
                            sb6.append(" send reqId ");
                            sb6.append(requestInfo.requestToken);
                            sb6.append(" offset=");
                            sb6.append(requestInfo.offset);
                            sb6.append(" conType=");
                            sb6.append(i15);
                            sb6.append(" priority=");
                            i0.a.v(fileLoadOperation.priority, sb6);
                        }
                        AndroidUtilities.runOnUIThread(new n2(fileLoadOperation, iSendRequestSync5, 3));
                        fileLoadOperation.requestsCount++;
                    }
                } else {
                    if (fileLoadOperation.streamPriorityStartOffset != j19) {
                        if (BuildVars.DEBUG_VERSION) {
                            i0.a.y(new StringBuilder("frame get offset = "), fileLoadOperation.streamPriorityStartOffset);
                        }
                        j16 = j19;
                        fileLoadOperation.streamPriorityStartOffset = j16;
                        fileLoadOperation.priorityRequestInfo = requestInfo;
                    } else {
                        j16 = j19;
                    }
                    inputFileLocation = fileLoadOperation.location;
                    if (inputFileLocation instanceof TLRPC.TL_inputPeerPhotoFileLocation) {
                        requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                        if (BuildVars.LOGS_ENABLED) {
                            requestInfo.requestStartTime = System.currentTimeMillis();
                        }
                        int i29 = i16 | 2048;
                        if (fileLoadOperation.isCdn) {
                            i17 = fileLoadOperation.cdnDatacenterId;
                        } else {
                            i17 = fileLoadOperation.datacenterId;
                        }
                        i18 = i17;
                        ConnectionsManager connectionsManager6 = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                        FileLoadOperation fileLoadOperation7 = fileLoadOperation;
                        fileLoadOperation = fileLoadOperation7;
                        int iSendRequestSync6 = connectionsManager6.sendRequestSync(tLObject2, new u2(fileLoadOperation7, requestInfo, i18, i15, tLObject2, 0), null, null, i29, i18, i15, z10);
                        requestInfo.requestToken = iSendRequestSync6;
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb7 = new StringBuilder("debug_loading: ");
                            sb7.append(fileLoadOperation.cacheFileFinal.getName());
                            sb7.append(" dc=");
                            sb7.append(i18);
                            sb7.append(" send reqId ");
                            sb7.append(requestInfo.requestToken);
                            sb7.append(" offset=");
                            sb7.append(requestInfo.offset);
                            sb7.append(" conType=");
                            sb7.append(i15);
                            sb7.append(" priority=");
                            i0.a.v(fileLoadOperation.priority, sb7);
                        }
                        AndroidUtilities.runOnUIThread(new n2(fileLoadOperation, iSendRequestSync6, 3));
                        fileLoadOperation.requestsCount++;
                    } else {
                        requestInfo.forceSmallChunk = fileLoadOperation.forceSmallChunk;
                        if (BuildVars.LOGS_ENABLED) {
                            requestInfo.requestStartTime = System.currentTimeMillis();
                        }
                        int i210 = i16 | 2048;
                        if (fileLoadOperation.isCdn) {
                            i17 = fileLoadOperation.cdnDatacenterId;
                        } else {
                            i17 = fileLoadOperation.datacenterId;
                        }
                        i18 = i17;
                        ConnectionsManager connectionsManager7 = ConnectionsManager.getInstance(fileLoadOperation.currentAccount);
                        FileLoadOperation fileLoadOperation8 = fileLoadOperation;
                        fileLoadOperation = fileLoadOperation8;
                        int iSendRequestSync7 = connectionsManager7.sendRequestSync(tLObject2, new u2(fileLoadOperation8, requestInfo, i18, i15, tLObject2, 0), null, null, i210, i18, i15, z10);
                        requestInfo.requestToken = iSendRequestSync7;
                        if (BuildVars.LOGS_ENABLED) {
                            StringBuilder sb8 = new StringBuilder("debug_loading: ");
                            sb8.append(fileLoadOperation.cacheFileFinal.getName());
                            sb8.append(" dc=");
                            sb8.append(i18);
                            sb8.append(" send reqId ");
                            sb8.append(requestInfo.requestToken);
                            sb8.append(" offset=");
                            sb8.append(requestInfo.offset);
                            sb8.append(" conType=");
                            sb8.append(i15);
                            sb8.append(" priority=");
                            i0.a.v(fileLoadOperation.priority, sb8);
                        }
                        AndroidUtilities.runOnUIThread(new n2(fileLoadOperation, iSendRequestSync7, 3));
                        fileLoadOperation.requestsCount++;
                    }
                }
                i12++;
                j19 = j16;
            }
        }
    }

    public void updateProgress() {
        FileLoadOperationDelegate fileLoadOperationDelegate = this.delegate;
        if (fileLoadOperationDelegate != null) {
            long j10 = this.downloadedBytes;
            long j11 = this.totalBytesCount;
            if (j10 == j11 || j11 <= 0) {
                return;
            }
            fileLoadOperationDelegate.didChangedLoadProgress(this, j10, j11);
        }
    }

    public boolean wasStarted() {
        return this.started && !this.paused;
    }

    private void cancel(boolean z10) {
        Utilities.stageQueue.postRunnable(new q2(this, z10, 1));
    }

    public boolean start(final FileLoadOperationStream fileLoadOperationStream, final long j10, final boolean z10) {
        long j11;
        String strO;
        String strP;
        String strO2;
        String strO3;
        String strO4;
        String strO5;
        String strO6;
        Object obj;
        boolean zExists;
        boolean z11;
        int i10;
        FilePathDatabase.PathData pathData;
        boolean z12;
        boolean[] zArr;
        boolean z13;
        long j12;
        long j13;
        int i11;
        ArrayList<Range> arrayList;
        ArrayList<Range> arrayList2;
        ?? r10;
        RandomAccessFile randomAccessFile;
        long j14;
        long length;
        long j15;
        int size;
        int i12;
        ArrayList<Range> arrayList3;
        long length2;
        int i13;
        int i14;
        RandomAccessFile randomAccessFile2;
        RandomAccessFile randomAccessFile3;
        long length3;
        byte[] bArr;
        long j16;
        String strL;
        String strL2;
        this.startTime = System.currentTimeMillis();
        updateParams();
        if (this.currentDownloadChunkSize == 0) {
            if (this.forceSmallChunk) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_loading: restart with small chunk");
                }
                this.currentDownloadChunkSize = 32768;
                this.currentMaxDownloadRequests = 4;
            } else if (this.isStory) {
                this.currentDownloadChunkSize = this.downloadChunkSizeBig;
                this.currentMaxDownloadRequests = this.maxDownloadRequestsBig;
            } else if (this.isStream) {
                this.currentDownloadChunkSize = this.downloadChunkSizeAnimation;
                this.currentMaxDownloadRequests = this.maxDownloadRequestsAnimation;
            } else {
                boolean z14 = this.totalBytesCount >= ((long) this.bigFileSizeFrom);
                this.currentDownloadChunkSize = z14 ? this.downloadChunkSizeBig : this.downloadChunkSize;
                this.currentMaxDownloadRequests = z14 ? this.maxDownloadRequestsBig : this.maxDownloadRequests;
            }
        }
        final boolean z15 = this.state != 0;
        boolean z16 = this.paused;
        this.paused = false;
        if (fileLoadOperationStream != null) {
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f21484a.lambda$start$9(z10, j10, fileLoadOperationStream, z15);
                }
            });
        } else if (z15) {
            Utilities.stageQueue.postRunnable(new p2(this, 1));
        }
        if (z15) {
            return z16;
        }
        if (this.location == null && this.webLocation == null) {
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("loadOperation: no location, failing");
            }
            onFail(true, 0);
            return false;
        }
        long j17 = this.currentDownloadChunkSize;
        this.streamStartOffset = (j10 / j17) * j17;
        if (this.allowDisordererFileSave) {
            long j18 = this.totalBytesCount;
            if (j18 > 0 && j18 > j17) {
                this.notLoadedBytesRanges = new ArrayList<>();
                this.notRequestedBytesRanges = new ArrayList<>();
            }
        }
        if (this.webLocation == null) {
            TLRPC.InputFileLocation inputFileLocation = this.location;
            long j19 = inputFileLocation.volume_id;
            j11 = 0;
            if (j19 == 0 || inputFileLocation.local_id == 0) {
                if (this.datacenterId == 0 || inputFileLocation.f22395id == 0) {
                    onFail(true, 0);
                    return false;
                }
                if (this.encryptFile) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.datacenterId);
                    sb2.append("_");
                    strO5 = a9.p.o(sb2, this.location.f22395id, ".temp.enc");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.datacenterId);
                    sb3.append("_");
                    sb3.append(this.location.f22395id);
                    strP = a9.p.p(sb3, this.ext, ".enc");
                    if (this.key != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(this.datacenterId);
                        sb4.append("_");
                        strO6 = a9.p.o(sb4, this.location.f22395id, "_64.iv.enc");
                        String str = strO5;
                        strO2 = strO6;
                        strO = str;
                    } else {
                        strO = strO5;
                        strO2 = null;
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(this.datacenterId);
                    sb5.append("_");
                    strO = a9.p.o(sb5, this.location.f22395id, ".temp");
                    strP = this.datacenterId + "_" + this.location.f22395id + this.ext;
                    if (this.key != null) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(this.datacenterId);
                        sb6.append("_");
                        strO2 = a9.p.o(sb6, this.location.f22395id, "_64.iv");
                    } else {
                        strO2 = null;
                    }
                    if (this.notLoadedBytesRanges != null) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(this.datacenterId);
                        sb7.append("_");
                        strO3 = a9.p.o(sb7, this.location.f22395id, "_64.pt");
                    } else {
                        strO3 = null;
                    }
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(this.datacenterId);
                    sb8.append("_");
                    strO4 = a9.p.o(sb8, this.location.f22395id, "_64.preload");
                }
            } else {
                int i15 = this.datacenterId;
                if (i15 == Integer.MIN_VALUE || j19 == -2147483648L || i15 == 0) {
                    onFail(true, 0);
                    return false;
                }
                if (this.encryptFile) {
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(this.location.volume_id);
                    sb9.append("_");
                    strO5 = a9.p.k(this.location.local_id, ".temp.enc", sb9);
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(this.location.volume_id);
                    sb10.append("_");
                    sb10.append(this.location.local_id);
                    sb10.append(".");
                    strP = a9.p.p(sb10, this.ext, ".enc");
                    if (this.key != null) {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(this.location.volume_id);
                        sb11.append("_");
                        strO6 = a9.p.k(this.location.local_id, "_64.iv.enc", sb11);
                        String str2 = strO5;
                        strO2 = strO6;
                        strO = str2;
                    } else {
                        strO = strO5;
                        strO2 = null;
                    }
                } else {
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(this.location.volume_id);
                    sb12.append("_");
                    strO = a9.p.k(this.location.local_id, ".temp", sb12);
                    strP = this.location.volume_id + "_" + this.location.local_id + "." + this.ext;
                    if (this.key != null) {
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append(this.location.volume_id);
                        sb13.append("_");
                        strO2 = a9.p.k(this.location.local_id, "_64.iv", sb13);
                    } else {
                        strO2 = null;
                    }
                    if (this.notLoadedBytesRanges != null) {
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append(this.location.volume_id);
                        sb14.append("_");
                        strO3 = a9.p.k(this.location.local_id, "_64.pt", sb14);
                    } else {
                        strO3 = null;
                    }
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(this.location.volume_id);
                    sb15.append("_");
                    strO4 = a9.p.k(this.location.local_id, "_64.preload", sb15);
                }
            }
            this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
            this.cancelledRequestInfos = new ArrayList<>();
            this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
            this.state = 1;
            obj = this.parentObject;
            if (obj instanceof TLRPC.TL_theme) {
                this.cacheFileFinal = new File(ApplicationLoader.getFilesDirFixed(), a9.p.o(new StringBuilder("remote"), ((TLRPC.TL_theme) obj).f22517id, ".attheme"));
            } else if (this.encryptFile) {
                this.cacheFileFinal = new File(this.storePath, strP);
            } else {
                this.cacheFileFinal = new File(this.storePath, this.storeFileName);
            }
            zExists = this.cacheFileFinal.exists();
            this.cacheFileFinalReady = zExists;
            if (zExists) {
                if (!(this.parentObject instanceof TLRPC.TL_theme)) {
                    j16 = this.totalBytesCount;
                    if (j16 != j11 && !this.ungzip && j16 != this.cacheFileFinal.length()) {
                        if (!this.delegate.isLocallyCreatedFile(this.cacheFileFinal.toString())) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("debug_loading: delete existing file cause file size mismatch " + this.cacheFileFinal.getName() + " totalSize=" + this.totalBytesCount + " existingFileSize=" + this.cacheFileFinal.length());
                            }
                            if (!this.delegate.hasAnotherRefOnFile(this.cacheFileFinal.toString())) {
                                this.cacheFileFinal.delete();
                            }
                            zExists = false;
                        }
                    }
                } else if (!this.delegate.isLocallyCreatedFile(this.cacheFileFinal.toString())) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.d("debug_loading: delete existing file cause file size mismatch " + this.cacheFileFinal.getName() + " totalSize=" + this.totalBytesCount + " existingFileSize=" + this.cacheFileFinal.length());
                    }
                    if (!this.delegate.hasAnotherRefOnFile(this.cacheFileFinal.toString())) {
                        this.cacheFileFinal.delete();
                    }
                    zExists = false;
                }
            }
            if (zExists) {
                z11 = true;
                this.started = true;
                try {
                    onFinishLoadingFile(false, 1, false);
                    pathData = this.pathSaveData;
                    if (pathData != null) {
                        this.delegate.saveFilePath(pathData, this.cacheFileFinal);
                        return true;
                    }
                } catch (Exception e9) {
                    FileLog.e((Throwable) e9, false);
                    if (AndroidUtilities.isENOSPC(e9)) {
                        z11 = true;
                        LaunchActivity.E(1);
                        i10 = -1;
                        onFail(true, -1);
                    } else {
                        i10 = -1;
                        z11 = true;
                    }
                    if (AndroidUtilities.isEROFS(e9)) {
                        SharedConfig.checkSdCard(this.cacheFileFinal);
                        onFail(z11, i10);
                        return false;
                    }
                    onFail(z11, 0);
                }
            } else {
                this.cacheFileTemp = new File(this.tempPath, strO);
                if (this.ungzip) {
                    this.cacheFileGzipTemp = new File(this.tempPath, s3.c.l(strO, ".gz"));
                }
                if (this.encryptFile) {
                    File file = new File(FileLoader.getInternalCacheDir(), s3.c.l(strP, ".key"));
                    try {
                        randomAccessFile3 = new RandomAccessFile(file, "rws");
                        length3 = file.length();
                        bArr = new byte[32];
                        this.encryptKey = bArr;
                        this.encryptIv = new byte[16];
                        if (length3 > j11 || length3 % 48 != j11) {
                            Utilities.random.nextBytes(bArr);
                            Utilities.random.nextBytes(this.encryptIv);
                            randomAccessFile3.write(this.encryptKey);
                            randomAccessFile3.write(this.encryptIv);
                            z12 = true;
                        } else {
                            randomAccessFile3.read(bArr, 0, 32);
                            randomAccessFile3.read(this.encryptIv, 0, 16);
                            z12 = false;
                        }
                        try {
                            try {
                                randomAccessFile3.getChannel().close();
                            } catch (Exception e10) {
                                e = e10;
                                if (AndroidUtilities.isENOSPC(e)) {
                                    LaunchActivity.E(1);
                                    FileLog.e((Throwable) e, false);
                                } else if (AndroidUtilities.isEROFS(e)) {
                                    SharedConfig.checkSdCard(this.cacheFileFinal);
                                    FileLog.e((Throwable) e, false);
                                } else {
                                    FileLog.e(e);
                                }
                            }
                        } catch (Exception e11) {
                            FileLog.e(e11);
                        }
                        randomAccessFile3.close();
                    } catch (Exception e12) {
                        e = e12;
                        z12 = false;
                    }
                } else {
                    z12 = false;
                }
                zArr = new boolean[]{false};
                long j20 = 8;
                if (this.supportsPreloading || strO4 == null) {
                    z13 = z12;
                    j12 = 8;
                    j13 = 2;
                    i11 = 1;
                } else {
                    this.cacheFilePreload = new File(this.tempPath, strO4);
                    try {
                        RandomAccessFile randomAccessFile4 = new RandomAccessFile(this.cacheFilePreload, "rws");
                        this.preloadStream = randomAccessFile4;
                        long length4 = randomAccessFile4.length();
                        this.preloadStreamFileOffset = 1;
                        long j21 = 1;
                        if (length4 <= 1) {
                            z13 = z12;
                            j12 = j20;
                            j13 = 2;
                            i11 = 1;
                            this.preloadStream.seek(this.preloadStreamFileOffset);
                            if (!this.isPreloadVideoOperation && this.preloadedBytesRanges == null) {
                                this.cacheFilePreload = null;
                                try {
                                    randomAccessFile2 = this.preloadStream;
                                    if (randomAccessFile2 != null) {
                                        try {
                                            randomAccessFile2.getChannel().close();
                                        } catch (Exception e13) {
                                            FileLog.e(e13);
                                        }
                                        this.preloadStream.close();
                                        this.preloadStream = null;
                                    }
                                } catch (Exception e14) {
                                    FileLog.e(e14);
                                }
                            }
                        } else {
                            zArr[0] = this.preloadStream.readByte() != 0;
                            while (true) {
                                if (j21 < length4 && length4 - j21 >= j20) {
                                    long j22 = this.preloadStream.readLong();
                                    if (length4 - (j21 + j20) >= j20 && j22 >= j11) {
                                        j13 = 2;
                                        try {
                                            if (j22 <= this.totalBytesCount) {
                                                long j23 = this.preloadStream.readLong();
                                                long j24 = j21 + 16;
                                                if (length4 - j24 >= j23 && j23 <= this.currentDownloadChunkSize) {
                                                    PreloadRange preloadRange = new PreloadRange(j24, j23);
                                                    long j25 = j24 + j23;
                                                    this.preloadStream.seek(j25);
                                                    if (length4 - j25 >= 24) {
                                                        j12 = j20;
                                                        try {
                                                            long j26 = this.preloadStream.readLong();
                                                            this.foundMoovSize = j26;
                                                            if (j26 != j11) {
                                                                z13 = z12;
                                                                try {
                                                                    i11 = 1;
                                                                    try {
                                                                        this.moovFound = this.nextPreloadDownloadOffset > this.totalBytesCount / 2 ? 2 : 1;
                                                                        this.preloadNotRequestedBytesCount = j26;
                                                                    } catch (Exception e15) {
                                                                        e = e15;
                                                                    }
                                                                } catch (Exception e16) {
                                                                    e = e16;
                                                                    i11 = 1;
                                                                    FileLog.e((Throwable) e, false);
                                                                    if (!this.isPreloadVideoOperation) {
                                                                        this.cacheFilePreload = null;
                                                                        randomAccessFile2 = this.preloadStream;
                                                                        if (randomAccessFile2 != null) {
                                                                            randomAccessFile2.getChannel().close();
                                                                            this.preloadStream.close();
                                                                            this.preloadStream = null;
                                                                        }
                                                                    }
                                                                    if (strO3 != null) {
                                                                        this.cacheFileParts = new File(this.tempPath, strO3);
                                                                        if (!this.cacheFileTemp.exists()) {
                                                                            this.cacheFileParts.delete();
                                                                        }
                                                                        try {
                                                                            RandomAccessFile randomAccessFile5 = new RandomAccessFile(this.cacheFileParts, "rws");
                                                                            this.filePartsStream = randomAccessFile5;
                                                                            length2 = randomAccessFile5.length();
                                                                            if (length2 % j12 == 4) {
                                                                                i13 = this.filePartsStream.readInt();
                                                                                if (i13 <= (length2 - 4) / j13) {
                                                                                    for (i14 = 0; i14 < i13; i14++) {
                                                                                        long j27 = this.filePartsStream.readLong();
                                                                                        long j28 = this.filePartsStream.readLong();
                                                                                        this.notLoadedBytesRanges.add(new Range(j27, j28));
                                                                                        this.notRequestedBytesRanges.add(new Range(j27, j28));
                                                                                    }
                                                                                }
                                                                            }
                                                                        } catch (Exception e17) {
                                                                            FileLog.e(e17, !AndroidUtilities.isFilNotFoundException(e17));
                                                                        }
                                                                    }
                                                                    if (this.fileMetadata != null) {
                                                                        FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileParts, this.fileMetadata);
                                                                        FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileTemp, this.fileMetadata);
                                                                    }
                                                                    if (!this.cacheFileTemp.exists()) {
                                                                        arrayList = this.notLoadedBytesRanges;
                                                                        if (arrayList != null) {
                                                                            long j29 = 0;
                                                                            this.notLoadedBytesRanges.add(new Range(j29, this.totalBytesCount));
                                                                            this.notRequestedBytesRanges.add(new Range(j29, this.totalBytesCount));
                                                                        }
                                                                    } else if (z13) {
                                                                        this.cacheFileTemp.delete();
                                                                    } else {
                                                                        long length5 = this.cacheFileTemp.length();
                                                                        if (strO2 != null) {
                                                                            long jFloorDiv = floorDiv(this.cacheFileTemp.length(), this.currentDownloadChunkSize) * ((long) this.currentDownloadChunkSize);
                                                                            this.downloadedBytes = jFloorDiv;
                                                                            this.requestedBytesCount = jFloorDiv;
                                                                        } else {
                                                                            long jFloorDiv2 = floorDiv(this.cacheFileTemp.length(), this.currentDownloadChunkSize) * ((long) this.currentDownloadChunkSize);
                                                                            this.downloadedBytes = jFloorDiv2;
                                                                            this.requestedBytesCount = jFloorDiv2;
                                                                        }
                                                                        arrayList3 = this.notLoadedBytesRanges;
                                                                        if (arrayList3 != null) {
                                                                            this.notLoadedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                                                                            this.notRequestedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                                                                        }
                                                                    }
                                                                    arrayList2 = this.notLoadedBytesRanges;
                                                                    if (arrayList2 != null) {
                                                                        this.downloadedBytes = this.totalBytesCount;
                                                                        size = arrayList2.size();
                                                                        for (i12 = 0; i12 < size; i12++) {
                                                                            Range range = this.notLoadedBytesRanges.get(i12);
                                                                            this.downloadedBytes -= range.end - range.start;
                                                                        }
                                                                        this.requestedBytesCount = this.downloadedBytes;
                                                                    }
                                                                    if (BuildVars.LOGS_ENABLED) {
                                                                        if (this.isPreloadVideoOperation) {
                                                                            FileLog.d("start preloading file to temp = " + this.cacheFileTemp);
                                                                        } else {
                                                                            StringBuilder sb16 = new StringBuilder("start loading file to temp = ");
                                                                            sb16.append(this.cacheFileTemp);
                                                                            sb16.append(" final = ");
                                                                            sb16.append(this.cacheFileFinal);
                                                                            sb16.append(" priority");
                                                                            i0.a.v(this.priority, sb16);
                                                                        }
                                                                    }
                                                                    if (strO2 != null) {
                                                                        this.cacheIvTemp = new File(this.tempPath, strO2);
                                                                        try {
                                                                            this.fiv = new RandomAccessFile(this.cacheIvTemp, "rws");
                                                                            if (this.downloadedBytes != 0) {
                                                                                length = this.cacheIvTemp.length();
                                                                                if (length <= 0) {
                                                                                    j15 = 0;
                                                                                } else if (length % 64 == 0) {
                                                                                    this.fiv.read(this.iv, 0, 64);
                                                                                } else {
                                                                                    j15 = 0;
                                                                                }
                                                                                this.downloadedBytes = j15;
                                                                                this.requestedBytesCount = j15;
                                                                            }
                                                                        } catch (Exception e18) {
                                                                            this.downloadedBytes = 0L;
                                                                            this.requestedBytesCount = 0L;
                                                                            if (AndroidUtilities.isENOSPC(e18)) {
                                                                                LaunchActivity.E(i11);
                                                                                FileLog.e((Throwable) e18, false);
                                                                            } else if (AndroidUtilities.isEROFS(e18)) {
                                                                                SharedConfig.checkSdCard(this.cacheFileFinal);
                                                                                FileLog.e((Throwable) e18, false);
                                                                            } else {
                                                                                FileLog.e(e18);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!this.isPreloadVideoOperation) {
                                                                        copyNotLoadedRanges();
                                                                    }
                                                                    updateProgress();
                                                                    randomAccessFile = new RandomAccessFile(this.cacheFileTemp, "rws");
                                                                    this.fileOutputStream = randomAccessFile;
                                                                    j14 = this.downloadedBytes;
                                                                    if (j14 != 0) {
                                                                        randomAccessFile.seek(j14);
                                                                    }
                                                                    z11 = true;
                                                                    r10 = 0;
                                                                    if (this.fileOutputStream == null) {
                                                                        onFail(z11, r10);
                                                                        return r10;
                                                                    }
                                                                    this.started = z11;
                                                                    Utilities.stageQueue.postRunnable(new d2(3, this, zArr));
                                                                    return z11;
                                                                }
                                                            } else {
                                                                z13 = z12;
                                                                i11 = 1;
                                                            }
                                                            this.nextPreloadDownloadOffset = this.preloadStream.readLong();
                                                            this.nextAtomOffset = this.preloadStream.readLong();
                                                            long j30 = j25 + 24;
                                                            if (this.preloadedBytesRanges == null) {
                                                                this.preloadedBytesRanges = new HashMap<>();
                                                            }
                                                            if (this.requestedPreloadedBytesRanges == null) {
                                                                this.requestedPreloadedBytesRanges = new HashMap<>();
                                                            }
                                                            this.preloadedBytesRanges.put(Long.valueOf(j22), preloadRange);
                                                            this.requestedPreloadedBytesRanges.put(Long.valueOf(j22), Integer.valueOf(i11));
                                                            this.totalPreloadedBytes = (int) (((long) this.totalPreloadedBytes) + j23);
                                                            this.preloadStreamFileOffset = (int) (j23 + 36 + ((long) this.preloadStreamFileOffset));
                                                            z12 = z13;
                                                            j20 = j12;
                                                            j21 = j30;
                                                        } catch (Exception e19) {
                                                            e = e19;
                                                            z13 = z12;
                                                        }
                                                    }
                                                    e = e15;
                                                    FileLog.e((Throwable) e, false);
                                                    if (!this.isPreloadVideoOperation) {
                                                        this.cacheFilePreload = null;
                                                        randomAccessFile2 = this.preloadStream;
                                                        if (randomAccessFile2 != null) {
                                                            randomAccessFile2.getChannel().close();
                                                            this.preloadStream.close();
                                                            this.preloadStream = null;
                                                        }
                                                    }
                                                }
                                            }
                                            z13 = z12;
                                            j12 = j20;
                                            i11 = 1;
                                            this.preloadStream.seek(this.preloadStreamFileOffset);
                                        } catch (Exception e20) {
                                            e = e20;
                                            z13 = z12;
                                            j12 = j20;
                                        }
                                        if (!this.isPreloadVideoOperation) {
                                            this.cacheFilePreload = null;
                                            randomAccessFile2 = this.preloadStream;
                                            if (randomAccessFile2 != null) {
                                                randomAccessFile2.getChannel().close();
                                                this.preloadStream.close();
                                                this.preloadStream = null;
                                            }
                                        }
                                    }
                                }
                                z13 = z12;
                                j12 = j20;
                                j13 = 2;
                                i11 = 1;
                                this.preloadStream.seek(this.preloadStreamFileOffset);
                                if (!this.isPreloadVideoOperation) {
                                    this.cacheFilePreload = null;
                                    randomAccessFile2 = this.preloadStream;
                                    if (randomAccessFile2 != null) {
                                        randomAccessFile2.getChannel().close();
                                        this.preloadStream.close();
                                        this.preloadStream = null;
                                    }
                                }
                            }
                        }
                    } catch (Exception e21) {
                        e = e21;
                        z13 = z12;
                        j12 = j20;
                        j13 = 2;
                    }
                }
                if (strO3 != null) {
                    this.cacheFileParts = new File(this.tempPath, strO3);
                    if (!this.cacheFileTemp.exists()) {
                        this.cacheFileParts.delete();
                    }
                    RandomAccessFile randomAccessFile6 = new RandomAccessFile(this.cacheFileParts, "rws");
                    this.filePartsStream = randomAccessFile6;
                    length2 = randomAccessFile6.length();
                    if (length2 % j12 == 4) {
                        i13 = this.filePartsStream.readInt();
                        if (i13 <= (length2 - 4) / j13) {
                            while (i14 < i13) {
                                long j210 = this.filePartsStream.readLong();
                                long j211 = this.filePartsStream.readLong();
                                this.notLoadedBytesRanges.add(new Range(j210, j211));
                                this.notRequestedBytesRanges.add(new Range(j210, j211));
                            }
                        }
                    }
                }
                if (this.fileMetadata != null) {
                    FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileParts, this.fileMetadata);
                    FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileTemp, this.fileMetadata);
                }
                if (!this.cacheFileTemp.exists()) {
                    arrayList = this.notLoadedBytesRanges;
                    if (arrayList != null && arrayList.isEmpty()) {
                        long j212 = 0;
                        this.notLoadedBytesRanges.add(new Range(j212, this.totalBytesCount));
                        this.notRequestedBytesRanges.add(new Range(j212, this.totalBytesCount));
                    }
                } else if (z13) {
                    this.cacheFileTemp.delete();
                } else {
                    long length6 = this.cacheFileTemp.length();
                    if (strO2 != null || length6 % ((long) this.currentDownloadChunkSize) == j11) {
                        long jFloorDiv3 = floorDiv(this.cacheFileTemp.length(), this.currentDownloadChunkSize) * ((long) this.currentDownloadChunkSize);
                        this.downloadedBytes = jFloorDiv3;
                        this.requestedBytesCount = jFloorDiv3;
                    } else {
                        this.requestedBytesCount = j11;
                    }
                    arrayList3 = this.notLoadedBytesRanges;
                    if (arrayList3 != null && arrayList3.isEmpty()) {
                        this.notLoadedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                        this.notRequestedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                    }
                }
                arrayList2 = this.notLoadedBytesRanges;
                if (arrayList2 != null) {
                    this.downloadedBytes = this.totalBytesCount;
                    size = arrayList2.size();
                    while (i12 < size) {
                        Range range2 = this.notLoadedBytesRanges.get(i12);
                        this.downloadedBytes -= range2.end - range2.start;
                    }
                    this.requestedBytesCount = this.downloadedBytes;
                }
                if (BuildVars.LOGS_ENABLED) {
                    if (this.isPreloadVideoOperation) {
                        FileLog.d("start preloading file to temp = " + this.cacheFileTemp);
                    } else {
                        StringBuilder sb17 = new StringBuilder("start loading file to temp = ");
                        sb17.append(this.cacheFileTemp);
                        sb17.append(" final = ");
                        sb17.append(this.cacheFileFinal);
                        sb17.append(" priority");
                        i0.a.v(this.priority, sb17);
                    }
                }
                if (strO2 != null) {
                    this.cacheIvTemp = new File(this.tempPath, strO2);
                    this.fiv = new RandomAccessFile(this.cacheIvTemp, "rws");
                    if (this.downloadedBytes != 0 && !z13) {
                        length = this.cacheIvTemp.length();
                        if (length <= 0) {
                            j15 = 0;
                        } else if (length % 64 == 0) {
                            this.fiv.read(this.iv, 0, 64);
                        } else {
                            j15 = 0;
                        }
                        this.downloadedBytes = j15;
                        this.requestedBytesCount = j15;
                    }
                }
                if (!this.isPreloadVideoOperation && this.downloadedBytes != 0 && this.totalBytesCount > 0) {
                    copyNotLoadedRanges();
                }
                updateProgress();
                try {
                    randomAccessFile = new RandomAccessFile(this.cacheFileTemp, "rws");
                    this.fileOutputStream = randomAccessFile;
                    j14 = this.downloadedBytes;
                    if (j14 != 0) {
                        randomAccessFile.seek(j14);
                    }
                    z11 = true;
                    r10 = 0;
                } catch (Exception e22) {
                    r10 = 0;
                    FileLog.e((Throwable) e22, false);
                    if (AndroidUtilities.isENOSPC(e22)) {
                        LaunchActivity.E(i11);
                        onFail(true, -1);
                        return false;
                    }
                    z11 = true;
                    if (AndroidUtilities.isEROFS(e22)) {
                        SharedConfig.checkSdCard(this.cacheFileFinal);
                        FileLog.e((Throwable) e22, false);
                        onFail(true, -1);
                        return false;
                    }
                }
                if (this.fileOutputStream == null) {
                    onFail(z11, r10);
                    return r10;
                }
                this.started = z11;
                Utilities.stageQueue.postRunnable(new d2(3, this, zArr));
            }
            return z11;
        }
        String strMD5 = Utilities.MD5(this.webFile.url);
        if (this.encryptFile) {
            strL = s3.c.l(strMD5, ".temp.enc");
            strP = a9.p.p(s3.c.f(strMD5, "."), this.ext, ".enc");
            strL2 = this.key != null ? s3.c.l(strMD5, "_64.iv.enc") : null;
        } else {
            String strL3 = s3.c.l(strMD5, ".temp");
            StringBuilder sbF = s3.c.f(strMD5, ".");
            sbF.append(this.ext);
            String string = sbF.toString();
            if (this.key != null) {
                strL2 = s3.c.l(strMD5, "_64.iv");
                strL = strL3;
                strP = string;
            } else {
                strL = strL3;
                strP = string;
            }
        }
        String str3 = strL;
        strO2 = strL2;
        strO = str3;
        j11 = 0;
        strO3 = null;
        strO4 = null;
        this.requestInfos = new ArrayList<>(this.currentMaxDownloadRequests);
        this.cancelledRequestInfos = new ArrayList<>();
        this.delayedRequestInfos = new ArrayList<>(this.currentMaxDownloadRequests - 1);
        this.state = 1;
        obj = this.parentObject;
        if (obj instanceof TLRPC.TL_theme) {
            this.cacheFileFinal = new File(ApplicationLoader.getFilesDirFixed(), a9.p.o(new StringBuilder("remote"), ((TLRPC.TL_theme) obj).f22517id, ".attheme"));
        } else if (this.encryptFile) {
            this.cacheFileFinal = new File(this.storePath, this.storeFileName);
        } else {
            this.cacheFileFinal = new File(this.storePath, strP);
        }
        zExists = this.cacheFileFinal.exists();
        this.cacheFileFinalReady = zExists;
        if (zExists) {
            if (!(this.parentObject instanceof TLRPC.TL_theme)) {
                j16 = this.totalBytesCount;
                if (j16 != j11) {
                    if (!this.delegate.isLocallyCreatedFile(this.cacheFileFinal.toString())) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("debug_loading: delete existing file cause file size mismatch " + this.cacheFileFinal.getName() + " totalSize=" + this.totalBytesCount + " existingFileSize=" + this.cacheFileFinal.length());
                        }
                        if (!this.delegate.hasAnotherRefOnFile(this.cacheFileFinal.toString())) {
                            this.cacheFileFinal.delete();
                        }
                        zExists = false;
                    }
                }
            } else if (!this.delegate.isLocallyCreatedFile(this.cacheFileFinal.toString())) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("debug_loading: delete existing file cause file size mismatch " + this.cacheFileFinal.getName() + " totalSize=" + this.totalBytesCount + " existingFileSize=" + this.cacheFileFinal.length());
                }
                if (!this.delegate.hasAnotherRefOnFile(this.cacheFileFinal.toString())) {
                    this.cacheFileFinal.delete();
                }
                zExists = false;
            }
        }
        if (zExists) {
            this.cacheFileTemp = new File(this.tempPath, strO);
            if (this.ungzip) {
                this.cacheFileGzipTemp = new File(this.tempPath, s3.c.l(strO, ".gz"));
            }
            if (this.encryptFile) {
                File file2 = new File(FileLoader.getInternalCacheDir(), s3.c.l(strP, ".key"));
                randomAccessFile3 = new RandomAccessFile(file2, "rws");
                length3 = file2.length();
                bArr = new byte[32];
                this.encryptKey = bArr;
                this.encryptIv = new byte[16];
                if (length3 > j11) {
                    Utilities.random.nextBytes(bArr);
                    Utilities.random.nextBytes(this.encryptIv);
                    randomAccessFile3.write(this.encryptKey);
                    randomAccessFile3.write(this.encryptIv);
                    z12 = true;
                } else {
                    Utilities.random.nextBytes(bArr);
                    Utilities.random.nextBytes(this.encryptIv);
                    randomAccessFile3.write(this.encryptKey);
                    randomAccessFile3.write(this.encryptIv);
                    z12 = true;
                }
                randomAccessFile3.getChannel().close();
                randomAccessFile3.close();
            } else {
                z12 = false;
            }
            zArr = new boolean[]{false};
            long j213 = 8;
            if (this.supportsPreloading) {
                z13 = z12;
                j12 = 8;
                j13 = 2;
                i11 = 1;
            } else {
                z13 = z12;
                j12 = 8;
                j13 = 2;
                i11 = 1;
            }
            if (strO3 != null) {
                this.cacheFileParts = new File(this.tempPath, strO3);
                if (!this.cacheFileTemp.exists()) {
                    this.cacheFileParts.delete();
                }
                RandomAccessFile randomAccessFile7 = new RandomAccessFile(this.cacheFileParts, "rws");
                this.filePartsStream = randomAccessFile7;
                length2 = randomAccessFile7.length();
                if (length2 % j12 == 4) {
                    i13 = this.filePartsStream.readInt();
                    if (i13 <= (length2 - 4) / j13) {
                        while (i14 < i13) {
                            long j214 = this.filePartsStream.readLong();
                            long j215 = this.filePartsStream.readLong();
                            this.notLoadedBytesRanges.add(new Range(j214, j215));
                            this.notRequestedBytesRanges.add(new Range(j214, j215));
                        }
                    }
                }
            }
            if (this.fileMetadata != null) {
                FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileParts, this.fileMetadata);
                FileLoader.getInstance(this.currentAccount).getFileDatabase().saveFileDialogId(this.cacheFileTemp, this.fileMetadata);
            }
            if (!this.cacheFileTemp.exists()) {
                arrayList = this.notLoadedBytesRanges;
                if (arrayList != null) {
                    long j216 = 0;
                    this.notLoadedBytesRanges.add(new Range(j216, this.totalBytesCount));
                    this.notRequestedBytesRanges.add(new Range(j216, this.totalBytesCount));
                }
            } else if (z13) {
                this.cacheFileTemp.delete();
            } else {
                long length7 = this.cacheFileTemp.length();
                if (strO2 != null) {
                    long jFloorDiv4 = floorDiv(this.cacheFileTemp.length(), this.currentDownloadChunkSize) * ((long) this.currentDownloadChunkSize);
                    this.downloadedBytes = jFloorDiv4;
                    this.requestedBytesCount = jFloorDiv4;
                } else {
                    long jFloorDiv5 = floorDiv(this.cacheFileTemp.length(), this.currentDownloadChunkSize) * ((long) this.currentDownloadChunkSize);
                    this.downloadedBytes = jFloorDiv5;
                    this.requestedBytesCount = jFloorDiv5;
                }
                arrayList3 = this.notLoadedBytesRanges;
                if (arrayList3 != null) {
                    this.notLoadedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                    this.notRequestedBytesRanges.add(new Range(this.downloadedBytes, this.totalBytesCount));
                }
            }
            arrayList2 = this.notLoadedBytesRanges;
            if (arrayList2 != null) {
                this.downloadedBytes = this.totalBytesCount;
                size = arrayList2.size();
                while (i12 < size) {
                    Range range3 = this.notLoadedBytesRanges.get(i12);
                    this.downloadedBytes -= range3.end - range3.start;
                }
                this.requestedBytesCount = this.downloadedBytes;
            }
            if (BuildVars.LOGS_ENABLED) {
                if (this.isPreloadVideoOperation) {
                    FileLog.d("start preloading file to temp = " + this.cacheFileTemp);
                } else {
                    StringBuilder sb18 = new StringBuilder("start loading file to temp = ");
                    sb18.append(this.cacheFileTemp);
                    sb18.append(" final = ");
                    sb18.append(this.cacheFileFinal);
                    sb18.append(" priority");
                    i0.a.v(this.priority, sb18);
                }
            }
            if (strO2 != null) {
                this.cacheIvTemp = new File(this.tempPath, strO2);
                this.fiv = new RandomAccessFile(this.cacheIvTemp, "rws");
                if (this.downloadedBytes != 0) {
                    length = this.cacheIvTemp.length();
                    if (length <= 0) {
                        j15 = 0;
                    } else if (length % 64 == 0) {
                        this.fiv.read(this.iv, 0, 64);
                    } else {
                        j15 = 0;
                    }
                    this.downloadedBytes = j15;
                    this.requestedBytesCount = j15;
                }
            }
            if (!this.isPreloadVideoOperation) {
                copyNotLoadedRanges();
            }
            updateProgress();
            randomAccessFile = new RandomAccessFile(this.cacheFileTemp, "rws");
            this.fileOutputStream = randomAccessFile;
            j14 = this.downloadedBytes;
            if (j14 != 0) {
                randomAccessFile.seek(j14);
            }
            z11 = true;
            r10 = 0;
            if (this.fileOutputStream == null) {
                onFail(z11, r10);
                return r10;
            }
            this.started = z11;
            Utilities.stageQueue.postRunnable(new d2(3, this, zArr));
        } else {
            z11 = true;
            this.started = true;
            onFinishLoadingFile(false, 1, false);
            pathData = this.pathSaveData;
            if (pathData != null) {
                this.delegate.saveFilePath(pathData, this.cacheFileFinal);
                return true;
            }
        }
        return z11;
    }

    public long[] getDownloadedLengthFromOffset(long j10, long j11) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ?? r10 = new long[2];
        Utilities.stageQueue.postRunnable(new cg.t0(this, (Serializable) r10, j10, j11, countDownLatch, 1));
        try {
            countDownLatch.await();
        } catch (Exception unused) {
        }
        return r10;
    }

    public FileLoadOperation(SecureDocument secureDocument) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new p2(this, 5);
        updateParams();
        TLRPC.TL_inputSecureFileLocation tL_inputSecureFileLocation = new TLRPC.TL_inputSecureFileLocation();
        this.location = tL_inputSecureFileLocation;
        TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
        tL_inputSecureFileLocation.f22395id = tL_secureFile.f22515id;
        tL_inputSecureFileLocation.access_hash = tL_secureFile.access_hash;
        this.datacenterId = tL_secureFile.dc_id;
        this.totalBytesCount = tL_secureFile.size;
        this.allowDisordererFileSave = true;
        this.currentType = 67108864;
        this.ext = ".jpg";
    }

    public FileLoadOperation(int i10, WebFile webFile) {
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new p2(this, 5);
        updateParams();
        this.currentAccount = i10;
        this.webFile = webFile;
        this.webLocation = webFile.location;
        this.totalBytesCount = webFile.size;
        int i11 = MessagesController.getInstance(i10).webFileDatacenterId;
        this.datacenterId = i11;
        this.initialDatacenterId = i11;
        String mimeTypePart = FileLoader.getMimeTypePart(webFile.mime_type);
        if (webFile.mime_type.startsWith("image/")) {
            this.currentType = 16777216;
        } else if (webFile.mime_type.equals("audio/ogg")) {
            this.currentType = 50331648;
        } else if (webFile.mime_type.startsWith("video/")) {
            this.currentType = 33554432;
        } else {
            this.currentType = 67108864;
        }
        this.allowDisordererFileSave = true;
        this.ext = ImageLoader.getHttpUrlExtension(webFile.url, mimeTypePart);
    }

    public FileLoadOperation(TLRPC.Document document, Object obj) {
        int iLastIndexOf;
        this.FULL_LOGS = false;
        this.downloadChunkSize = 32768;
        this.downloadChunkSizeBig = 131072;
        this.cdnChunkCheckSize = 131072;
        this.maxDownloadRequests = 4;
        this.maxDownloadRequestsBig = 4;
        this.bigFileSizeFrom = 10485760;
        this.maxCdnParts = (int) (2097152000 / ((long) 131072));
        this.downloadChunkSizeAnimation = 131072;
        this.maxDownloadRequestsAnimation = 4;
        this.preloadTempBuffer = new byte[24];
        this.state = 0;
        this.uiRequestTokens = new ArrayList<>();
        this.cancelAfterNoStreamListeners = new p2(this, 5);
        updateParams();
        try {
            this.parentObject = obj;
            this.isStory = obj instanceof TL_stories.TL_storyItem;
            this.fileMetadata = FileLoader.getFileMetadataFromParent(this.currentAccount, obj);
            if (document instanceof TLRPC.TL_documentEncrypted) {
                TLRPC.TL_inputEncryptedFileLocation tL_inputEncryptedFileLocation = new TLRPC.TL_inputEncryptedFileLocation();
                this.location = tL_inputEncryptedFileLocation;
                tL_inputEncryptedFileLocation.f22395id = document.f22386id;
                tL_inputEncryptedFileLocation.access_hash = document.access_hash;
                int i10 = document.dc_id;
                this.datacenterId = i10;
                this.initialDatacenterId = i10;
                byte[] bArr = new byte[32];
                this.iv = bArr;
                System.arraycopy(document.iv, 0, bArr, 0, 32);
                this.key = document.key;
            } else if (document instanceof TLRPC.TL_document) {
                TLRPC.TL_inputDocumentFileLocation tL_inputDocumentFileLocation = new TLRPC.TL_inputDocumentFileLocation();
                this.location = tL_inputDocumentFileLocation;
                long j10 = document.f22386id;
                tL_inputDocumentFileLocation.f22395id = j10;
                this.documentId = j10;
                tL_inputDocumentFileLocation.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocumentFileLocation.file_reference = bArr2;
                tL_inputDocumentFileLocation.thumb_size = "";
                if (bArr2 == null) {
                    tL_inputDocumentFileLocation.file_reference = new byte[0];
                }
                int i11 = document.dc_id;
                this.datacenterId = i11;
                this.initialDatacenterId = i11;
                this.allowDisordererFileSave = true;
                int size = document.attributes.size();
                for (int i12 = 0; i12 < size; i12++) {
                    if (document.attributes.get(i12) instanceof TLRPC.TL_documentAttributeVideo) {
                        this.supportsPreloading = true;
                        this.preloadPrefixSize = document.attributes.get(i12).preload_prefix_size;
                        break;
                    }
                }
            }
            this.ungzip = "application/x-tgsticker".equals(document.mime_type) || "application/x-tgwallpattern".equals(document.mime_type);
            long j11 = document.size;
            this.totalBytesCount = j11;
            if (this.key != null && j11 % 16 != 0) {
                long j12 = 16 - (j11 % 16);
                this.bytesCountPadding = j12;
                this.totalBytesCount = j11 + j12;
            }
            String documentFileName = FileLoader.getDocumentFileName(document);
            this.ext = documentFileName;
            if (documentFileName != null && (iLastIndexOf = documentFileName.lastIndexOf(46)) != -1) {
                this.ext = this.ext.substring(iLastIndexOf);
            } else {
                this.ext = "";
            }
            if ("audio/ogg".equals(document.mime_type)) {
                this.currentType = 50331648;
            } else if (FileLoader.isVideoMimeType(document.mime_type)) {
                this.currentType = 33554432;
            } else {
                this.currentType = 67108864;
            }
            if (this.ext.length() <= 1) {
                this.ext = FileLoader.getExtensionByMimeType(document.mime_type);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            onFail(true, 0);
        }
    }
}
