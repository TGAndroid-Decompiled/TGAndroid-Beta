package org.telegram.messenger;

public final class s6 implements Runnable {

    public final int f21503a;

    public final MediaController.MediaLoader f21504b;

    public final int f21505c;

    public s6(MediaController.MediaLoader mediaLoader, int i10, int i11) {
        this.f21503a = i11;
        this.f21504b = mediaLoader;
        this.f21505c = i10;
    }

    @Override
    public final void run() {
        switch (this.f21503a) {
            case 0:
                this.f21504b.lambda$didReceivedNotification$11(this.f21505c);
                break;
            case 1:
                this.f21504b.lambda$copyFile$9(this.f21505c);
                break;
            case 2:
                this.f21504b.lambda$copyFile$10(this.f21505c);
                break;
            default:
                this.f21504b.lambda$processLivePhotoMessage$6(this.f21505c);
                break;
        }
    }
}
