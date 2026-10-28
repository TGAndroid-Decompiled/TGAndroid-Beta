package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f21883a;
    public final LocationController f21884b;

    public y5(LocationController locationController, int i10) {
        this.f21883a = i10;
        this.f21884b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f21883a) {
            case 0:
                this.f21884b.lambda$onConnected$3();
                return;
            case 1:
                this.f21884b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f21884b.lambda$new$0();
                return;
            case 3:
                this.f21884b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f21884b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f21884b.lambda$cleanup$9();
                return;
            default:
                this.f21884b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
