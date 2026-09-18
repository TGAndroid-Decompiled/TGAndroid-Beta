package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17217a;
    public final MediaController.MediaLoader f17218b;
    public final int f17219c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17217a = i11;
        this.f17218b = mediaLoader;
        this.f17219c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17217a) {
            case 0:
                this.f17218b.lambda$didReceivedNotification$11(this.f17219c);
                return;
            case 1:
                this.f17218b.lambda$copyFile$9(this.f17219c);
                return;
            case 2:
                this.f17218b.lambda$copyFile$10(this.f17219c);
                return;
            default:
                this.f17218b.lambda$processLivePhotoMessage$6(this.f17219c);
                return;
        }
    }
}
