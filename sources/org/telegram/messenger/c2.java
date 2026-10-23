package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f18069a;
    public final DownloadController f18070b;

    public c2(DownloadController downloadController, int i10) {
        this.f18069a = i10;
        this.f18070b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18069a) {
            case 0:
                DownloadController.m(this.f18070b);
                return;
            case 1:
                DownloadController.l(this.f18070b);
                return;
            default:
                DownloadController.a(this.f18070b);
                return;
        }
    }
}
