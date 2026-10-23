package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class y6 implements Runnable {
    public final int f20137a;
    public final MediaController.MediaLoader f20138b;
    public final int f20139c;

    public y6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f20137a = i11;
        this.f20138b = mediaLoader;
        this.f20139c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20137a) {
            case 0:
                this.f20138b.lambda$didReceivedNotification$11(this.f20139c);
                return;
            case 1:
                this.f20138b.lambda$copyFile$9(this.f20139c);
                return;
            case 2:
                this.f20138b.lambda$copyFile$10(this.f20139c);
                return;
            default:
                this.f20138b.lambda$processLivePhotoMessage$6(this.f20139c);
                return;
        }
    }
}
