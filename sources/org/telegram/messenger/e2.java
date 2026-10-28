package org.telegram.messenger;
public final class e2 implements Runnable {
    public final int f19946a;
    public final DownloadController f19947b;
    public final MessageObject f19948c;

    public e2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f19946a = i10;
        this.f19947b = downloadController;
        this.f19948c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19946a) {
            case 0:
                this.f19947b.lambda$startDownloadFile$4(this.f19948c);
                return;
            case 1:
                this.f19947b.lambda$onDownloadFail$9(this.f19948c);
                return;
            default:
                this.f19947b.lambda$onDownloadComplete$6(this.f19948c);
                return;
        }
    }
}
