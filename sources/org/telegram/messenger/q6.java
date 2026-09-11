package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class q6 implements Runnable {
    public final int f18788a;
    public final MediaController.MediaLoader f18789b;
    public final int f18790c;

    public q6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f18788a = i11;
        this.f18789b = mediaLoader;
        this.f18790c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18788a) {
            case 0:
                this.f18789b.lambda$didReceivedNotification$11(this.f18790c);
                return;
            case 1:
                this.f18789b.lambda$copyFile$9(this.f18790c);
                return;
            case 2:
                this.f18789b.lambda$copyFile$10(this.f18790c);
                return;
            default:
                this.f18789b.lambda$processLivePhotoMessage$6(this.f18790c);
                return;
        }
    }
}
