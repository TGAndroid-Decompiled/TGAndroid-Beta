package org.telegram.messenger;

public final class w5 implements Runnable {

    public final int f22017a;

    public final MediaController f22018b;

    public w5(MediaController mediaController, int i10) {
        this.f22017a = i10;
        this.f22018b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f22017a) {
            case 0:
                this.f22018b.lambda$startRaiseToEarSensors$8();
                break;
            case 1:
                this.f22018b.lambda$playMessage$20();
                break;
            case 2:
                this.f22018b.lambda$toggleRecordingPause$29();
                break;
            case 3:
                this.f22018b.lambda$toggleRecordingPause$30();
                break;
            case 4:
                this.f22018b.lambda$stopRaiseToEarSensors$9();
                break;
            case 5:
                this.f22018b.lambda$new$2();
                break;
            case 6:
                this.f22018b.lambda$new$3();
                break;
            case 7:
                this.f22018b.lambda$new$4();
                break;
            case 8:
                this.f22018b.lambda$setTextureView$15();
                break;
            case 9:
                this.f22018b.lambda$toggleRecordingPause$31();
                break;
            default:
                this.f22018b.lambda$setCurrentVideoVisible$14();
                break;
        }
    }
}
