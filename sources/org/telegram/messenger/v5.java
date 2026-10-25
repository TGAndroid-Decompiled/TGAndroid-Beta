package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class v5 implements Runnable {
    public final int f21485a;
    public final LocationController f21486b;
    public final LocationController.SharingLocationInfo f21487c;

    public v5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f21485a = i10;
        this.f21486b = locationController;
        this.f21487c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f21485a) {
            case 0:
                LocationController.j(this.f21486b, this.f21487c);
                return;
            case 1:
                LocationController.g(this.f21486b, this.f21487c);
                return;
            default:
                LocationController.x(this.f21486b, this.f21487c);
                return;
        }
    }
}
