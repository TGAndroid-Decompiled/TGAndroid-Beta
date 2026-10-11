package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class s6 implements Runnable {
    public final int f19124a;
    public final MediaController.MediaLoader f19125b;
    public final int f19126c;

    public s6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19124a = i11;
        this.f19125b = mediaLoader;
        this.f19126c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19124a) {
            case 0:
                this.f19125b.lambda$didReceivedNotification$11(this.f19126c);
                return;
            case 1:
                this.f19125b.lambda$copyFile$9(this.f19126c);
                return;
            case 2:
                this.f19125b.lambda$copyFile$10(this.f19126c);
                return;
            default:
                this.f19125b.lambda$processLivePhotoMessage$6(this.f19126c);
                return;
        }
    }
}
