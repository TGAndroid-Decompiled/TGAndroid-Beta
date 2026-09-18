package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f18097a;
    public final DownloadController f18098b;

    public y1(DownloadController downloadController, int i10) {
        this.f18097a = i10;
        this.f18098b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18097a) {
            case 0:
                DownloadController.m(this.f18098b);
                return;
            case 1:
                DownloadController.l(this.f18098b);
                return;
            default:
                DownloadController.a(this.f18098b);
                return;
        }
    }
}
