package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f14827a;
    public final DownloadController f14828b;

    public c2(DownloadController downloadController, int i10) {
        this.f14827a = i10;
        this.f14828b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f14827a) {
            case 0:
                DownloadController.m(this.f14828b);
                return;
            case 1:
                DownloadController.l(this.f14828b);
                return;
            default:
                DownloadController.a(this.f14828b);
                return;
        }
    }
}
