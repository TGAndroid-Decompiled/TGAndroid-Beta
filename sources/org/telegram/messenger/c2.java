package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f18006a;
    public final DownloadController f18007b;

    public c2(DownloadController downloadController, int i10) {
        this.f18006a = i10;
        this.f18007b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18006a) {
            case 0:
                DownloadController.m(this.f18007b);
                return;
            case 1:
                DownloadController.l(this.f18007b);
                return;
            default:
                DownloadController.a(this.f18007b);
                return;
        }
    }
}
