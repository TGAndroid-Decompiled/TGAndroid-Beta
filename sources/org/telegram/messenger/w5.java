package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f19666a;
    public final MediaController f19667b;

    public w5(MediaController mediaController, int i10) {
        this.f19666a = i10;
        this.f19667b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f19666a) {
            case 0:
                this.f19667b.lambda$startRaiseToEarSensors$8();
                return;
            case 1:
                this.f19667b.lambda$playMessage$20();
                return;
            case 2:
                this.f19667b.lambda$setTextureView$15();
                return;
            case 3:
                this.f19667b.lambda$toggleRecordingPause$29();
                return;
            case 4:
                this.f19667b.lambda$toggleRecordingPause$30();
                return;
            case 5:
                this.f19667b.lambda$stopRaiseToEarSensors$9();
                return;
            case 6:
                this.f19667b.lambda$new$2();
                return;
            case 7:
                this.f19667b.lambda$new$3();
                return;
            case 8:
                this.f19667b.lambda$new$4();
                return;
            case 9:
                this.f19667b.lambda$toggleRecordingPause$31();
                return;
            default:
                this.f19667b.lambda$setCurrentVideoVisible$14();
                return;
        }
    }
}
