package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f18636a;
    public final MediaController.MediaLoader f18637b;
    public final int f18638c;

    public v6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f18636a = i11;
        this.f18637b = mediaLoader;
        this.f18638c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18636a) {
            case 0:
                this.f18637b.lambda$didReceivedNotification$11(this.f18638c);
                return;
            case 1:
                this.f18637b.lambda$copyFile$9(this.f18638c);
                return;
            case 2:
                this.f18637b.lambda$copyFile$10(this.f18638c);
                return;
            default:
                this.f18637b.lambda$processLivePhotoMessage$6(this.f18638c);
                return;
        }
    }
}
