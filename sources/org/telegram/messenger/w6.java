package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class w6 implements Runnable {
    public final int f19955a;
    public final MediaController.MediaLoader f19956b;
    public final int f19957c;

    public w6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19955a = i11;
        this.f19956b = mediaLoader;
        this.f19957c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19955a) {
            case 0:
                this.f19956b.lambda$didReceivedNotification$11(this.f19957c);
                return;
            case 1:
                this.f19956b.lambda$copyFile$9(this.f19957c);
                return;
            case 2:
                this.f19956b.lambda$copyFile$10(this.f19957c);
                return;
            default:
                this.f19956b.lambda$processLivePhotoMessage$6(this.f19957c);
                return;
        }
    }
}
