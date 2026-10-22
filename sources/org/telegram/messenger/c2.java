package org.telegram.messenger;
public final class c2 implements Runnable {
    public final int f17995a;
    public final DownloadController f17996b;

    public c2(DownloadController downloadController, int i10) {
        this.f17995a = i10;
        this.f17996b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f17995a) {
            case 0:
                DownloadController.m(this.f17996b);
                return;
            case 1:
                DownloadController.l(this.f17996b);
                return;
            default:
                DownloadController.a(this.f17996b);
                return;
        }
    }
}
