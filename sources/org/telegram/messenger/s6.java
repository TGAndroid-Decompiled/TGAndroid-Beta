package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class s6 implements Runnable {
    public final int f18981a;
    public final MediaController.MediaLoader f18982b;

    public s6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f18981a = i10;
        this.f18982b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f18981a) {
            case 0:
                this.f18982b.lambda$start$1();
                return;
            case 1:
                this.f18982b.lambda$start$2();
                return;
            case 2:
                this.f18982b.lambda$copyFile$8();
                return;
            case 3:
                this.f18982b.lambda$checkIfFinished$3();
                return;
            default:
                this.f18982b.lambda$checkIfFinished$4();
                return;
        }
    }
}
