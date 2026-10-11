package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f19017a;
    public final LocationController f19018b;

    public r5(LocationController locationController, int i10) {
        this.f19017a = i10;
        this.f19018b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19017a) {
            case 0:
                this.f19018b.lambda$onConnected$3();
                return;
            case 1:
                this.f19018b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19018b.lambda$new$0();
                return;
            case 3:
                this.f19018b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19018b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19018b.lambda$cleanup$9();
                return;
            default:
                this.f19018b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
