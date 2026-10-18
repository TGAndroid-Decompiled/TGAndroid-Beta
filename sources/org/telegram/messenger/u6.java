package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class u6 implements Runnable {
    public final int f19635a;
    public final MediaController.MediaLoader f19636b;
    public final int f19637c;

    public u6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19635a = i11;
        this.f19636b = mediaLoader;
        this.f19637c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19635a) {
            case 0:
                this.f19636b.lambda$didReceivedNotification$11(this.f19637c);
                return;
            case 1:
                this.f19636b.lambda$copyFile$9(this.f19637c);
                return;
            case 2:
                this.f19636b.lambda$copyFile$10(this.f19637c);
                return;
            default:
                this.f19636b.lambda$processLivePhotoMessage$6(this.f19637c);
                return;
        }
    }
}
