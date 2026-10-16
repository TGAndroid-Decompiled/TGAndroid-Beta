package org.telegram.messenger;
public final class b2 implements Runnable {
    public final int f16526a;
    public final DownloadController f16527b;

    public b2(DownloadController downloadController, int i10) {
        this.f16526a = i10;
        this.f16527b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f16526a) {
            case 0:
                DownloadController.m(this.f16527b);
                return;
            case 1:
                DownloadController.l(this.f16527b);
                return;
            default:
                DownloadController.a(this.f16527b);
                return;
        }
    }
}
