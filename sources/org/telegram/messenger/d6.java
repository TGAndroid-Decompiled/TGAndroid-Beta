package org.telegram.messenger;
public final class d6 implements Runnable {
    public final int f18158a;
    public final MediaController f18159b;

    public d6(MediaController mediaController, int i10) {
        this.f18158a = i10;
        this.f18159b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f18158a) {
            case 0:
                this.f18159b.lambda$toggleRecordingPause$30();
                return;
            case 1:
                this.f18159b.lambda$toggleRecordingPause$31();
                return;
            case 2:
                this.f18159b.lambda$toggleRecordingPause$32();
                return;
            case 3:
                this.f18159b.lambda$playMessage$20();
                return;
            case 4:
                this.f18159b.lambda$setTextureView$15();
                return;
            case 5:
                this.f18159b.lambda$stopRaiseToEarSensors$9();
                return;
            case 6:
                this.f18159b.lambda$new$2();
                return;
            case 7:
                this.f18159b.lambda$new$3();
                return;
            case 8:
                this.f18159b.lambda$new$4();
                return;
            case 9:
                this.f18159b.lambda$setCurrentVideoVisible$14();
                return;
            default:
                this.f18159b.lambda$startRaiseToEarSensors$8();
                return;
        }
    }
}
