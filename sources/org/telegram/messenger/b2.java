package org.telegram.messenger;
public final class b2 implements Runnable {
    public final int f17910a;
    public final DownloadController f17911b;

    public b2(DownloadController downloadController, int i10) {
        this.f17910a = i10;
        this.f17911b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17910a) {
            case 0:
                DownloadController.m(this.f17911b);
                return;
            case 1:
                DownloadController.l(this.f17911b);
                return;
            default:
                DownloadController.a(this.f17911b);
                return;
        }
    }
}
