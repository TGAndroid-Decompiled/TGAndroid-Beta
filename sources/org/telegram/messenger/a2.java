package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f16701a;
    public final DownloadController f16702b;

    public a2(DownloadController downloadController, int i10) {
        this.f16701a = i10;
        this.f16702b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f16701a) {
            case 0:
                DownloadController.m(this.f16702b);
                return;
            case 1:
                DownloadController.l(this.f16702b);
                return;
            default:
                DownloadController.a(this.f16702b);
                return;
        }
    }
}
