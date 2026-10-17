package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class u6 implements Runnable {
    public final int f19631a;
    public final MediaController.MediaLoader f19632b;
    public final int f19633c;

    public u6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19631a = i11;
        this.f19632b = mediaLoader;
        this.f19633c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19631a) {
            case 0:
                this.f19632b.lambda$didReceivedNotification$11(this.f19633c);
                return;
            case 1:
                this.f19632b.lambda$copyFile$9(this.f19633c);
                return;
            case 2:
                this.f19632b.lambda$copyFile$10(this.f19633c);
                return;
            default:
                this.f19632b.lambda$processLivePhotoMessage$6(this.f19633c);
                return;
        }
    }
}
