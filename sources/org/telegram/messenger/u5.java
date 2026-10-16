package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f18256a;
    public final LocationController f18257b;

    public u5(LocationController locationController, int i10) {
        this.f18256a = i10;
        this.f18257b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f18256a) {
            case 0:
                this.f18257b.lambda$onConnected$3();
                return;
            case 1:
                this.f18257b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f18257b.lambda$new$0();
                return;
            case 3:
                this.f18257b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f18257b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f18257b.lambda$cleanup$9();
                return;
            default:
                this.f18257b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
