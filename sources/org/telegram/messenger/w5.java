package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f16837a;
    public final LocationController f16838b;

    public w5(LocationController locationController, int i10) {
        this.f16837a = i10;
        this.f16838b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f16837a) {
            case 0:
                this.f16838b.lambda$onConnected$3();
                return;
            case 1:
                this.f16838b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f16838b.lambda$new$0();
                return;
            case 3:
                this.f16838b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f16838b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f16838b.lambda$cleanup$9();
                return;
            default:
                this.f16838b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
