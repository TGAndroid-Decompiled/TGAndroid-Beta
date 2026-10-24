package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f20030a;
    public final LocationController f20031b;

    public w5(LocationController locationController, int i10) {
        this.f20030a = i10;
        this.f20031b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f20030a) {
            case 0:
                this.f20031b.lambda$onConnected$3();
                return;
            case 1:
                this.f20031b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f20031b.lambda$new$0();
                return;
            case 3:
                this.f20031b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f20031b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f20031b.lambda$cleanup$9();
                return;
            default:
                this.f20031b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
