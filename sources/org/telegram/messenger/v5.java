package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f17747a;
    public final MediaController f17748b;

    public v5(MediaController mediaController, int i10) {
        this.f17747a = i10;
        this.f17748b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f17747a) {
            case 0:
                this.f17748b.lambda$startRaiseToEarSensors$8();
                return;
            case 1:
                this.f17748b.lambda$playMessage$20();
                return;
            case 2:
                this.f17748b.lambda$setTextureView$15();
                return;
            case 3:
                this.f17748b.lambda$toggleRecordingPause$29();
                return;
            case 4:
                this.f17748b.lambda$toggleRecordingPause$30();
                return;
            case 5:
                this.f17748b.lambda$stopRaiseToEarSensors$9();
                return;
            case 6:
                this.f17748b.lambda$new$2();
                return;
            case 7:
                this.f17748b.lambda$new$3();
                return;
            case 8:
                this.f17748b.lambda$new$4();
                return;
            case 9:
                this.f17748b.lambda$toggleRecordingPause$31();
                return;
            default:
                this.f17748b.lambda$setCurrentVideoVisible$14();
                return;
        }
    }
}
