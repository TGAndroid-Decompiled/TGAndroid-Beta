package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f22056a;
    public final MediaController f22057b;

    public w5(MediaController mediaController, int i10) {
        this.f22056a = i10;
        this.f22057b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f22056a) {
            case 0:
                this.f22057b.lambda$startRaiseToEarSensors$8();
                return;
            case 1:
                this.f22057b.lambda$playMessage$20();
                return;
            case 2:
                this.f22057b.lambda$toggleRecordingPause$29();
                return;
            case 3:
                this.f22057b.lambda$toggleRecordingPause$30();
                return;
            case 4:
                this.f22057b.lambda$stopRaiseToEarSensors$9();
                return;
            case 5:
                this.f22057b.lambda$new$2();
                return;
            case 6:
                this.f22057b.lambda$new$3();
                return;
            case 7:
                this.f22057b.lambda$new$4();
                return;
            case 8:
                this.f22057b.lambda$setTextureView$15();
                return;
            case 9:
                this.f22057b.lambda$toggleRecordingPause$31();
                return;
            default:
                this.f22057b.lambda$setCurrentVideoVisible$14();
                return;
        }
    }
}
