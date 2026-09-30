package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17460a;
    public final MediaController.MediaLoader f17461b;
    public final int f17462c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17460a = i11;
        this.f17461b = mediaLoader;
        this.f17462c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17460a) {
            case 0:
                this.f17461b.lambda$didReceivedNotification$11(this.f17462c);
                return;
            case 1:
                this.f17461b.lambda$copyFile$9(this.f17462c);
                return;
            case 2:
                this.f17461b.lambda$copyFile$10(this.f17462c);
                return;
            default:
                this.f17461b.lambda$processLivePhotoMessage$6(this.f17462c);
                return;
        }
    }
}
