package org.telegram.messenger;
public final class s5 implements Runnable {
    public final int f19948a;
    public final LocationController f19949b;

    public s5(LocationController locationController, int i10) {
        this.f19948a = i10;
        this.f19949b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19948a) {
            case 0:
                this.f19949b.lambda$onConnected$3();
                return;
            case 1:
                this.f19949b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19949b.lambda$new$0();
                return;
            case 3:
                this.f19949b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19949b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19949b.lambda$cleanup$9();
                return;
            default:
                this.f19949b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
