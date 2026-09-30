package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17444a;
    public final MediaController.MediaLoader f17445b;
    public final int f17446c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17444a = i11;
        this.f17445b = mediaLoader;
        this.f17446c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17444a) {
            case 0:
                this.f17445b.lambda$didReceivedNotification$11(this.f17446c);
                return;
            case 1:
                this.f17445b.lambda$copyFile$9(this.f17446c);
                return;
            case 2:
                this.f17445b.lambda$copyFile$10(this.f17446c);
                return;
            default:
                this.f17445b.lambda$processLivePhotoMessage$6(this.f17446c);
                return;
        }
    }
}
