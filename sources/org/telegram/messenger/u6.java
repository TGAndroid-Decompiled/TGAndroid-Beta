package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class u6 implements Runnable {
    public final int f19632a;
    public final MediaController.MediaLoader f19633b;
    public final int f19634c;

    public u6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19632a = i11;
        this.f19633b = mediaLoader;
        this.f19634c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19632a) {
            case 0:
                this.f19633b.lambda$didReceivedNotification$11(this.f19634c);
                return;
            case 1:
                this.f19633b.lambda$copyFile$9(this.f19634c);
                return;
            case 2:
                this.f19633b.lambda$copyFile$10(this.f19634c);
                return;
            default:
                this.f19633b.lambda$processLivePhotoMessage$6(this.f19634c);
                return;
        }
    }
}
