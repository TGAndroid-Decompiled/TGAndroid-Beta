package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f15850a;
    public final DownloadController f15851b;
    public final MessageObject f15852c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f15850a = i10;
        this.f15851b = downloadController;
        this.f15852c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f15850a) {
            case 0:
                this.f15851b.lambda$startDownloadFile$4(this.f15852c);
                return;
            case 1:
                this.f15851b.lambda$onDownloadFail$9(this.f15852c);
                return;
            default:
                this.f15851b.lambda$onDownloadComplete$6(this.f15852c);
                return;
        }
    }
}
