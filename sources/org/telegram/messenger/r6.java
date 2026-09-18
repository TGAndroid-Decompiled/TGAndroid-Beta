package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17389a;
    public final MediaController.MediaLoader f17390b;
    public final int f17391c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17389a = i11;
        this.f17390b = mediaLoader;
        this.f17391c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17389a) {
            case 0:
                this.f17390b.lambda$didReceivedNotification$11(this.f17391c);
                return;
            case 1:
                this.f17390b.lambda$copyFile$9(this.f17391c);
                return;
            case 2:
                this.f17390b.lambda$copyFile$10(this.f17391c);
                return;
            default:
                this.f17390b.lambda$processLivePhotoMessage$6(this.f17391c);
                return;
        }
    }
}
