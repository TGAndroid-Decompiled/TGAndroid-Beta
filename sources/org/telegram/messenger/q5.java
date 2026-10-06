package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f18956a;
    public final LocationController f18957b;

    public q5(LocationController locationController, int i10) {
        this.f18956a = i10;
        this.f18957b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f18956a) {
            case 0:
                this.f18957b.lambda$onConnected$3();
                return;
            case 1:
                this.f18957b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f18957b.lambda$new$0();
                return;
            case 3:
                this.f18957b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f18957b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f18957b.lambda$cleanup$9();
                return;
            default:
                this.f18957b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
