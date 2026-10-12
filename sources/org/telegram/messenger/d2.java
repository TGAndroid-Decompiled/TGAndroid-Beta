package org.telegram.messenger;
public final class d2 implements Runnable {
    public final int f17360a;
    public final DownloadController f17361b;
    public final MessageObject f17362c;

    public d2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f17360a = i10;
        this.f17361b = downloadController;
        this.f17362c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17360a) {
            case 0:
                this.f17361b.lambda$startDownloadFile$4(this.f17362c);
                return;
            case 1:
                this.f17361b.lambda$onDownloadFail$9(this.f17362c);
                return;
            default:
                this.f17361b.lambda$onDownloadComplete$6(this.f17362c);
                return;
        }
    }
}
