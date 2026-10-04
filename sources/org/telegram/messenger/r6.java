package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f19048a;
    public final MediaController.MediaLoader f19049b;
    public final int f19050c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19048a = i11;
        this.f19049b = mediaLoader;
        this.f19050c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19048a) {
            case 0:
                this.f19049b.lambda$didReceivedNotification$11(this.f19050c);
                return;
            case 1:
                this.f19049b.lambda$copyFile$9(this.f19050c);
                return;
            case 2:
                this.f19049b.lambda$copyFile$10(this.f19050c);
                return;
            default:
                this.f19049b.lambda$processLivePhotoMessage$6(this.f19050c);
                return;
        }
    }
}
