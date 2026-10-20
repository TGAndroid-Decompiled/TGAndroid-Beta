package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class t5 implements Runnable {
    public final int f19571a;
    public final LocationController f19572b;
    public final LocationController.SharingLocationInfo f19573c;

    public t5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19571a = i10;
        this.f19572b = locationController;
        this.f19573c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19571a) {
            case 0:
                LocationController.j(this.f19572b, this.f19573c);
                return;
            case 1:
                LocationController.g(this.f19572b, this.f19573c);
                return;
            default:
                LocationController.x(this.f19572b, this.f19573c);
                return;
        }
    }
}
