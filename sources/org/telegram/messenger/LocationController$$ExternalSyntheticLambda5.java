package org.telegram.messenger;

import android.location.Location;
import androidx.core.util.Consumer;

public final class LocationController$$ExternalSyntheticLambda5 implements Consumer {
    public final int $r8$classId;
    public final LocationController f$0;

    public LocationController$$ExternalSyntheticLambda5(LocationController locationController, int i) {
        this.$r8$classId = i;
        this.f$0 = locationController;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onConnected$4((Integer) obj);
                break;
            default:
                this.f$0.setLastKnownLocation((Location) obj);
                break;
        }
    }
}
