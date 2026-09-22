package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f17916a;
    public final DownloadController f17917b;

    public y1(DownloadController downloadController, int i10) {
        this.f17916a = i10;
        this.f17917b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17916a) {
            case 0:
                DownloadController.m(this.f17917b);
                return;
            case 1:
                DownloadController.l(this.f17917b);
                return;
            default:
                DownloadController.a(this.f17917b);
                return;
        }
    }
}
