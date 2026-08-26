package org.telegram.messenger;

public final class MediaController$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final MediaController f$0;

    public MediaController$$ExternalSyntheticLambda10(MediaController mediaController, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setCurrentVideoVisible$14();
                break;
            case 1:
                this.f$0.lambda$startRaiseToEarSensors$8();
                break;
            case 2:
                this.f$0.lambda$playMessage$20();
                break;
            case 3:
                this.f$0.lambda$toggleRecordingPause$29();
                break;
            case 4:
                this.f$0.lambda$toggleRecordingPause$30();
                break;
            case 5:
                this.f$0.lambda$stopRaiseToEarSensors$9();
                break;
            case 6:
                this.f$0.lambda$new$2();
                break;
            case 7:
                this.f$0.lambda$new$3();
                break;
            case 8:
                this.f$0.lambda$new$4();
                break;
            case 9:
                this.f$0.lambda$setTextureView$15();
                break;
            default:
                this.f$0.lambda$toggleRecordingPause$31();
                break;
        }
    }
}
