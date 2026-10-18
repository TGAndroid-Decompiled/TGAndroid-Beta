package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f18014a;
    public final DownloadController f18015b;
    public final MessageObject f18016c;

    public c2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18014a = i10;
        this.f18015b = downloadController;
        this.f18016c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18014a) {
            case 0:
                this.f18015b.lambda$startDownloadFile$4(this.f18016c);
                return;
            case 1:
                this.f18015b.lambda$onDownloadFail$9(this.f18016c);
                return;
            default:
                this.f18015b.lambda$onDownloadComplete$6(this.f18016c);
                return;
        }
    }
}
