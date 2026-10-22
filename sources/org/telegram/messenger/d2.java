package org.telegram.messenger;
public final class d2 implements Runnable {
    public final int f18126a;
    public final DownloadController f18127b;
    public final MessageObject f18128c;

    public d2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18126a = i10;
        this.f18127b = downloadController;
        this.f18128c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18126a) {
            case 0:
                this.f18127b.lambda$startDownloadFile$4(this.f18128c);
                return;
            case 1:
                this.f18127b.lambda$onDownloadFail$9(this.f18128c);
                return;
            default:
                this.f18127b.lambda$onDownloadComplete$6(this.f18128c);
                return;
        }
    }
}
