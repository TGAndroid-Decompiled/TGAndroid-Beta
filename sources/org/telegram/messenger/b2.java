package org.telegram.messenger;
public final class b2 implements Runnable {
    public final int f17915a;
    public final DownloadController f17916b;

    public b2(DownloadController downloadController, int i10) {
        this.f17915a = i10;
        this.f17916b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17915a) {
            case 0:
                DownloadController.m(this.f17916b);
                return;
            case 1:
                DownloadController.l(this.f17916b);
                return;
            default:
                DownloadController.a(this.f17916b);
                return;
        }
    }
}
