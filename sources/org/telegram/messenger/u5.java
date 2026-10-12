package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19067a;
    public final LocationController f19068b;

    public u5(LocationController locationController, int i10) {
        this.f19067a = i10;
        this.f19068b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19067a) {
            case 0:
                this.f19068b.lambda$onConnected$3();
                return;
            case 1:
                this.f19068b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19068b.lambda$new$0();
                return;
            case 3:
                this.f19068b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19068b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19068b.lambda$cleanup$9();
                return;
            default:
                this.f19068b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
