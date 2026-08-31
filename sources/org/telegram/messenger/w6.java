package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class w6 implements Runnable {
    public final int f20517a;
    public final MediaController.MediaLoader f20518b;

    public w6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f20517a = i10;
        this.f20518b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f20517a) {
            case 0:
                this.f20518b.lambda$start$1();
                return;
            case 1:
                this.f20518b.lambda$start$2();
                return;
            case 2:
                this.f20518b.lambda$copyFile$8();
                return;
            case 3:
                this.f20518b.lambda$checkIfFinished$3();
                return;
            default:
                this.f20518b.lambda$checkIfFinished$4();
                return;
        }
    }
}
