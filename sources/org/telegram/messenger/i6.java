package org.telegram.messenger;
public final class i6 implements Runnable {
    public final int f18585a;
    public final MediaController f18586b;

    public i6(MediaController mediaController, int i10) {
        this.f18585a = i10;
        this.f18586b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f18585a) {
            case 0:
                this.f18586b.lambda$playMessage$20();
                return;
            case 1:
                this.f18586b.lambda$setTextureView$15();
                return;
            case 2:
                this.f18586b.lambda$stopRaiseToEarSensors$9();
                return;
            case 3:
                this.f18586b.lambda$toggleRecordingPause$31();
                return;
            case 4:
                this.f18586b.lambda$toggleRecordingPause$32();
                return;
            case 5:
                this.f18586b.lambda$new$2();
                return;
            case 6:
                this.f18586b.lambda$new$3();
                return;
            case 7:
                this.f18586b.lambda$new$4();
                return;
            case 8:
                this.f18586b.lambda$setCurrentVideoVisible$14();
                return;
            case 9:
                this.f18586b.lambda$toggleRecordingPause$33();
                return;
            default:
                this.f18586b.lambda$startRaiseToEarSensors$8();
                return;
        }
    }
}
