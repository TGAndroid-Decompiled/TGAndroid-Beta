package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f18750a;
    public final LocationController f18751b;
    public final LocationController.SharingLocationInfo f18752c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18750a = i10;
        this.f18751b = locationController;
        this.f18752c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18750a) {
            case 0:
                LocationController.j(this.f18751b, this.f18752c);
                return;
            case 1:
                LocationController.g(this.f18751b, this.f18752c);
                return;
            default:
                LocationController.x(this.f18751b, this.f18752c);
                return;
        }
    }
}
