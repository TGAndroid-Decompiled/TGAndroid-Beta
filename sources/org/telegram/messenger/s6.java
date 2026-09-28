package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class s6 implements Runnable {
    public final int f17518a;
    public final MediaController.MediaLoader f17519b;

    public s6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f17518a = i10;
        this.f17519b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f17518a) {
            case 0:
                this.f17519b.lambda$start$1();
                return;
            case 1:
                this.f17519b.lambda$start$2();
                return;
            case 2:
                this.f17519b.lambda$copyFile$8();
                return;
            case 3:
                this.f17519b.lambda$checkIfFinished$3();
                return;
            default:
                this.f17519b.lambda$checkIfFinished$4();
                return;
        }
    }
}
