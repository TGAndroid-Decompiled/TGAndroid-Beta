package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class s5 implements Runnable {
    public final int f18061a;
    public final LocationController f18062b;
    public final LocationController.SharingLocationInfo f18063c;

    public s5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18061a = i10;
        this.f18062b = locationController;
        this.f18063c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18061a) {
            case 0:
                LocationController.j(this.f18062b, this.f18063c);
                return;
            case 1:
                LocationController.g(this.f18062b, this.f18063c);
                return;
            default:
                LocationController.x(this.f18062b, this.f18063c);
                return;
        }
    }
}
