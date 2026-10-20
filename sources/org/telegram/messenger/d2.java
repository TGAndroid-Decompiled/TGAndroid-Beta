package org.telegram.messenger;
public final class d2 implements Runnable {
    public final int f18139a;
    public final DownloadController f18140b;
    public final MessageObject f18141c;

    public d2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18139a = i10;
        this.f18140b = downloadController;
        this.f18141c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18139a) {
            case 0:
                this.f18140b.lambda$startDownloadFile$4(this.f18141c);
                return;
            case 1:
                this.f18140b.lambda$onDownloadFail$9(this.f18141c);
                return;
            default:
                this.f18140b.lambda$onDownloadComplete$6(this.f18141c);
                return;
        }
    }
}
