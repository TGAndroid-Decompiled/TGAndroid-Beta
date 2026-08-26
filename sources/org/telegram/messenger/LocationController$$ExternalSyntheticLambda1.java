package org.telegram.messenger;

public final class LocationController$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final LocationController f$0;

    public LocationController$$ExternalSyntheticLambda1(LocationController locationController, int i) {
        this.$r8$classId = i;
        this.f$0 = locationController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setProximityLocation$13();
                break;
            case 1:
                this.f$0.lambda$onConnected$3();
                break;
            case 2:
                this.f$0.lambda$new$0();
                break;
            case 3:
                this.f$0.lambda$removeAllLocationSharings$23();
                break;
            case 4:
                this.f$0.lambda$removeAllLocationSharings$24();
                break;
            case 5:
                this.f$0.lambda$cleanup$9();
                break;
            default:
                this.f$0.lambda$loadSharingLocations$17();
                break;
        }
    }
}
