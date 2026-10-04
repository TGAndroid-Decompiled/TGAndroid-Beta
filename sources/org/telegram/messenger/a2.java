package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f17291a;
    public final DownloadController f17292b;
    public final MessageObject f17293c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f17291a = i10;
        this.f17292b = downloadController;
        this.f17293c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17291a) {
            case 0:
                this.f17292b.lambda$startDownloadFile$4(this.f17293c);
                return;
            case 1:
                this.f17292b.lambda$onDownloadFail$9(this.f17293c);
                return;
            default:
                this.f17292b.lambda$onDownloadComplete$6(this.f17293c);
                return;
        }
    }
}
