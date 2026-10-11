package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class s6 implements Runnable {
    public final int f19160a;
    public final MediaController.MediaLoader f19161b;
    public final int f19162c;

    public s6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19160a = i11;
        this.f19161b = mediaLoader;
        this.f19162c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19160a) {
            case 0:
                this.f19161b.lambda$didReceivedNotification$11(this.f19162c);
                return;
            case 1:
                this.f19161b.lambda$copyFile$9(this.f19162c);
                return;
            case 2:
                this.f19161b.lambda$copyFile$10(this.f19162c);
                return;
            default:
                this.f19161b.lambda$processLivePhotoMessage$6(this.f19162c);
                return;
        }
    }
}
