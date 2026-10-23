package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class y6 implements Runnable {
    public final int f20200a;
    public final MediaController.MediaLoader f20201b;
    public final int f20202c;

    public y6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f20200a = i11;
        this.f20201b = mediaLoader;
        this.f20202c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20200a) {
            case 0:
                this.f20201b.lambda$didReceivedNotification$11(this.f20202c);
                return;
            case 1:
                this.f20201b.lambda$copyFile$9(this.f20202c);
                return;
            case 2:
                this.f20201b.lambda$copyFile$10(this.f20202c);
                return;
            default:
                this.f20201b.lambda$processLivePhotoMessage$6(this.f20202c);
                return;
        }
    }
}
