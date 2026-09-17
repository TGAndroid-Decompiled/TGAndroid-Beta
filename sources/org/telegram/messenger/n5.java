package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class n5 implements Runnable {
    public final int f18457a;
    public final LocationController f18458b;
    public final LocationController.SharingLocationInfo f18459c;

    public n5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18457a = i10;
        this.f18458b = locationController;
        this.f18459c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18457a) {
            case 0:
                LocationController.j(this.f18458b, this.f18459c);
                return;
            case 1:
                LocationController.g(this.f18458b, this.f18459c);
                return;
            default:
                LocationController.x(this.f18458b, this.f18459c);
                return;
        }
    }
}
