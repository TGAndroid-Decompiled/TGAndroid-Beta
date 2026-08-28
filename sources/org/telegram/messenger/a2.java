package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f19683a;
    public final DownloadController f19684b;
    public final MessageObject f19685c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i9) {
        this.f19683a = i9;
        this.f19684b = downloadController;
        this.f19685c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19683a) {
            case 0:
                this.f19684b.lambda$startDownloadFile$4(this.f19685c);
                return;
            case 1:
                this.f19684b.lambda$onDownloadFail$9(this.f19685c);
                return;
            default:
                this.f19684b.lambda$onDownloadComplete$6(this.f19685c);
                return;
        }
    }
}
