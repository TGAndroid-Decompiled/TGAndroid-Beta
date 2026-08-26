package org.telegram.messenger;

public final class LocationSharingService$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final LocationSharingService f$0;

    public LocationSharingService$$ExternalSyntheticLambda1(LocationSharingService locationSharingService, int i) {
        this.$r8$classId = i;
        this.f$0 = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onCreate$1();
                break;
            default:
                this.f$0.lambda$didReceivedNotification$2();
                break;
        }
    }
}
