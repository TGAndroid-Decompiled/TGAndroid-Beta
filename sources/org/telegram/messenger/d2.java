package org.telegram.messenger;
public final class d2 implements Runnable {
    public final int f14958a;
    public final DownloadController f14959b;
    public final MessageObject f14960c;

    public d2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f14958a = i10;
        this.f14959b = downloadController;
        this.f14960c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f14958a) {
            case 0:
                this.f14959b.lambda$startDownloadFile$4(this.f14960c);
                return;
            case 1:
                this.f14959b.lambda$onDownloadFail$9(this.f14960c);
                return;
            default:
                this.f14959b.lambda$onDownloadComplete$6(this.f14960c);
                return;
        }
    }
}
