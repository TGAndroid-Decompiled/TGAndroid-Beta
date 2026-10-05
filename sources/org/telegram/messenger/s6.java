package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class s6 implements Runnable {
    public final int f19141a;
    public final MediaController.MediaLoader f19142b;

    public s6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f19141a = i10;
        this.f19142b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f19141a) {
            case 0:
                this.f19142b.lambda$start$1();
                return;
            case 1:
                this.f19142b.lambda$start$2();
                return;
            case 2:
                this.f19142b.lambda$copyFile$8();
                return;
            case 3:
                this.f19142b.lambda$checkIfFinished$3();
                return;
            default:
                this.f19142b.lambda$checkIfFinished$4();
                return;
        }
    }
}
