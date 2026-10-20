package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class x6 implements Runnable {
    public final int f20054a;
    public final MediaController.MediaLoader f20055b;

    public x6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f20054a = i10;
        this.f20055b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f20054a) {
            case 0:
                this.f20055b.lambda$start$1();
                return;
            case 1:
                this.f20055b.lambda$start$2();
                return;
            case 2:
                this.f20055b.lambda$copyFile$8();
                return;
            case 3:
                this.f20055b.lambda$checkIfFinished$3();
                return;
            default:
                this.f20055b.lambda$checkIfFinished$4();
                return;
        }
    }
}
