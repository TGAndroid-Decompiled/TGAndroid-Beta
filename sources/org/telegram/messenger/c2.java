package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f16919a;
    public final DownloadController f16920b;
    public final MessageObject f16921c;

    public c2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f16919a = i10;
        this.f16920b = downloadController;
        this.f16921c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f16919a) {
            case 0:
                this.f16920b.lambda$startDownloadFile$4(this.f16921c);
                return;
            case 1:
                this.f16920b.lambda$onDownloadFail$9(this.f16921c);
                return;
            default:
                this.f16920b.lambda$onDownloadComplete$6(this.f16921c);
                return;
        }
    }
}
