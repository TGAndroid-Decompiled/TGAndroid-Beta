package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f17286a;
    public final DownloadController f17287b;
    public final MessageObject f17288c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f17286a = i10;
        this.f17287b = downloadController;
        this.f17288c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f17286a) {
            case 0:
                this.f17287b.lambda$startDownloadFile$4(this.f17288c);
                return;
            case 1:
                this.f17287b.lambda$onDownloadFail$9(this.f17288c);
                return;
            default:
                this.f17287b.lambda$onDownloadComplete$6(this.f17288c);
                return;
        }
    }
}
