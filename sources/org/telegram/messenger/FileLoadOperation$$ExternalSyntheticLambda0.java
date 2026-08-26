package org.telegram.messenger;

public final class FileLoadOperation$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final FileLoadOperation f$0;
    public final int f$1;

    public FileLoadOperation$$ExternalSyntheticLambda0(FileLoadOperation fileLoadOperation, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = fileLoadOperation;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onFail$23(this.f$1);
                break;
            case 1:
                this.f$0.lambda$processRequestResult$22(this.f$1);
                break;
            case 2:
                this.f$0.lambda$start$8(this.f$1);
                break;
            default:
                this.f$0.lambda$startDownloadRequest$30(this.f$1);
                break;
        }
    }
}
