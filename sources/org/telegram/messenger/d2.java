package org.telegram.messenger;
public final class d2 implements Runnable {
    public final int f19862a;
    public final DownloadController f19863b;

    public d2(DownloadController downloadController, int i10) {
        this.f19862a = i10;
        this.f19863b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19862a) {
            case 0:
                DownloadController.m(this.f19863b);
                return;
            case 1:
                DownloadController.l(this.f19863b);
                return;
            default:
                DownloadController.a(this.f19863b);
                return;
        }
    }
}
