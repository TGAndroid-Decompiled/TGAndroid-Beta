package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f17999a;
    public final DownloadController f18000b;
    public final MessageObject f18001c;

    public c2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f17999a = i10;
        this.f18000b = downloadController;
        this.f18001c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17999a) {
            case 0:
                this.f18000b.lambda$startDownloadFile$4(this.f18001c);
                return;
            case 1:
                this.f18000b.lambda$onDownloadFail$9(this.f18001c);
                return;
            default:
                this.f18000b.lambda$onDownloadComplete$6(this.f18001c);
                return;
        }
    }
}
