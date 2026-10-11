package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f17285a;
    public final DownloadController f17286b;
    public final MessageObject f17287c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f17285a = i10;
        this.f17286b = downloadController;
        this.f17287c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17285a) {
            case 0:
                this.f17286b.lambda$startDownloadFile$4(this.f17287c);
                return;
            case 1:
                this.f17286b.lambda$onDownloadFail$9(this.f17287c);
                return;
            default:
                this.f17286b.lambda$onDownloadComplete$6(this.f17287c);
                return;
        }
    }
}
