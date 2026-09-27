package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17439a;
    public final MediaController.MediaLoader f17440b;
    public final int f17441c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17439a = i11;
        this.f17440b = mediaLoader;
        this.f17441c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17439a) {
            case 0:
                this.f17440b.lambda$didReceivedNotification$11(this.f17441c);
                return;
            case 1:
                this.f17440b.lambda$copyFile$9(this.f17441c);
                return;
            case 2:
                this.f17440b.lambda$copyFile$10(this.f17441c);
                return;
            default:
                this.f17440b.lambda$processLivePhotoMessage$6(this.f17441c);
                return;
        }
    }
}
