package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class b7 implements Runnable {
    public final int f19679a;
    public final MediaController.MediaLoader f19680b;
    public final int f19681c;

    public b7(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19679a = i11;
        this.f19680b = mediaLoader;
        this.f19681c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19679a) {
            case 0:
                this.f19680b.lambda$didReceivedNotification$11(this.f19681c);
                return;
            case 1:
                this.f19680b.lambda$copyFile$9(this.f19681c);
                return;
            case 2:
                this.f19680b.lambda$copyFile$10(this.f19681c);
                return;
            default:
                this.f19680b.lambda$processLivePhotoMessage$6(this.f19681c);
                return;
        }
    }
}
