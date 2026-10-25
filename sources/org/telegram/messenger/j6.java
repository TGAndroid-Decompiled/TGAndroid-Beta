package org.telegram.messenger;
public final class j6 implements Runnable {
    public final int f20395a;
    public final MediaController f20396b;

    public j6(MediaController mediaController, int i10) {
        this.f20395a = i10;
        this.f20396b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f20395a) {
            case 0:
                this.f20396b.lambda$playMessage$20();
                return;
            case 1:
                this.f20396b.lambda$setTextureView$15();
                return;
            case 2:
                this.f20396b.lambda$stopRaiseToEarSensors$9();
                return;
            case 3:
                this.f20396b.lambda$toggleRecordingPause$31();
                return;
            case 4:
                this.f20396b.lambda$toggleRecordingPause$32();
                return;
            case 5:
                this.f20396b.lambda$new$2();
                return;
            case 6:
                this.f20396b.lambda$new$3();
                return;
            case 7:
                this.f20396b.lambda$new$4();
                return;
            case 8:
                this.f20396b.lambda$setCurrentVideoVisible$14();
                return;
            case 9:
                this.f20396b.lambda$toggleRecordingPause$33();
                return;
            default:
                this.f20396b.lambda$startRaiseToEarSensors$8();
                return;
        }
    }
}
