package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class q6 implements Runnable {
    public final int f18815a;
    public final MediaController.MediaLoader f18816b;
    public final int f18817c;

    public q6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f18815a = i11;
        this.f18816b = mediaLoader;
        this.f18817c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18815a) {
            case 0:
                this.f18816b.lambda$didReceivedNotification$11(this.f18817c);
                return;
            case 1:
                this.f18816b.lambda$copyFile$9(this.f18817c);
                return;
            case 2:
                this.f18816b.lambda$copyFile$10(this.f18817c);
                return;
            default:
                this.f18816b.lambda$processLivePhotoMessage$6(this.f18817c);
                return;
        }
    }
}
