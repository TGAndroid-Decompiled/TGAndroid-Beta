package org.telegram.messenger;

public final class a2 implements Runnable {

    public final int f19657a;

    public final DownloadController f19658b;

    public a2(DownloadController downloadController, int i10) {
        this.f19657a = i10;
        this.f19658b = downloadController;
    }

    @Override
    public final void run() {
        switch (this.f19657a) {
            case 0:
                this.f19658b.lambda$clearRecentDownloadedFiles$12();
                break;
            case 1:
                this.f19658b.lambda$new$0();
                break;
            default:
                this.f19658b.lambda$loadDownloadingFiles$11();
                break;
        }
    }
}
