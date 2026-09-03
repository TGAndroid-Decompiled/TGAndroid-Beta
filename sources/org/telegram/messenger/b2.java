package org.telegram.messenger;
public final class b2 implements Runnable {
    public final int f18215a;
    public final DownloadController f18216b;
    public final MessageObject f18217c;

    public b2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18215a = i10;
        this.f18216b = downloadController;
        this.f18217c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18215a) {
            case 0:
                this.f18216b.lambda$startDownloadFile$4(this.f18217c);
                return;
            case 1:
                this.f18216b.lambda$onDownloadFail$9(this.f18217c);
                return;
            default:
                this.f18216b.lambda$onDownloadComplete$6(this.f18217c);
                return;
        }
    }
}
