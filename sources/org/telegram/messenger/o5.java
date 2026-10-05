package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f18751a;
    public final LocationController f18752b;
    public final LocationController.SharingLocationInfo f18753c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18751a = i10;
        this.f18752b = locationController;
        this.f18753c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18751a) {
            case 0:
                LocationController.j(this.f18752b, this.f18753c);
                return;
            case 1:
                LocationController.g(this.f18752b, this.f18753c);
                return;
            default:
                LocationController.x(this.f18752b, this.f18753c);
                return;
        }
    }
}
