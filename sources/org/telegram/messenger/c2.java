package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f16616a;
    public final DownloadController f16617b;
    public final MessageObject f16618c;

    public c2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f16616a = i10;
        this.f16617b = downloadController;
        this.f16618c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f16616a) {
            case 0:
                this.f16617b.lambda$startDownloadFile$4(this.f16618c);
                return;
            case 1:
                this.f16617b.lambda$onDownloadFail$9(this.f16618c);
                return;
            default:
                this.f16617b.lambda$onDownloadComplete$6(this.f16618c);
                return;
        }
    }
}
