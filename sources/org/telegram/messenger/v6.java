package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f20251a;
    public final MediaController.MediaLoader f20252b;
    public final int f20253c;

    public v6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f20251a = i11;
        this.f20252b = mediaLoader;
        this.f20253c = i10;
    }

    @Override
    public final void run() {
        switch (this.f20251a) {
            case 0:
                this.f20252b.lambda$didReceivedNotification$11(this.f20253c);
                return;
            case 1:
                this.f20252b.lambda$copyFile$9(this.f20253c);
                return;
            case 2:
                this.f20252b.lambda$copyFile$10(this.f20253c);
                return;
            default:
                this.f20252b.lambda$processLivePhotoMessage$6(this.f20253c);
                return;
        }
    }
}
