package org.telegram.messenger;

public final class DownloadController$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final DownloadController f$0;

    public DownloadController$$ExternalSyntheticLambda1(DownloadController downloadController, int i) {
        this.$r8$classId = i;
        this.f$0 = downloadController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$clearRecentDownloadedFiles$12();
                break;
            case 1:
                this.f$0.lambda$new$0();
                break;
            default:
                this.f$0.lambda$loadDownloadingFiles$11();
                break;
        }
    }
}
