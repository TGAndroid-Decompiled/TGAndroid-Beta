package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class t6 implements Runnable {
    public final int f19219a;
    public final MediaController.MediaLoader f19220b;

    public t6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f19219a = i10;
        this.f19220b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f19219a) {
            case 0:
                this.f19220b.lambda$start$1();
                return;
            case 1:
                this.f19220b.lambda$start$2();
                return;
            case 2:
                this.f19220b.lambda$copyFile$8();
                return;
            case 3:
                this.f19220b.lambda$checkIfFinished$3();
                return;
            default:
                this.f19220b.lambda$checkIfFinished$4();
                return;
        }
    }
}
