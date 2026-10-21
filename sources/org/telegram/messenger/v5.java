package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f19714a;
    public final LocationController f19715b;

    public v5(LocationController locationController, int i10) {
        this.f19714a = i10;
        this.f19715b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19714a) {
            case 0:
                this.f19715b.lambda$onConnected$3();
                return;
            case 1:
                this.f19715b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19715b.lambda$new$0();
                return;
            case 3:
                this.f19715b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19715b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19715b.lambda$cleanup$9();
                return;
            default:
                this.f19715b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
