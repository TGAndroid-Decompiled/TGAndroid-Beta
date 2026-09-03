package org.telegram.messenger;
public final class a2 implements Runnable {
    public final int f18091a;
    public final DownloadController f18092b;

    public a2(DownloadController downloadController, int i10) {
        this.f18091a = i10;
        this.f18092b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f18091a) {
            case 0:
                DownloadController.m(this.f18092b);
                return;
            case 1:
                DownloadController.l(this.f18092b);
                return;
            default:
                DownloadController.a(this.f18092b);
                return;
        }
    }
}
