package org.telegram.messenger;
public final class b2 implements Runnable {
    public final int f17913a;
    public final DownloadController f17914b;

    public b2(DownloadController downloadController, int i10) {
        this.f17913a = i10;
        this.f17914b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17913a) {
            case 0:
                DownloadController.m(this.f17914b);
                return;
            case 1:
                DownloadController.l(this.f17914b);
                return;
            default:
                DownloadController.a(this.f17914b);
                return;
        }
    }
}
