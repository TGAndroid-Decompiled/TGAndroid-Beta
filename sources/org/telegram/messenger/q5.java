package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f17359a;
    public final LocationController f17360b;

    public q5(LocationController locationController, int i10) {
        this.f17359a = i10;
        this.f17360b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f17359a) {
            case 0:
                this.f17360b.lambda$onConnected$3();
                return;
            case 1:
                this.f17360b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f17360b.lambda$new$0();
                return;
            case 3:
                this.f17360b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f17360b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f17360b.lambda$cleanup$9();
                return;
            default:
                this.f17360b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
