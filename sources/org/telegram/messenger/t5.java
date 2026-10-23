package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class t5 implements Runnable {
    public final int f19645a;
    public final LocationController f19646b;
    public final LocationController.SharingLocationInfo f19647c;

    public t5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19645a = i10;
        this.f19646b = locationController;
        this.f19647c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19645a) {
            case 0:
                LocationController.j(this.f19646b, this.f19647c);
                return;
            case 1:
                LocationController.g(this.f19646b, this.f19647c);
                return;
            default:
                LocationController.x(this.f19646b, this.f19647c);
                return;
        }
    }
}
