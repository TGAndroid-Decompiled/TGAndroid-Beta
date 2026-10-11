package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f17321a;
    public final DownloadController f17322b;
    public final MessageObject f17323c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f17321a = i10;
        this.f17322b = downloadController;
        this.f17323c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17321a) {
            case 0:
                this.f17322b.lambda$startDownloadFile$4(this.f17323c);
                return;
            case 1:
                this.f17322b.lambda$onDownloadFail$9(this.f17323c);
                return;
            default:
                this.f17322b.lambda$onDownloadComplete$6(this.f17323c);
                return;
        }
    }
}
