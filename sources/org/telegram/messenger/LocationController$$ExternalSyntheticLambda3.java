package org.telegram.messenger;

public final class LocationController$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final LocationController f$0;
    public final LocationController.SharingLocationInfo f$1;

    public LocationController$$ExternalSyntheticLambda3(int i, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.$r8$classId = i;
        this.f$0 = locationController;
        this.f$1 = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$update$8(this.f$1);
                break;
            case 1:
                this.f$0.lambda$broadcastLastKnownLocation$6(this.f$1);
                break;
            default:
                this.f$0.lambda$removeSharingLocation$20(this.f$1);
                break;
        }
    }
}
