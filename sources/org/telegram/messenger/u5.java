package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19131a;
    public final MediaController f19132b;

    public u5(MediaController mediaController, int i10) {
        this.f19131a = i10;
        this.f19132b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f19131a) {
            case 0:
                this.f19132b.lambda$startRaiseToEarSensors$8();
                return;
            case 1:
                this.f19132b.lambda$playMessage$20();
                return;
            case 2:
                this.f19132b.lambda$setTextureView$15();
                return;
            case 3:
                this.f19132b.lambda$toggleRecordingPause$29();
                return;
            case 4:
                this.f19132b.lambda$toggleRecordingPause$30();
                return;
            case 5:
                this.f19132b.lambda$stopRaiseToEarSensors$9();
                return;
            case 6:
                this.f19132b.lambda$new$2();
                return;
            case 7:
                this.f19132b.lambda$new$3();
                return;
            case 8:
                this.f19132b.lambda$new$4();
                return;
            case 9:
                this.f19132b.lambda$toggleRecordingPause$31();
                return;
            default:
                this.f19132b.lambda$setCurrentVideoVisible$14();
                return;
        }
    }
}
