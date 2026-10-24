package org.telegram.messenger;
public final class i6 implements Runnable {
    public final int f18652a;
    public final MediaController f18653b;

    public i6(MediaController mediaController, int i10) {
        this.f18652a = i10;
        this.f18653b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f18652a) {
            case 0:
                this.f18653b.lambda$playMessage$20();
                return;
            case 1:
                this.f18653b.lambda$setTextureView$15();
                return;
            case 2:
                this.f18653b.lambda$stopRaiseToEarSensors$9();
                return;
            case 3:
                this.f18653b.lambda$toggleRecordingPause$31();
                return;
            case 4:
                this.f18653b.lambda$toggleRecordingPause$32();
                return;
            case 5:
                this.f18653b.lambda$new$2();
                return;
            case 6:
                this.f18653b.lambda$new$3();
                return;
            case 7:
                this.f18653b.lambda$new$4();
                return;
            case 8:
                this.f18653b.lambda$setCurrentVideoVisible$14();
                return;
            case 9:
                this.f18653b.lambda$toggleRecordingPause$33();
                return;
            default:
                this.f18653b.lambda$startRaiseToEarSensors$8();
                return;
        }
    }
}
