package org.telegram.messenger;
public final class d2 implements Runnable {
    public final int f18149a;
    public final DownloadController f18150b;
    public final MessageObject f18151c;

    public d2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18149a = i10;
        this.f18150b = downloadController;
        this.f18151c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18149a) {
            case 0:
                this.f18150b.lambda$startDownloadFile$4(this.f18151c);
                return;
            case 1:
                this.f18150b.lambda$onDownloadFail$9(this.f18151c);
                return;
            default:
                this.f18150b.lambda$onDownloadComplete$6(this.f18151c);
                return;
        }
    }
}
