package org.telegram.messenger;

public final class b2 implements Runnable {

    public final int f19753a;

    public final DownloadController f19754b;

    public final MessageObject f19755c;

    public b2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f19753a = i10;
        this.f19754b = downloadController;
        this.f19755c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19753a) {
            case 0:
                this.f19754b.lambda$startDownloadFile$4(this.f19755c);
                break;
            case 1:
                this.f19754b.lambda$onDownloadFail$9(this.f19755c);
                break;
            default:
                this.f19754b.lambda$onDownloadComplete$6(this.f19755c);
                break;
        }
    }
}
