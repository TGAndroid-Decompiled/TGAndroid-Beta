package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17445a;
    public final MediaController.MediaLoader f17446b;
    public final int f17447c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17445a = i11;
        this.f17446b = mediaLoader;
        this.f17447c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17445a) {
            case 0:
                this.f17446b.lambda$didReceivedNotification$11(this.f17447c);
                return;
            case 1:
                this.f17446b.lambda$copyFile$9(this.f17447c);
                return;
            case 2:
                this.f17446b.lambda$copyFile$10(this.f17447c);
                return;
            default:
                this.f17446b.lambda$processLivePhotoMessage$6(this.f17447c);
                return;
        }
    }
}
