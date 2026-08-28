package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f21378a;
    public final MediaController.MediaLoader f21379b;

    public r6(MediaController.MediaLoader mediaLoader, int i9) {
        this.f21378a = i9;
        this.f21379b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f21378a) {
            case 0:
                this.f21379b.lambda$start$1();
                return;
            case 1:
                this.f21379b.lambda$start$2();
                return;
            case 2:
                this.f21379b.lambda$copyFile$8();
                return;
            case 3:
                this.f21379b.lambda$checkIfFinished$3();
                return;
            default:
                this.f21379b.lambda$checkIfFinished$4();
                return;
        }
    }
}
