package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f17443a;
    public final MediaController.MediaLoader f17444b;
    public final int f17445c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f17443a = i11;
        this.f17444b = mediaLoader;
        this.f17445c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17443a) {
            case 0:
                this.f17444b.lambda$didReceivedNotification$11(this.f17445c);
                return;
            case 1:
                this.f17444b.lambda$copyFile$9(this.f17445c);
                return;
            case 2:
                this.f17444b.lambda$copyFile$10(this.f17445c);
                return;
            default:
                this.f17444b.lambda$processLivePhotoMessage$6(this.f17445c);
                return;
        }
    }
}
