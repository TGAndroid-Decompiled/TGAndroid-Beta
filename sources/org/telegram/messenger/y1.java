package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f19679a;
    public final DownloadController f19680b;

    public y1(DownloadController downloadController, int i10) {
        this.f19679a = i10;
        this.f19680b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19679a) {
            case 0:
                DownloadController.m(this.f19680b);
                return;
            case 1:
                DownloadController.l(this.f19680b);
                return;
            default:
                DownloadController.a(this.f19680b);
                return;
        }
    }
}
