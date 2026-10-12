package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19066a;
    public final LocationController f19067b;

    public u5(LocationController locationController, int i10) {
        this.f19066a = i10;
        this.f19067b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19066a) {
            case 0:
                this.f19067b.lambda$onConnected$3();
                return;
            case 1:
                this.f19067b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19067b.lambda$new$0();
                return;
            case 3:
                this.f19067b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19067b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19067b.lambda$cleanup$9();
                return;
            default:
                this.f19067b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
