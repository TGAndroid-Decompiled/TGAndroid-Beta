package org.telegram.messenger;

public final class FileLoadOperation$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final FileLoadOperation f$0;
    public final boolean f$1;

    public FileLoadOperation$$ExternalSyntheticLambda13(FileLoadOperation fileLoadOperation, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = fileLoadOperation;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setIsPreloadVideoOperation$12(this.f$1);
                break;
            case 1:
                this.f$0.lambda$cancel$13(this.f$1);
                break;
            case 2:
                this.f$0.lambda$onFinishLoadingFile$17(this.f$1);
                break;
            default:
                this.f$0.lambda$onFinishLoadingFile$19(this.f$1);
                break;
        }
    }
}
