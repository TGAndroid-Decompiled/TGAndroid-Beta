package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class s6 implements Runnable {
    public final int f17470a;
    public final MediaController.MediaLoader f17471b;

    public s6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f17470a = i10;
        this.f17471b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f17470a) {
            case 0:
                this.f17471b.lambda$start$1();
                return;
            case 1:
                this.f17471b.lambda$start$2();
                return;
            case 2:
                this.f17471b.lambda$copyFile$8();
                return;
            case 3:
                this.f17471b.lambda$checkIfFinished$3();
                return;
            default:
                this.f17471b.lambda$checkIfFinished$4();
                return;
        }
    }
}
