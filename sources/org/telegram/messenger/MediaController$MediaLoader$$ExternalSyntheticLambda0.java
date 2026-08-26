package org.telegram.messenger;

public final class MediaController$MediaLoader$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final MediaController.MediaLoader f$0;
    public final int f$1;

    public MediaController$MediaLoader$$ExternalSyntheticLambda0(MediaController.MediaLoader mediaLoader, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = mediaLoader;
        this.f$1 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$didReceivedNotification$11(this.f$1);
                break;
            case 1:
                this.f$0.lambda$copyFile$9(this.f$1);
                break;
            case 2:
                this.f$0.lambda$copyFile$10(this.f$1);
                break;
            default:
                this.f$0.lambda$processLivePhotoMessage$6(this.f$1);
                break;
        }
    }
}
