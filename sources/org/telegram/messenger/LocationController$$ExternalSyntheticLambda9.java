package org.telegram.messenger;

public final class LocationController$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final LocationController f$0;
    public final Integer f$1;

    public LocationController$$ExternalSyntheticLambda9(LocationController locationController, Integer num, int i) {
        this.$r8$classId = i;
        this.f$0 = locationController;
        this.f$1 = num;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onConnected$1(this.f$1);
                break;
            default:
                this.f$0.lambda$onConnected$2(this.f$1);
                break;
        }
    }
}
