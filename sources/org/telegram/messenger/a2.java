package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f15882a;
    public final DownloadController f15883b;
    public final MessageObject f15884c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f15882a = i10;
        this.f15883b = downloadController;
        this.f15884c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15882a) {
            case 0:
                this.f15883b.lambda$startDownloadFile$4(this.f15884c);
                return;
            case 1:
                this.f15883b.lambda$onDownloadFail$9(this.f15884c);
                return;
            default:
                this.f15883b.lambda$onDownloadComplete$6(this.f15884c);
                return;
        }
    }
}
