package org.telegram.messenger;

import java.util.ArrayList;

public final class LocationController$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final LocationController f$0;
    public final ArrayList f$1;

    public LocationController$$ExternalSyntheticLambda8(LocationController locationController, ArrayList arrayList, int i) {
        this.$r8$classId = i;
        this.f$0 = locationController;
        this.f$1 = arrayList;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadSharingLocations$15(this.f$1);
                break;
            default:
                this.f$0.lambda$loadSharingLocations$14(this.f$1);
                break;
        }
    }
}
