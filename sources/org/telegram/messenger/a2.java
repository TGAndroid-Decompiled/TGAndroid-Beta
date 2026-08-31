package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f18089a;
    public final DownloadController f18090b;

    public a2(DownloadController downloadController, int i10) {
        this.f18089a = i10;
        this.f18090b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18089a) {
            case 0:
                DownloadController.m(this.f18090b);
                return;
            case 1:
                DownloadController.l(this.f18090b);
                return;
            default:
                DownloadController.a(this.f18090b);
                return;
        }
    }
}
