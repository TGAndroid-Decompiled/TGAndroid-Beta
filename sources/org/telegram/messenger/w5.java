package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f19967a;
    public final LocationController f19968b;

    public w5(LocationController locationController, int i10) {
        this.f19967a = i10;
        this.f19968b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19967a) {
            case 0:
                this.f19968b.lambda$onConnected$3();
                return;
            case 1:
                this.f19968b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19968b.lambda$new$0();
                return;
            case 3:
                this.f19968b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19968b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19968b.lambda$cleanup$9();
                return;
            default:
                this.f19968b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
