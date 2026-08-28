package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class n5 implements Runnable {
    public final int f21020a;
    public final LocationController f21021b;
    public final LocationController.SharingLocationInfo f21022c;

    public n5(int i9, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f21020a = i9;
        this.f21021b = locationController;
        this.f21022c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f21020a) {
            case 0:
                LocationController.j(this.f21021b, this.f21022c);
                return;
            case 1:
                LocationController.g(this.f21021b, this.f21022c);
                return;
            default:
                LocationController.x(this.f21021b, this.f21022c);
                return;
        }
    }
}
