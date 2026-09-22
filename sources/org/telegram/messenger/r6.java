package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17204a;
    public final MediaController.MediaLoader f17205b;
    public final int f17206c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17204a = i11;
        this.f17205b = mediaLoader;
        this.f17206c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17204a) {
            case 0:
                this.f17205b.lambda$didReceivedNotification$11(this.f17206c);
                return;
            case 1:
                this.f17205b.lambda$copyFile$9(this.f17206c);
                return;
            case 2:
                this.f17205b.lambda$copyFile$10(this.f17206c);
                return;
            default:
                this.f17205b.lambda$processLivePhotoMessage$6(this.f17206c);
                return;
        }
    }
}
