package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class p5 implements Runnable {
    public final int f21229a;
    public final LocationController f21230b;
    public final LocationController.SharingLocationInfo f21231c;

    public p5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f21229a = i10;
        this.f21230b = locationController;
        this.f21231c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f21229a) {
            case 0:
                LocationController.j(this.f21230b, this.f21231c);
                return;
            case 1:
                LocationController.g(this.f21230b, this.f21231c);
                return;
            default:
                LocationController.x(this.f21230b, this.f21231c);
                return;
        }
    }
}
