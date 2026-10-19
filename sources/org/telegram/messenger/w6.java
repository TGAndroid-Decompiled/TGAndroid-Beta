package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class w6 implements Runnable {
    public final int f19956a;
    public final MediaController.MediaLoader f19957b;

    public w6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f19956a = i10;
        this.f19957b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f19956a) {
            case 0:
                this.f19957b.lambda$start$1();
                return;
            case 1:
                this.f19957b.lambda$start$2();
                return;
            case 2:
                this.f19957b.lambda$copyFile$8();
                return;
            case 3:
                this.f19957b.lambda$checkIfFinished$3();
                return;
            default:
                this.f19957b.lambda$checkIfFinished$4();
                return;
        }
    }
}
