package org.telegram.messenger;

public final class r5 implements Runnable {

    public final int f21408a;

    public final LocationController f21409b;

    public r5(LocationController locationController, int i10) {
        this.f21408a = i10;
        this.f21409b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f21408a) {
            case 0:
                this.f21409b.lambda$onConnected$3();
                break;
            case 1:
                this.f21409b.lambda$setProximityLocation$13();
                break;
            case 2:
                this.f21409b.lambda$new$0();
                break;
            case 3:
                this.f21409b.lambda$removeAllLocationSharings$23();
                break;
            case 4:
                this.f21409b.lambda$removeAllLocationSharings$24();
                break;
            case 5:
                this.f21409b.lambda$cleanup$9();
                break;
            default:
                this.f21409b.lambda$loadSharingLocations$17();
                break;
        }
    }
}
