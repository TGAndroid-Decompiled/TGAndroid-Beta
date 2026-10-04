package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f18749a;
    public final LocationController f18750b;
    public final LocationController.SharingLocationInfo f18751c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18749a = i10;
        this.f18750b = locationController;
        this.f18751c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18749a) {
            case 0:
                LocationController.j(this.f18750b, this.f18751c);
                return;
            case 1:
                LocationController.g(this.f18750b, this.f18751c);
                return;
            default:
                LocationController.x(this.f18750b, this.f18751c);
                return;
        }
    }
}
