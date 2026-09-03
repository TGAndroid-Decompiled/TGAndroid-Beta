package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class v6 implements Runnable {
    public final int f18618a;
    public final MediaController.MediaLoader f18619b;
    public final int f18620c;

    public v6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f18618a = i11;
        this.f18619b = mediaLoader;
        this.f18620c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18618a) {
            case 0:
                this.f18619b.lambda$didReceivedNotification$11(this.f18620c);
                return;
            case 1:
                this.f18619b.lambda$copyFile$9(this.f18620c);
                return;
            case 2:
                this.f18619b.lambda$copyFile$10(this.f18620c);
                return;
            default:
                this.f18619b.lambda$processLivePhotoMessage$6(this.f18620c);
                return;
        }
    }
}
