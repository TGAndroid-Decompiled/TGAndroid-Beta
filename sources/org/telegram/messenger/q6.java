package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class q6 implements Runnable {
    public final int f21297a;
    public final MediaController.MediaLoader f21298b;
    public final int f21299c;

    public q6(MediaController.MediaLoader mediaLoader, int i9, int i10) {
        this.f21297a = i10;
        this.f21298b = mediaLoader;
        this.f21299c = i9;
    }

    @Override
    public final void run() {
        switch (this.f21297a) {
            case 0:
                this.f21298b.lambda$didReceivedNotification$11(this.f21299c);
                return;
            case 1:
                this.f21298b.lambda$copyFile$9(this.f21299c);
                return;
            case 2:
                this.f21298b.lambda$copyFile$10(this.f21299c);
                return;
            default:
                this.f21298b.lambda$processLivePhotoMessage$6(this.f21299c);
                return;
        }
    }
}
