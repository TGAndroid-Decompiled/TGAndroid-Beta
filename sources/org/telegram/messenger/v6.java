package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f21794a;
    public final MediaController.MediaLoader f21795b;

    public v6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f21794a = i10;
        this.f21795b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f21794a) {
            case 0:
                this.f21795b.lambda$start$1();
                return;
            case 1:
                this.f21795b.lambda$start$2();
                return;
            case 2:
                this.f21795b.lambda$copyFile$8();
                return;
            case 3:
                this.f21795b.lambda$checkIfFinished$3();
                return;
            default:
                this.f21795b.lambda$checkIfFinished$4();
                return;
        }
    }
}
