package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f15610a;
    public final DownloadController f15611b;
    public final MessageObject f15612c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f15610a = i10;
        this.f15611b = downloadController;
        this.f15612c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15610a) {
            case 0:
                this.f15611b.lambda$startDownloadFile$4(this.f15612c);
                return;
            case 1:
                this.f15611b.lambda$onDownloadFail$9(this.f15612c);
                return;
            default:
                this.f15611b.lambda$onDownloadComplete$6(this.f15612c);
                return;
        }
    }
}
