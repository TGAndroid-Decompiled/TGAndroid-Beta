package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f16682a;
    public final DownloadController f16683b;

    public a2(DownloadController downloadController, int i10) {
        this.f16682a = i10;
        this.f16683b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f16682a) {
            case 0:
                DownloadController.m(this.f16683b);
                return;
            case 1:
                DownloadController.l(this.f16683b);
                return;
            default:
                DownloadController.a(this.f16683b);
                return;
        }
    }
}
