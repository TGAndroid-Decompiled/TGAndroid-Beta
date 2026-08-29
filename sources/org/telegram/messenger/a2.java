package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f19656a;
    public final DownloadController f19657b;
    public final MessageObject f19658c;

    public a2(DownloadController downloadController, MessageObject messageObject, int i10) {
        this.f19656a = i10;
        this.f19657b = downloadController;
        this.f19658c = messageObject;
    }

    @Override
    public final void run() {
        switch (this.f19656a) {
            case 0:
                this.f19657b.lambda$startDownloadFile$4(this.f19658c);
                return;
            case 1:
                this.f19657b.lambda$onDownloadFail$9(this.f19658c);
                return;
            default:
                this.f19657b.lambda$onDownloadComplete$6(this.f19658c);
                return;
        }
    }
}
