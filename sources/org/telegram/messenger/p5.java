package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18705a;
    public final LocationController f18706b;

    public p5(LocationController locationController, int i10) {
        this.f18705a = i10;
        this.f18706b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f18705a) {
            case 0:
                this.f18706b.lambda$onConnected$3();
                return;
            case 1:
                this.f18706b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f18706b.lambda$new$0();
                return;
            case 3:
                this.f18706b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f18706b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f18706b.lambda$cleanup$9();
                return;
            default:
                this.f18706b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
