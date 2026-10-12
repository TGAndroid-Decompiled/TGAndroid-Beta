package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class w6 implements Runnable {
    public final int f19443a;
    public final MediaController.MediaLoader f19444b;

    public w6(MediaController.MediaLoader mediaLoader, int i10) {
        this.f19443a = i10;
        this.f19444b = mediaLoader;
    }

    @Override
    public final void run() {
        switch (this.f19443a) {
            case 0:
                this.f19444b.lambda$start$1();
                return;
            case 1:
                this.f19444b.lambda$start$2();
                return;
            case 2:
                this.f19444b.lambda$copyFile$8();
                return;
            case 3:
                this.f19444b.lambda$checkIfFinished$3();
                return;
            default:
                this.f19444b.lambda$checkIfFinished$4();
                return;
        }
    }
}
