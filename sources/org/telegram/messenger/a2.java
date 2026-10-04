package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f17295a;
    public final DownloadController f17296b;
    public final MessageObject f17297c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f17295a = i10;
        this.f17296b = downloadController;
        this.f17297c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17295a) {
            case 0:
                this.f17296b.lambda$startDownloadFile$4(this.f17297c);
                return;
            case 1:
                this.f17296b.lambda$onDownloadFail$9(this.f17297c);
                return;
            default:
                this.f17296b.lambda$onDownloadComplete$6(this.f17297c);
                return;
        }
    }
}
