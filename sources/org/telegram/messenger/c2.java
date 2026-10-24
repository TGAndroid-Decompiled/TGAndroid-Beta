package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f18059a;
    public final DownloadController f18060b;

    public c2(DownloadController downloadController, int i10) {
        this.f18059a = i10;
        this.f18060b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18059a) {
            case 0:
                DownloadController.m(this.f18060b);
                return;
            case 1:
                DownloadController.l(this.f18060b);
                return;
            default:
                DownloadController.a(this.f18060b);
                return;
        }
    }
}
