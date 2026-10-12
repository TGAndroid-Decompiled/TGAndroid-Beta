package org.telegram.messenger;
public final class d2 implements Runnable {
    public final int f17359a;
    public final DownloadController f17360b;
    public final MessageObject f17361c;

    public d2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f17359a = i10;
        this.f17360b = downloadController;
        this.f17361c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17359a) {
            case 0:
                this.f17360b.lambda$startDownloadFile$4(this.f17361c);
                return;
            case 1:
                this.f17360b.lambda$onDownloadFail$9(this.f17361c);
                return;
            default:
                this.f17360b.lambda$onDownloadComplete$6(this.f17361c);
                return;
        }
    }
}
