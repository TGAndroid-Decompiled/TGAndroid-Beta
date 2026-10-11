package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f19053a;
    public final LocationController f19054b;

    public r5(LocationController locationController, int i10) {
        this.f19053a = i10;
        this.f19054b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19053a) {
            case 0:
                this.f19054b.lambda$onConnected$3();
                return;
            case 1:
                this.f19054b.lambda$setProximityLocation$13();
                return;
            case 2:
                this.f19054b.lambda$new$0();
                return;
            case 3:
                this.f19054b.lambda$removeAllLocationSharings$23();
                return;
            case 4:
                this.f19054b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                this.f19054b.lambda$cleanup$9();
                return;
            default:
                this.f19054b.lambda$loadSharingLocations$17();
                return;
        }
    }
}
