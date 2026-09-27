package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f15859a;
    public final DownloadController f15860b;
    public final MessageObject f15861c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f15859a = i10;
        this.f15860b = downloadController;
        this.f15861c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15859a) {
            case 0:
                this.f15860b.lambda$startDownloadFile$4(this.f15861c);
                return;
            case 1:
                this.f15860b.lambda$onDownloadFail$9(this.f15861c);
                return;
            default:
                this.f15860b.lambda$onDownloadComplete$6(this.f15861c);
                return;
        }
    }
}
