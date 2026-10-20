package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class w6 implements Runnable {
    public final int f19957a;
    public final MediaController.MediaLoader f19958b;
    public final int f19959c;

    public w6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19957a = i11;
        this.f19958b = mediaLoader;
        this.f19959c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19957a) {
            case 0:
                this.f19958b.lambda$didReceivedNotification$11(this.f19959c);
                return;
            case 1:
                this.f19958b.lambda$copyFile$9(this.f19959c);
                return;
            case 2:
                this.f19958b.lambda$copyFile$10(this.f19959c);
                return;
            default:
                this.f19958b.lambda$processLivePhotoMessage$6(this.f19959c);
                return;
        }
    }
}
