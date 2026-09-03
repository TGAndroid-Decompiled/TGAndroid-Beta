package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f18935a;
    public final MediaController f18936b;

    public x5(MediaController mediaController, int i10) {
        this.f18935a = i10;
        this.f18936b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f18935a) {
            case 0:
                this.f18936b.lambda$startRaiseToEarSensors$8();
                return;
            case 1:
                this.f18936b.lambda$playMessage$20();
                return;
            case 2:
                this.f18936b.lambda$setTextureView$15();
                return;
            case 3:
                this.f18936b.lambda$toggleRecordingPause$29();
                return;
            case 4:
                this.f18936b.lambda$toggleRecordingPause$30();
                return;
            case 5:
                this.f18936b.lambda$stopRaiseToEarSensors$9();
                return;
            case 6:
                this.f18936b.lambda$new$2();
                return;
            case 7:
                this.f18936b.lambda$new$3();
                return;
            case 8:
                this.f18936b.lambda$new$4();
                return;
            case 9:
                this.f18936b.lambda$toggleRecordingPause$31();
                return;
            default:
                this.f18936b.lambda$setCurrentVideoVisible$14();
                return;
        }
    }
}
