package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class s6 implements Runnable {
    public final int f19118a;
    public final MediaController.MediaLoader f19119b;
    public final int f19120c;

    public s6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19118a = i11;
        this.f19119b = mediaLoader;
        this.f19120c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19118a) {
            case 0:
                this.f19119b.lambda$didReceivedNotification$11(this.f19120c);
                return;
            case 1:
                this.f19119b.lambda$copyFile$9(this.f19120c);
                return;
            case 2:
                this.f19119b.lambda$copyFile$10(this.f19120c);
                return;
            default:
                this.f19119b.lambda$processLivePhotoMessage$6(this.f19120c);
                return;
        }
    }
}
