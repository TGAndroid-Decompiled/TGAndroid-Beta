package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f19710a;
    public final MediaController.MediaLoader f19711b;
    public final int f19712c;

    public v6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19710a = i11;
        this.f19711b = mediaLoader;
        this.f19712c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19710a) {
            case 0:
                this.f19711b.lambda$didReceivedNotification$11(this.f19712c);
                return;
            case 1:
                this.f19711b.lambda$copyFile$9(this.f19712c);
                return;
            case 2:
                this.f19711b.lambda$copyFile$10(this.f19712c);
                return;
            default:
                this.f19711b.lambda$processLivePhotoMessage$6(this.f19712c);
                return;
        }
    }
}
