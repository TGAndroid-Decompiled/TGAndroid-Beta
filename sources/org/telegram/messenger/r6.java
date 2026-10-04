package org.telegram.messenger;

import org.telegram.messenger.MediaController;
public final class r6 implements Runnable {
    public final int f19052a;
    public final MediaController.MediaLoader f19053b;
    public final int f19054c;

    public r6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f19052a = i11;
        this.f19053b = mediaLoader;
        this.f19054c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19052a) {
            case 0:
                this.f19053b.lambda$didReceivedNotification$11(this.f19054c);
                return;
            case 1:
                this.f19053b.lambda$copyFile$9(this.f19054c);
                return;
            case 2:
                this.f19053b.lambda$copyFile$10(this.f19054c);
                return;
            default:
                this.f19053b.lambda$processLivePhotoMessage$6(this.f19054c);
                return;
        }
    }
}
