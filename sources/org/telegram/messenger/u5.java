package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f21626a;
    public final MediaController f21627b;

    public u5(MediaController mediaController, int i9) {
        this.f21626a = i9;
        this.f21627b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f21626a) {
            case 0:
                this.f21627b.lambda$startRaiseToEarSensors$8();
                return;
            case 1:
                this.f21627b.lambda$playMessage$20();
                return;
            case 2:
                this.f21627b.lambda$toggleRecordingPause$29();
                return;
            case 3:
                this.f21627b.lambda$toggleRecordingPause$30();
                return;
            case 4:
                this.f21627b.lambda$stopRaiseToEarSensors$9();
                return;
            case 5:
                this.f21627b.lambda$new$2();
                return;
            case 6:
                this.f21627b.lambda$new$3();
                return;
            case 7:
                this.f21627b.lambda$new$4();
                return;
            case 8:
                this.f21627b.lambda$setTextureView$15();
                return;
            case 9:
                this.f21627b.lambda$toggleRecordingPause$31();
                return;
            default:
                this.f21627b.lambda$setCurrentVideoVisible$14();
                return;
        }
    }
}
