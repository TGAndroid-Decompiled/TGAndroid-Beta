package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f18875a;
    public final MediaController.MediaLoader f18876b;

    public r6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f18875a = i10;
        this.f18876b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f18875a) {
            case 0:
                this.f18876b.lambda$start$1();
                return;
            case 1:
                this.f18876b.lambda$start$2();
                return;
            case 2:
                this.f18876b.lambda$copyFile$8();
                return;
            case 3:
                this.f18876b.lambda$checkIfFinished$3();
                return;
            default:
                this.f18876b.lambda$checkIfFinished$4();
                return;
        }
    }
}
