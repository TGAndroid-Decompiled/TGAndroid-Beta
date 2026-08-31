package org.telegram.messenger;

import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLRPC;
public class AnimatedFileDrawableStream implements FileLoadOperationStream {
    private volatile boolean canceled;
    private CountDownLatch countDownLatch;
    private int currentAccount;
    private int debugCanceledCount;
    private boolean debugReportSend;
    private TLRPC.Document document;
    private String finishedFilePath;
    private boolean finishedLoadingFile;
    private long lastOffset;
    private FileLoadOperation loadOperation;
    private int loadingPriority;
    private ImageLocation location;
    private Object parentObject;
    private boolean preview;
    private final Object sync = new Object();
    private boolean waitingForLoad;

    public AnimatedFileDrawableStream(TLRPC.Document document, ImageLocation imageLocation, Object obj, int i10, boolean z4, int i11, int i12) {
        this.document = document;
        this.location = imageLocation;
        this.parentObject = obj;
        this.currentAccount = i10;
        this.preview = z4;
        this.loadingPriority = i11;
        this.loadOperation = FileLoader.getInstance(i10).loadStreamFile(this, this.document, this.location, this.parentObject, 0L, this.preview, i11, i12);
    }

    private void cancelLoadingInternal() {
        FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.document);
        if (this.location != null) {
            FileLoader.getInstance(this.currentAccount).cancelLoadFile(this.location.location, "mp4");
        }
    }

    public void cancel() {
        cancel(true);
    }

    public int getCurrentAccount() {
        return this.currentAccount;
    }

    public TLRPC.Document getDocument() {
        return this.document;
    }

    public String getFinishedFilePath() {
        return this.finishedFilePath;
    }

    public ImageLocation getLocation() {
        return this.location;
    }

    public Object getParentObject() {
        return this.document;
    }

    public boolean isCanceled() {
        return this.canceled;
    }

    public boolean isFinishedLoadingFile() {
        return this.finishedLoadingFile;
    }

    public boolean isPreview() {
        return this.preview;
    }

    public boolean isWaitingForLoad() {
        return this.waitingForLoad;
    }

    @Override
    public void newDataAvailable() {
        CountDownLatch countDownLatch = this.countDownLatch;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            this.countDownLatch = null;
        }
    }

    public int read(int i10, int i11) {
        synchronized (this.sync) {
            try {
                if (this.canceled) {
                    int i12 = this.debugCanceledCount + 1;
                    this.debugCanceledCount = i12;
                    if (!this.debugReportSend && i12 > 200) {
                        this.debugReportSend = true;
                        FileLog.e(new RuntimeException("infinity stream reading!!!"));
                    }
                    return 0;
                } else if (i11 == 0) {
                    return 0;
                } else {
                    long j10 = 0;
                    while (j10 == 0) {
                        try {
                            long j11 = i10;
                            long[] downloadedLengthFromOffset = this.loadOperation.getDownloadedLengthFromOffset(j11, i11);
                            long j12 = downloadedLengthFromOffset[0];
                            try {
                                if (!this.finishedLoadingFile && downloadedLengthFromOffset[1] != 0) {
                                    this.finishedLoadingFile = true;
                                    this.finishedFilePath = this.loadOperation.getCacheFileFinal().getAbsolutePath();
                                }
                                if (j12 == 0) {
                                    synchronized (this.sync) {
                                        if (this.canceled) {
                                            cancelLoadingInternal();
                                            return 0;
                                        }
                                        this.countDownLatch = new CountDownLatch(1);
                                        if (this.loadOperation.isPaused() || this.lastOffset != j11 || this.preview) {
                                            FileLoadOperation loadStreamFile = FileLoader.getInstance(this.currentAccount).loadStreamFile(this, this.document, this.location, this.parentObject, j11, this.preview, this.loadingPriority);
                                            FileLoadOperation fileLoadOperation = this.loadOperation;
                                            if (fileLoadOperation != loadStreamFile) {
                                                fileLoadOperation.removeStreamListener(this);
                                                this.loadOperation = loadStreamFile;
                                            }
                                            this.lastOffset = j11 + j12;
                                        }
                                        synchronized (this.sync) {
                                            if (this.canceled) {
                                                this.countDownLatch = null;
                                                cancelLoadingInternal();
                                                return 0;
                                            }
                                        }
                                        if (!this.preview) {
                                            FileLoader.getInstance(this.currentAccount).setLoadingVideo(this.document, false, true);
                                        }
                                        CountDownLatch countDownLatch = this.countDownLatch;
                                        if (countDownLatch != null) {
                                            this.waitingForLoad = true;
                                            countDownLatch.await();
                                            this.waitingForLoad = false;
                                        }
                                    }
                                }
                                j10 = j12;
                            } catch (Exception e6) {
                                e = e6;
                                j10 = j12;
                                FileLog.e((Throwable) e, false);
                                return (int) j10;
                            }
                        } catch (Exception e10) {
                            e = e10;
                        }
                    }
                    this.lastOffset = i10 + j10;
                    return (int) j10;
                }
            } finally {
            }
        }
    }

    public void reset() {
        synchronized (this.sync) {
            this.canceled = false;
        }
    }

    public void cancel(boolean z4) {
        if (this.canceled) {
            return;
        }
        synchronized (this.sync) {
            try {
                CountDownLatch countDownLatch = this.countDownLatch;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                    this.countDownLatch = null;
                    if (z4 && !this.canceled && !this.preview) {
                        FileLoader.getInstance(this.currentAccount).removeLoadingVideo(this.document, false, true);
                    }
                }
                Object obj = this.parentObject;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    if (DownloadController.getInstance(messageObject.currentAccount).isDownloading(messageObject.getId())) {
                        z4 = false;
                    }
                }
                if (z4) {
                    cancelLoadingInternal();
                }
                this.canceled = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
