package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f19713a;
    public final MediaController.MediaLoader f19714b;
    public final int f19715c;

    public v6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19713a = i11;
        this.f19714b = mediaLoader;
        this.f19715c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19713a) {
            case 0:
                this.f19714b.lambda$didReceivedNotification$11(this.f19715c);
                return;
            case 1:
                this.f19714b.lambda$copyFile$9(this.f19715c);
                return;
            case 2:
                this.f19714b.lambda$copyFile$10(this.f19715c);
                return;
            default:
                this.f19714b.lambda$processLivePhotoMessage$6(this.f19715c);
                return;
        }
    }
}
