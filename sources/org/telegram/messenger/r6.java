package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17208a;
    public final MediaController.MediaLoader f17209b;
    public final int f17210c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17208a = i11;
        this.f17209b = mediaLoader;
        this.f17210c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17208a) {
            case 0:
                this.f17209b.lambda$didReceivedNotification$11(this.f17210c);
                return;
            case 1:
                this.f17209b.lambda$copyFile$9(this.f17210c);
                return;
            case 2:
                this.f17209b.lambda$copyFile$10(this.f17210c);
                return;
            default:
                this.f17209b.lambda$processLivePhotoMessage$6(this.f17210c);
                return;
        }
    }
}
