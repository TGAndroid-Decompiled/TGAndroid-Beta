package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f18785a;
    public final LocationController f18786b;

    public q5(LocationController locationController, int i10) {
        this.f18785a = i10;
        this.f18786b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f18785a) {
            case 0:
                this.f18786b.lambda$onConnected$3();
                return;
            case 1:
                this.f18786b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f18786b.lambda$new$0();
                return;
            case 3:
                this.f18786b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f18786b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f18786b.lambda$cleanup$9();
                return;
            default:
                this.f18786b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
