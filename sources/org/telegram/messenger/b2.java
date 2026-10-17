package org.telegram.messenger;
public final class b2 implements Runnable {
    public final int f17902a;
    public final DownloadController f17903b;

    public b2(DownloadController downloadController, int i10) {
        this.f17902a = i10;
        this.f17903b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17902a) {
            case 0:
                DownloadController.m(this.f17903b);
                return;
            case 1:
                DownloadController.l(this.f17903b);
                return;
            default:
                DownloadController.a(this.f17903b);
                return;
        }
    }
}
