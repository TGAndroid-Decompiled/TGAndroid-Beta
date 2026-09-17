package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f18902a;
    public final MediaController.MediaLoader f18903b;

    public r6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f18902a = i10;
        this.f18903b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f18902a) {
            case 0:
                this.f18903b.lambda$start$1();
                return;
            case 1:
                this.f18903b.lambda$start$2();
                return;
            case 2:
                this.f18903b.lambda$copyFile$8();
                return;
            case 3:
                this.f18903b.lambda$checkIfFinished$3();
                return;
            default:
                this.f18903b.lambda$checkIfFinished$4();
                return;
        }
    }
}
