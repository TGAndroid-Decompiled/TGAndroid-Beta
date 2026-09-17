package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19158a;
    public final MediaController f19159b;

    public u5(MediaController mediaController, int i10) {
        this.f19158a = i10;
        this.f19159b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f19158a) {
            case 0:
                this.f19159b.lambda$startRaiseToEarSensors$8();
                return;
            case 1:
                this.f19159b.lambda$playMessage$20();
                return;
            case 2:
                this.f19159b.lambda$setTextureView$15();
                return;
            case 3:
                this.f19159b.lambda$toggleRecordingPause$29();
                return;
            case 4:
                this.f19159b.lambda$toggleRecordingPause$30();
                return;
            case 5:
                this.f19159b.lambda$stopRaiseToEarSensors$9();
                return;
            case 6:
                this.f19159b.lambda$new$2();
                return;
            case 7:
                this.f19159b.lambda$new$3();
                return;
            case 8:
                this.f19159b.lambda$new$4();
                return;
            case 9:
                this.f19159b.lambda$toggleRecordingPause$31();
                return;
            default:
                this.f19159b.lambda$setCurrentVideoVisible$14();
                return;
        }
    }
}
