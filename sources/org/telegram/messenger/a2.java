package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f17290a;
    public final DownloadController f17291b;
    public final MessageObject f17292c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f17290a = i10;
        this.f17291b = downloadController;
        this.f17292c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17290a) {
            case 0:
                this.f17291b.lambda$startDownloadFile$4(this.f17292c);
                return;
            case 1:
                this.f17291b.lambda$onDownloadFail$9(this.f17292c);
                return;
            default:
                this.f17291b.lambda$onDownloadComplete$6(this.f17292c);
                return;
        }
    }
}
