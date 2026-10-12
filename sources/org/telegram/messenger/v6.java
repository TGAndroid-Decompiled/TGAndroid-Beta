package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f19171a;
    public final MediaController.MediaLoader f19172b;
    public final int f19173c;

    public v6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19171a = i11;
        this.f19172b = mediaLoader;
        this.f19173c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19171a) {
            case 0:
                this.f19172b.lambda$didReceivedNotification$11(this.f19173c);
                return;
            case 1:
                this.f19172b.lambda$copyFile$9(this.f19173c);
                return;
            case 2:
                this.f19172b.lambda$copyFile$10(this.f19173c);
                return;
            default:
                this.f19172b.lambda$processLivePhotoMessage$6(this.f19173c);
                return;
        }
    }
}
