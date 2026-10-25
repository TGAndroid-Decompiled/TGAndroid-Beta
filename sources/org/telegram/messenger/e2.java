package org.telegram.messenger;
public final class e2 implements Runnable {
    public final int f19951a;
    public final DownloadController f19952b;
    public final MessageObject f19953c;

    public e2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f19951a = i10;
        this.f19952b = downloadController;
        this.f19953c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19951a) {
            case 0:
                this.f19952b.lambda$startDownloadFile$4(this.f19953c);
                return;
            case 1:
                this.f19952b.lambda$onDownloadFail$9(this.f19953c);
                return;
            default:
                this.f19952b.lambda$onDownloadComplete$6(this.f19953c);
                return;
        }
    }
}
