package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class s6 implements Runnable {
    public final int f19129a;
    public final MediaController.MediaLoader f19130b;

    public s6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f19129a = i10;
        this.f19130b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f19129a) {
            case 0:
                this.f19130b.lambda$start$1();
                return;
            case 1:
                this.f19130b.lambda$start$2();
                return;
            case 2:
                this.f19130b.lambda$copyFile$8();
                return;
            case 3:
                this.f19130b.lambda$checkIfFinished$3();
                return;
            default:
                this.f19130b.lambda$checkIfFinished$4();
                return;
        }
    }
}
