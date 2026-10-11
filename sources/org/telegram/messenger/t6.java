package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class t6 implements Runnable {
    public final int f19257a;
    public final MediaController.MediaLoader f19258b;

    public t6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f19257a = i10;
        this.f19258b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f19257a) {
            case 0:
                this.f19258b.lambda$start$1();
                return;
            case 1:
                this.f19258b.lambda$start$2();
                return;
            case 2:
                this.f19258b.lambda$copyFile$8();
                return;
            case 3:
                this.f19258b.lambda$checkIfFinished$3();
                return;
            default:
                this.f19258b.lambda$checkIfFinished$4();
                return;
        }
    }
}
