package org.telegram.messenger;
public final class b2 implements Runnable {
    public final int f16806a;
    public final DownloadController f16807b;
    public final MessageObject f16808c;

    public b2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f16806a = i10;
        this.f16807b = downloadController;
        this.f16808c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f16806a) {
            case 0:
                this.f16807b.lambda$startDownloadFile$4(this.f16808c);
                return;
            case 1:
                this.f16807b.lambda$onDownloadFail$9(this.f16808c);
                return;
            default:
                this.f16807b.lambda$onDownloadComplete$6(this.f16808c);
                return;
        }
    }
}
