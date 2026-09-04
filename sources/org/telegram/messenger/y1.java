package org.telegram.messenger;
public final class y1 implements Runnable {
    public final int f19652a;
    public final DownloadController f19653b;

    public y1(DownloadController downloadController, int i10) {
        this.f19652a = i10;
        this.f19653b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19652a) {
            case 0:
                DownloadController.m(this.f19653b);
                return;
            case 1:
                DownloadController.l(this.f19653b);
                return;
            default:
                DownloadController.a(this.f19653b);
                return;
        }
    }
}
