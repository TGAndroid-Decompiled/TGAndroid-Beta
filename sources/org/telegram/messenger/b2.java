package org.telegram.messenger;
public final class b2 implements Runnable {
    public final int f16792a;
    public final DownloadController f16793b;
    public final MessageObject f16794c;

    public b2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f16792a = i10;
        this.f16793b = downloadController;
        this.f16794c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f16792a) {
            case 0:
                this.f16793b.lambda$startDownloadFile$4(this.f16794c);
                return;
            case 1:
                this.f16793b.lambda$onDownloadFail$9(this.f16794c);
                return;
            default:
                this.f16793b.lambda$onDownloadComplete$6(this.f16794c);
                return;
        }
    }
}
