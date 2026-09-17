package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f19714a;
    public final DownloadController f19715b;

    public y1(DownloadController downloadController, int i10) {
        this.f19714a = i10;
        this.f19715b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19714a) {
            case 0:
                DownloadController.m(this.f19715b);
                return;
            case 1:
                DownloadController.l(this.f19715b);
                return;
            default:
                DownloadController.a(this.f19715b);
                return;
        }
    }
}
