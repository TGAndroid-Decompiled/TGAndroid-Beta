package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19627a;
    public final LocationController f19628b;

    public u5(LocationController locationController, int i10) {
        this.f19627a = i10;
        this.f19628b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19627a) {
            case 0:
                this.f19628b.lambda$onConnected$3();
                return;
            case 1:
                this.f19628b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19628b.lambda$new$0();
                return;
            case 3:
                this.f19628b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19628b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19628b.lambda$cleanup$9();
                return;
            default:
                this.f19628b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
