package org.telegram.messenger;
public final class k6 implements Runnable {
    public final int f20484a;
    public final MediaController f20485b;

    public k6(MediaController mediaController, int i10) {
        this.f20484a = i10;
        this.f20485b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f20484a) {
            case 0:
                this.f20485b.lambda$playMessage$20();
                return;
            case 1:
                this.f20485b.lambda$setTextureView$15();
                return;
            case 2:
                this.f20485b.lambda$stopRaiseToEarSensors$9();
                return;
            case 3:
                this.f20485b.lambda$toggleRecordingPause$31();
                return;
            case 4:
                this.f20485b.lambda$toggleRecordingPause$32();
                return;
            case 5:
                this.f20485b.lambda$new$2();
                return;
            case 6:
                this.f20485b.lambda$new$3();
                return;
            case 7:
                this.f20485b.lambda$new$4();
                return;
            case 8:
                this.f20485b.lambda$setCurrentVideoVisible$14();
                return;
            case 9:
                this.f20485b.lambda$toggleRecordingPause$33();
                return;
            default:
                this.f20485b.lambda$startRaiseToEarSensors$8();
                return;
        }
    }
}
