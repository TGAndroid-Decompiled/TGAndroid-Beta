package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f19718a;
    public final MediaController.MediaLoader f19719b;

    public v6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f19718a = i10;
        this.f19719b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f19718a) {
            case 0:
                this.f19719b.lambda$start$1();
                return;
            case 1:
                this.f19719b.lambda$start$2();
                return;
            case 2:
                this.f19719b.lambda$copyFile$8();
                return;
            case 3:
                this.f19719b.lambda$checkIfFinished$3();
                return;
            default:
                this.f19719b.lambda$checkIfFinished$4();
                return;
        }
    }
}
