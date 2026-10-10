package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f19014a;
    public final LocationController f19015b;

    public r5(LocationController locationController, int i10) {
        this.f19014a = i10;
        this.f19015b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19014a) {
            case 0:
                this.f19015b.lambda$onConnected$3();
                return;
            case 1:
                this.f19015b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19015b.lambda$new$0();
                return;
            case 3:
                this.f19015b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19015b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19015b.lambda$cleanup$9();
                return;
            default:
                this.f19015b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
