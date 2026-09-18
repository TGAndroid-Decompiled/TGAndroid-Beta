package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f17929a;
    public final DownloadController f17930b;

    public y1(DownloadController downloadController, int i10) {
        this.f17929a = i10;
        this.f17930b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17929a) {
            case 0:
                DownloadController.m(this.f17930b);
                return;
            case 1:
                DownloadController.l(this.f17930b);
                return;
            default:
                DownloadController.a(this.f17930b);
                return;
        }
    }
}
