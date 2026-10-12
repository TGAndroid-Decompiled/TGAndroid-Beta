package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f17226a;
    public final DownloadController f17227b;

    public c2(DownloadController downloadController, int i10) {
        this.f17226a = i10;
        this.f17227b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17226a) {
            case 0:
                DownloadController.m(this.f17227b);
                return;
            case 1:
                DownloadController.l(this.f17227b);
                return;
            default:
                DownloadController.a(this.f17227b);
                return;
        }
    }
}
