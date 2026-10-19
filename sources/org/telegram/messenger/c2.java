package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f18002a;
    public final DownloadController f18003b;
    public final MessageObject f18004c;

    public c2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18002a = i10;
        this.f18003b = downloadController;
        this.f18004c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18002a) {
            case 0:
                this.f18003b.lambda$startDownloadFile$4(this.f18004c);
                return;
            case 1:
                this.f18003b.lambda$onDownloadFail$9(this.f18004c);
                return;
            default:
                this.f18003b.lambda$onDownloadComplete$6(this.f18004c);
                return;
        }
    }
}
