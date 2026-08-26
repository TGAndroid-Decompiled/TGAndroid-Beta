package org.telegram.messenger;

public final class MediaController$MediaLoader$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final MediaController.MediaLoader f$0;

    public MediaController$MediaLoader$$ExternalSyntheticLambda1(MediaController.MediaLoader mediaLoader, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaLoader;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$copyFile$8();
                break;
            case 1:
                this.f$0.lambda$start$1();
                break;
            case 2:
                this.f$0.lambda$start$2();
                break;
            case 3:
                this.f$0.lambda$checkIfFinished$3();
                break;
            default:
                this.f$0.lambda$checkIfFinished$4();
                break;
        }
    }
}
