package org.telegram.messenger;
public final class d2 implements Runnable {
    public final int f19860a;
    public final DownloadController f19861b;

    public d2(DownloadController downloadController, int i10) {
        this.f19860a = i10;
        this.f19861b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19860a) {
            case 0:
                DownloadController.m(this.f19861b);
                return;
            case 1:
                DownloadController.l(this.f19861b);
                return;
            default:
                DownloadController.a(this.f19861b);
                return;
        }
    }
}
