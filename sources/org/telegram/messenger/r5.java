package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f19010a;
    public final LocationController f19011b;

    public r5(LocationController locationController, int i10) {
        this.f19010a = i10;
        this.f19011b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19010a) {
            case 0:
                this.f19011b.lambda$onConnected$3();
                return;
            case 1:
                this.f19011b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19011b.lambda$new$0();
                return;
            case 3:
                this.f19011b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19011b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19011b.lambda$cleanup$9();
                return;
            default:
                this.f19011b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
