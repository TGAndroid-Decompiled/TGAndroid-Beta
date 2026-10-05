package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f19057a;
    public final MediaController.MediaLoader f19058b;
    public final int f19059c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19057a = i11;
        this.f19058b = mediaLoader;
        this.f19059c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19057a) {
            case 0:
                this.f19058b.lambda$didReceivedNotification$11(this.f19059c);
                return;
            case 1:
                this.f19058b.lambda$copyFile$9(this.f19059c);
                return;
            case 2:
                this.f19058b.lambda$copyFile$10(this.f19059c);
                return;
            default:
                this.f19058b.lambda$processLivePhotoMessage$6(this.f19059c);
                return;
        }
    }
}
