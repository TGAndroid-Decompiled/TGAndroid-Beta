package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class x6 implements Runnable {
    public final int f16947a;
    public final MediaController.MediaLoader f16948b;
    public final int f16949c;

    public x6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f16947a = i11;
        this.f16948b = mediaLoader;
        this.f16949c = i10;
    }

    @Override
    public final void run() {
        switch (this.f16947a) {
            case 0:
                this.f16948b.lambda$didReceivedNotification$11(this.f16949c);
                return;
            case 1:
                this.f16948b.lambda$copyFile$9(this.f16949c);
                return;
            case 2:
                this.f16948b.lambda$copyFile$10(this.f16949c);
                return;
            default:
                this.f16948b.lambda$processLivePhotoMessage$6(this.f16949c);
                return;
        }
    }
}
