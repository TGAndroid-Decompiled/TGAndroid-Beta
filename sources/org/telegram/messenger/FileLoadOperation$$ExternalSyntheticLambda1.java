package org.telegram.messenger;

public final class FileLoadOperation$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final FileLoadOperation f$0;
    public final FileLoadOperation.RequestInfo f$1;

    public FileLoadOperation$$ExternalSyntheticLambda1(FileLoadOperation fileLoadOperation, FileLoadOperation.RequestInfo requestInfo, int i) {
        this.$r8$classId = i;
        this.f$0 = fileLoadOperation;
        this.f$1 = requestInfo;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startDownloadRequest$27(this.f$1);
                break;
            default:
                this.f$0.lambda$clearOperation$24(this.f$1);
                break;
        }
    }
}
