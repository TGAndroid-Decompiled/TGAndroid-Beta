package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f17227a;
    public final DownloadController f17228b;

    public c2(DownloadController downloadController, int i10) {
        this.f17227a = i10;
        this.f17228b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17227a) {
            case 0:
                DownloadController.m(this.f17228b);
                return;
            case 1:
                DownloadController.l(this.f17228b);
                return;
            default:
                DownloadController.a(this.f17228b);
                return;
        }
    }
}
