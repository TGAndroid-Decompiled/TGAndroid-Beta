package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f19047a;
    public final MediaController.MediaLoader f19048b;
    public final int f19049c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19047a = i11;
        this.f19048b = mediaLoader;
        this.f19049c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19047a) {
            case 0:
                this.f19048b.lambda$didReceivedNotification$11(this.f19049c);
                return;
            case 1:
                this.f19048b.lambda$copyFile$9(this.f19049c);
                return;
            case 2:
                this.f19048b.lambda$copyFile$10(this.f19049c);
                return;
            default:
                this.f19048b.lambda$processLivePhotoMessage$6(this.f19049c);
                return;
        }
    }
}
