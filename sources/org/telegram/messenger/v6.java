package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f19170a;
    public final MediaController.MediaLoader f19171b;
    public final int f19172c;

    public v6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19170a = i11;
        this.f19171b = mediaLoader;
        this.f19172c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19170a) {
            case 0:
                this.f19171b.lambda$didReceivedNotification$11(this.f19172c);
                return;
            case 1:
                this.f19171b.lambda$copyFile$9(this.f19172c);
                return;
            case 2:
                this.f19171b.lambda$copyFile$10(this.f19172c);
                return;
            default:
                this.f19171b.lambda$processLivePhotoMessage$6(this.f19172c);
                return;
        }
    }
}
