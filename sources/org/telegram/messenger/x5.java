package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18950a;
    public final MediaController f18951b;

    public x5(MediaController mediaController, int i10) {
        this.f18950a = i10;
        this.f18951b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f18950a) {
            case 0:
                this.f18951b.lambda$startRaiseToEarSensors$8();
                return;
            case 1:
                this.f18951b.lambda$playMessage$20();
                return;
            case 2:
                this.f18951b.lambda$setTextureView$15();
                return;
            case 3:
                this.f18951b.lambda$toggleRecordingPause$29();
                return;
            case 4:
                this.f18951b.lambda$toggleRecordingPause$30();
                return;
            case 5:
                this.f18951b.lambda$stopRaiseToEarSensors$9();
                return;
            case 6:
                this.f18951b.lambda$new$2();
                return;
            case 7:
                this.f18951b.lambda$new$3();
                return;
            case 8:
                this.f18951b.lambda$new$4();
                return;
            case 9:
                this.f18951b.lambda$toggleRecordingPause$31();
                return;
            default:
                this.f18951b.lambda$setCurrentVideoVisible$14();
                return;
        }
    }
}
