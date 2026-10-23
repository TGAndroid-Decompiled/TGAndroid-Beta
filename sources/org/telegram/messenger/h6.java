package org.telegram.messenger;
public final class h6 implements Runnable {
    public final int f18513a;
    public final MediaController f18514b;

    public h6(MediaController mediaController, int i10) {
        this.f18513a = i10;
        this.f18514b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f18513a) {
            case 0:
                this.f18514b.lambda$playMessage$20();
                return;
            case 1:
                this.f18514b.lambda$setTextureView$15();
                return;
            case 2:
                this.f18514b.lambda$stopRaiseToEarSensors$9();
                return;
            case 3:
                this.f18514b.lambda$toggleRecordingPause$31();
                return;
            case 4:
                this.f18514b.lambda$toggleRecordingPause$32();
                return;
            case 5:
                this.f18514b.lambda$new$2();
                return;
            case 6:
                this.f18514b.lambda$new$3();
                return;
            case 7:
                this.f18514b.lambda$new$4();
                return;
            case 8:
                this.f18514b.lambda$setCurrentVideoVisible$14();
                return;
            case 9:
                this.f18514b.lambda$toggleRecordingPause$33();
                return;
            default:
                this.f18514b.lambda$startRaiseToEarSensors$8();
                return;
        }
    }
}
