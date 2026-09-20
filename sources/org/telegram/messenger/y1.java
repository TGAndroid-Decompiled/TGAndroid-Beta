package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f18145a;
    public final DownloadController f18146b;

    public y1(DownloadController downloadController, int i10) {
        this.f18145a = i10;
        this.f18146b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18145a) {
            case 0:
                DownloadController.m(this.f18146b);
                return;
            case 1:
                DownloadController.l(this.f18146b);
                return;
            default:
                DownloadController.a(this.f18146b);
                return;
        }
    }
}
