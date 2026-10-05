package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f17300a;
    public final DownloadController f17301b;
    public final MessageObject f17302c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f17300a = i10;
        this.f17301b = downloadController;
        this.f17302c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17300a) {
            case 0:
                this.f17301b.lambda$startDownloadFile$4(this.f17302c);
                return;
            case 1:
                this.f17301b.lambda$onDownloadFail$9(this.f17302c);
                return;
            default:
                this.f17301b.lambda$onDownloadComplete$6(this.f17302c);
                return;
        }
    }
}
