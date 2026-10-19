package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19630a;
    public final LocationController f19631b;

    public u5(LocationController locationController, int i10) {
        this.f19630a = i10;
        this.f19631b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19630a) {
            case 0:
                this.f19631b.lambda$onConnected$3();
                return;
            case 1:
                this.f19631b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19631b.lambda$new$0();
                return;
            case 3:
                this.f19631b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19631b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19631b.lambda$cleanup$9();
                return;
            default:
                this.f19631b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
