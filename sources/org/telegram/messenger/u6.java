package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class u6 implements Runnable {
    public final int f21699a;
    public final MediaController.MediaLoader f21700b;
    public final int f21701c;

    public u6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f21699a = i11;
        this.f21700b = mediaLoader;
        this.f21701c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21699a) {
            case 0:
                this.f21700b.lambda$didReceivedNotification$11(this.f21701c);
                return;
            case 1:
                this.f21700b.lambda$copyFile$9(this.f21701c);
                return;
            case 2:
                this.f21700b.lambda$copyFile$10(this.f21701c);
                return;
            default:
                this.f21700b.lambda$processLivePhotoMessage$6(this.f21701c);
                return;
        }
    }
}
