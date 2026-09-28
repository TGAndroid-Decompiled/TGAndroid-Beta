package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f17746a;
    public final MediaController f17747b;

    public v5(MediaController mediaController, int i10) {
        this.f17746a = i10;
        this.f17747b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f17746a) {
            case 0:
                this.f17747b.lambda$startRaiseToEarSensors$8();
                return;
            case 1:
                this.f17747b.lambda$playMessage$20();
                return;
            case 2:
                this.f17747b.lambda$setTextureView$15();
                return;
            case 3:
                this.f17747b.lambda$toggleRecordingPause$29();
                return;
            case 4:
                this.f17747b.lambda$toggleRecordingPause$30();
                return;
            case 5:
                this.f17747b.lambda$stopRaiseToEarSensors$9();
                return;
            case 6:
                this.f17747b.lambda$new$2();
                return;
            case 7:
                this.f17747b.lambda$new$3();
                return;
            case 8:
                this.f17747b.lambda$new$4();
                return;
            case 9:
                this.f17747b.lambda$toggleRecordingPause$31();
                return;
            default:
                this.f17747b.lambda$setCurrentVideoVisible$14();
                return;
        }
    }
}
