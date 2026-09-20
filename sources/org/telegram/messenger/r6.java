package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17430a;
    public final MediaController.MediaLoader f17431b;
    public final int f17432c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17430a = i11;
        this.f17431b = mediaLoader;
        this.f17432c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17430a) {
            case 0:
                this.f17431b.lambda$didReceivedNotification$11(this.f17432c);
                return;
            case 1:
                this.f17431b.lambda$copyFile$9(this.f17432c);
                return;
            case 2:
                this.f17431b.lambda$copyFile$10(this.f17432c);
                return;
            default:
                this.f17431b.lambda$processLivePhotoMessage$6(this.f17432c);
                return;
        }
    }
}
