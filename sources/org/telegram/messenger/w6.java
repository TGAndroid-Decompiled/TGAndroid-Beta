package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class w6 implements Runnable {
    public final int f18879a;
    public final MediaController.MediaLoader f18880b;

    public w6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f18879a = i10;
        this.f18880b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f18879a) {
            case 0:
                this.f18880b.lambda$start$1();
                return;
            case 1:
                this.f18880b.lambda$start$2();
                return;
            case 2:
                this.f18880b.lambda$copyFile$8();
                return;
            case 3:
                this.f18880b.lambda$checkIfFinished$3();
                return;
            default:
                this.f18880b.lambda$checkIfFinished$4();
                return;
        }
    }
}
