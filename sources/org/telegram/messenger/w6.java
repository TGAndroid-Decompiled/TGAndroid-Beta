package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class w6 implements Runnable {
    public final int f20519a;
    public final MediaController.MediaLoader f20520b;

    public w6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f20519a = i10;
        this.f20520b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f20519a) {
            case 0:
                this.f20520b.lambda$start$1();
                return;
            case 1:
                this.f20520b.lambda$start$2();
                return;
            case 2:
                this.f20520b.lambda$copyFile$8();
                return;
            case 3:
                this.f20520b.lambda$checkIfFinished$3();
                return;
            default:
                this.f20520b.lambda$checkIfFinished$4();
                return;
        }
    }
}
