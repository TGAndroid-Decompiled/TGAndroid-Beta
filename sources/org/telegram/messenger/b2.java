package org.telegram.messenger;
public final class b2 implements Runnable {
    public final int f17918a;
    public final DownloadController f17919b;

    public b2(DownloadController downloadController, int i10) {
        this.f17918a = i10;
        this.f17919b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17918a) {
            case 0:
                DownloadController.m(this.f17919b);
                return;
            case 1:
                DownloadController.l(this.f17919b);
                return;
            default:
                DownloadController.a(this.f17919b);
                return;
        }
    }
}
