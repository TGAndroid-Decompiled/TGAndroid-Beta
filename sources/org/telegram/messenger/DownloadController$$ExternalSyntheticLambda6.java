package org.telegram.messenger;

public final class DownloadController$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final DownloadController f$0;
    public final MessageObject f$1;

    public DownloadController$$ExternalSyntheticLambda6(DownloadController downloadController, MessageObject messageObject, int i) {
        this.$r8$classId = i;
        this.f$0 = downloadController;
        this.f$1 = messageObject;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onDownloadComplete$6(this.f$1);
                break;
            case 1:
                this.f$0.lambda$startDownloadFile$4(this.f$1);
                break;
            default:
                this.f$0.lambda$onDownloadFail$9(this.f$1);
                break;
        }
    }
}
