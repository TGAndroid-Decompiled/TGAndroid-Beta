package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f20253a;
    public final MediaController.MediaLoader f20254b;
    public final int f20255c;

    public v6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f20253a = i11;
        this.f20254b = mediaLoader;
        this.f20255c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20253a) {
            case 0:
                this.f20254b.lambda$didReceivedNotification$11(this.f20255c);
                return;
            case 1:
                this.f20254b.lambda$copyFile$9(this.f20255c);
                return;
            case 2:
                this.f20254b.lambda$copyFile$10(this.f20255c);
                return;
            default:
                this.f20254b.lambda$processLivePhotoMessage$6(this.f20255c);
                return;
        }
    }
}
