package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f15866a;
    public final DownloadController f15867b;
    public final MessageObject f15868c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f15866a = i10;
        this.f15867b = downloadController;
        this.f15868c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15866a) {
            case 0:
                this.f15867b.lambda$startDownloadFile$4(this.f15868c);
                return;
            case 1:
                this.f15867b.lambda$onDownloadFail$9(this.f15868c);
                return;
            default:
                this.f15867b.lambda$onDownloadComplete$6(this.f15868c);
                return;
        }
    }
}
