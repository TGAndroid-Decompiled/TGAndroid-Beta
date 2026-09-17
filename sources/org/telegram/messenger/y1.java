package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f19687a;
    public final DownloadController f19688b;

    public y1(DownloadController downloadController, int i10) {
        this.f19687a = i10;
        this.f19688b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19687a) {
            case 0:
                DownloadController.m(this.f19688b);
                return;
            case 1:
                DownloadController.l(this.f19688b);
                return;
            default:
                DownloadController.a(this.f19688b);
                return;
        }
    }
}
