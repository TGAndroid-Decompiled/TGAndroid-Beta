package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class c7 implements Runnable {
    public final int f19760a;
    public final MediaController.MediaLoader f19761b;

    public c7(MediaController.MediaLoader mediaLoader, int i10) {
        this.f19760a = i10;
        this.f19761b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f19760a) {
            case 0:
                this.f19761b.lambda$start$1();
                return;
            case 1:
                this.f19761b.lambda$start$2();
                return;
            case 2:
                this.f19761b.lambda$copyFile$8();
                return;
            case 3:
                this.f19761b.lambda$checkIfFinished$3();
                return;
            default:
                this.f19761b.lambda$checkIfFinished$4();
                return;
        }
    }
}
