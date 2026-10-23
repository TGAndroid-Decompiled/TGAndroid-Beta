package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class t5 implements Runnable {
    public final int f19580a;
    public final LocationController f19581b;
    public final LocationController.SharingLocationInfo f19582c;

    public t5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19580a = i10;
        this.f19581b = locationController;
        this.f19582c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19580a) {
            case 0:
                LocationController.j(this.f19581b, this.f19582c);
                return;
            case 1:
                LocationController.g(this.f19581b, this.f19582c);
                return;
            default:
                LocationController.x(this.f19581b, this.f19582c);
                return;
        }
    }
}
