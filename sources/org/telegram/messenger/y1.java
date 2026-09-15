package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f17920a;
    public final DownloadController f17921b;

    public y1(DownloadController downloadController, int i10) {
        this.f17920a = i10;
        this.f17921b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17920a) {
            case 0:
                DownloadController.m(this.f17921b);
                return;
            case 1:
                DownloadController.l(this.f17921b);
                return;
            default:
                DownloadController.a(this.f17921b);
                return;
        }
    }
}
