package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class y6 implements Runnable {
    public final int f17037a;
    public final MediaController.MediaLoader f17038b;

    public y6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f17037a = i10;
        this.f17038b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f17037a) {
            case 0:
                this.f17038b.lambda$start$1();
                return;
            case 1:
                this.f17038b.lambda$start$2();
                return;
            case 2:
                this.f17038b.lambda$copyFile$8();
                return;
            case 3:
                this.f17038b.lambda$checkIfFinished$3();
                return;
            default:
                this.f17038b.lambda$checkIfFinished$4();
                return;
        }
    }
}
