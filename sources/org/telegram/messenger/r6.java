package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f18890a;
    public final MediaController.MediaLoader f18891b;
    public final int f18892c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f18890a = i11;
        this.f18891b = mediaLoader;
        this.f18892c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18890a) {
            case 0:
                this.f18891b.lambda$didReceivedNotification$11(this.f18892c);
                return;
            case 1:
                this.f18891b.lambda$copyFile$9(this.f18892c);
                return;
            case 2:
                this.f18891b.lambda$copyFile$10(this.f18892c);
                return;
            default:
                this.f18891b.lambda$processLivePhotoMessage$6(this.f18892c);
                return;
        }
    }
}
