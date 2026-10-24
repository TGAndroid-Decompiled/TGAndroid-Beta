package org.telegram.messenger;
public final class d2 implements Runnable {
    public final int f18189a;
    public final DownloadController f18190b;
    public final MessageObject f18191c;

    public d2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18189a = i10;
        this.f18190b = downloadController;
        this.f18191c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18189a) {
            case 0:
                this.f18190b.lambda$startDownloadFile$4(this.f18191c);
                return;
            case 1:
                this.f18190b.lambda$onDownloadFail$9(this.f18191c);
                return;
            default:
                this.f18190b.lambda$onDownloadComplete$6(this.f18191c);
                return;
        }
    }
}
