package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f15865a;
    public final DownloadController f15866b;
    public final MessageObject f15867c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f15865a = i10;
        this.f15866b = downloadController;
        this.f15867c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15865a) {
            case 0:
                this.f15866b.lambda$startDownloadFile$4(this.f15867c);
                return;
            case 1:
                this.f15866b.lambda$onDownloadFail$9(this.f15867c);
                return;
            default:
                this.f15866b.lambda$onDownloadComplete$6(this.f15867c);
                return;
        }
    }
}
