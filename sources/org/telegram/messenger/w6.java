package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class w6 implements Runnable {
    public final int f18903a;
    public final MediaController.MediaLoader f18904b;

    public w6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f18903a = i10;
        this.f18904b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f18903a) {
            case 0:
                this.f18904b.lambda$start$1();
                return;
            case 1:
                this.f18904b.lambda$start$2();
                return;
            case 2:
                this.f18904b.lambda$copyFile$8();
                return;
            case 3:
                this.f18904b.lambda$checkIfFinished$3();
                return;
            default:
                this.f18904b.lambda$checkIfFinished$4();
                return;
        }
    }
}
