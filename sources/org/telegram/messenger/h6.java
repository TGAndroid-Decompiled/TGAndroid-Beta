package org.telegram.messenger;
public final class h6 implements Runnable {
    public final int f18579a;
    public final MediaController f18580b;

    public h6(MediaController mediaController, int i10) {
        this.f18579a = i10;
        this.f18580b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f18579a) {
            case 0:
                this.f18580b.lambda$playMessage$20();
                return;
            case 1:
                this.f18580b.lambda$setTextureView$15();
                return;
            case 2:
                this.f18580b.lambda$stopRaiseToEarSensors$9();
                return;
            case 3:
                this.f18580b.lambda$toggleRecordingPause$31();
                return;
            case 4:
                this.f18580b.lambda$toggleRecordingPause$32();
                return;
            case 5:
                this.f18580b.lambda$new$2();
                return;
            case 6:
                this.f18580b.lambda$new$3();
                return;
            case 7:
                this.f18580b.lambda$new$4();
                return;
            case 8:
                this.f18580b.lambda$setCurrentVideoVisible$14();
                return;
            case 9:
                this.f18580b.lambda$toggleRecordingPause$33();
                return;
            default:
                this.f18580b.lambda$startRaiseToEarSensors$8();
                return;
        }
    }
}
