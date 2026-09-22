package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f18160a;
    public final DownloadController f18161b;

    public y1(DownloadController downloadController, int i10) {
        this.f18160a = i10;
        this.f18161b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18160a) {
            case 0:
                DownloadController.m(this.f18161b);
                return;
            case 1:
                DownloadController.l(this.f18161b);
                return;
            default:
                DownloadController.a(this.f18161b);
                return;
        }
    }
}
