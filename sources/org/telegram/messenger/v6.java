package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f18650a;
    public final MediaController.MediaLoader f18651b;
    public final int f18652c;

    public v6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f18650a = i11;
        this.f18651b = mediaLoader;
        this.f18652c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18650a) {
            case 0:
                this.f18651b.lambda$didReceivedNotification$11(this.f18652c);
                return;
            case 1:
                this.f18651b.lambda$copyFile$9(this.f18652c);
                return;
            case 2:
                this.f18651b.lambda$copyFile$10(this.f18652c);
                return;
            default:
                this.f18651b.lambda$processLivePhotoMessage$6(this.f18652c);
                return;
        }
    }
}
