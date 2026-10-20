package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f19717a;
    public final LocationController f19718b;

    public v5(LocationController locationController, int i10) {
        this.f19717a = i10;
        this.f19718b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19717a) {
            case 0:
                this.f19718b.lambda$onConnected$3();
                return;
            case 1:
                this.f19718b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19718b.lambda$new$0();
                return;
            case 3:
                this.f19718b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19718b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19718b.lambda$cleanup$9();
                return;
            default:
                this.f19718b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
