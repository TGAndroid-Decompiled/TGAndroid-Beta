package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f18863a;
    public final MediaController.MediaLoader f18864b;
    public final int f18865c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f18863a = i11;
        this.f18864b = mediaLoader;
        this.f18865c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18863a) {
            case 0:
                this.f18864b.lambda$didReceivedNotification$11(this.f18865c);
                return;
            case 1:
                this.f18864b.lambda$copyFile$9(this.f18865c);
                return;
            case 2:
                this.f18864b.lambda$copyFile$10(this.f18865c);
                return;
            default:
                this.f18864b.lambda$processLivePhotoMessage$6(this.f18865c);
                return;
        }
    }
}
