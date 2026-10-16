package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f18348a;
    public final MediaController.MediaLoader f18349b;
    public final int f18350c;

    public v6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f18348a = i11;
        this.f18349b = mediaLoader;
        this.f18350c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18348a) {
            case 0:
                this.f18349b.lambda$didReceivedNotification$11(this.f18350c);
                return;
            case 1:
                this.f18349b.lambda$copyFile$9(this.f18350c);
                return;
            case 2:
                this.f18349b.lambda$copyFile$10(this.f18350c);
                return;
            default:
                this.f18349b.lambda$processLivePhotoMessage$6(this.f18350c);
                return;
        }
    }
}
