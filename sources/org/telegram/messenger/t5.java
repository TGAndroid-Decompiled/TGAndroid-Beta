package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f19545a;
    public final LocationController f19546b;

    public t5(LocationController locationController, int i10) {
        this.f19545a = i10;
        this.f19546b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19545a) {
            case 0:
                this.f19546b.lambda$onConnected$3();
                return;
            case 1:
                this.f19546b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19546b.lambda$new$0();
                return;
            case 3:
                this.f19546b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19546b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19546b.lambda$cleanup$9();
                return;
            default:
                this.f19546b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
