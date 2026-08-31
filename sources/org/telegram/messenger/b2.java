package org.telegram.messenger;
public final class b2 implements Runnable {
    public final int f18213a;
    public final DownloadController f18214b;
    public final MessageObject f18215c;

    public b2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18213a = i10;
        this.f18214b = downloadController;
        this.f18215c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18213a) {
            case 0:
                this.f18214b.lambda$startDownloadFile$4(this.f18215c);
                return;
            case 1:
                this.f18214b.lambda$onDownloadFail$9(this.f18215c);
                return;
            default:
                this.f18214b.lambda$onDownloadComplete$6(this.f18215c);
                return;
        }
    }
}
