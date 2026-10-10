package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class s6 implements Runnable {
    public final int f19122a;
    public final MediaController.MediaLoader f19123b;
    public final int f19124c;

    public s6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19122a = i11;
        this.f19123b = mediaLoader;
        this.f19124c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19122a) {
            case 0:
                this.f19123b.lambda$didReceivedNotification$11(this.f19124c);
                return;
            case 1:
                this.f19123b.lambda$copyFile$9(this.f19124c);
                return;
            case 2:
                this.f19123b.lambda$copyFile$10(this.f19124c);
                return;
            default:
                this.f19123b.lambda$processLivePhotoMessage$6(this.f19124c);
                return;
        }
    }
}
