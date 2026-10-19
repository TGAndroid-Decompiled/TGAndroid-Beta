package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f18011a;
    public final DownloadController f18012b;
    public final MessageObject f18013c;

    public c2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f18011a = i10;
        this.f18012b = downloadController;
        this.f18013c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f18011a) {
            case 0:
                this.f18012b.lambda$startDownloadFile$4(this.f18013c);
                return;
            case 1:
                this.f18012b.lambda$onDownloadFail$9(this.f18013c);
                return;
            default:
                this.f18012b.lambda$onDownloadComplete$6(this.f18013c);
                return;
        }
    }
}
