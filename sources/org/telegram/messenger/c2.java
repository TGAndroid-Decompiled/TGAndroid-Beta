package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f18008a;
    public final DownloadController f18009b;

    public c2(DownloadController downloadController, int i10) {
        this.f18008a = i10;
        this.f18009b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18008a) {
            case 0:
                DownloadController.m(this.f18009b);
                return;
            case 1:
                DownloadController.l(this.f18009b);
                return;
            default:
                DownloadController.a(this.f18009b);
                return;
        }
    }
}
