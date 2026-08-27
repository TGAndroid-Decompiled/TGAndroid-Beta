package org.telegram.messenger;

public final class t6 implements Runnable {

    public final int f21610a;

    public final MediaController.MediaLoader f21611b;

    public t6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f21610a = i10;
        this.f21611b = mediaLoader;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f21610a) {
            case 0:
                this.f21611b.lambda$start$1();
                break;
            case 1:
                this.f21611b.lambda$start$2();
                break;
            case 2:
                this.f21611b.lambda$copyFile$8();
                break;
            case 3:
                this.f21611b.lambda$checkIfFinished$3();
                break;
            default:
                this.f21611b.lambda$checkIfFinished$4();
                break;
        }
    }
}
