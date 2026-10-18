package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f19719a;
    public final MediaController.MediaLoader f19720b;

    public v6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f19719a = i10;
        this.f19720b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f19719a) {
            case 0:
                this.f19720b.lambda$start$1();
                return;
            case 1:
                this.f19720b.lambda$start$2();
                return;
            case 2:
                this.f19720b.lambda$copyFile$8();
                return;
            case 3:
                this.f19720b.lambda$checkIfFinished$3();
                return;
            default:
                this.f19720b.lambda$checkIfFinished$4();
                return;
        }
    }
}
