package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f17189a;
    public final LocationController f17190b;
    public final LocationController.SharingLocationInfo f17191c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f17189a = i10;
        this.f17190b = locationController;
        this.f17191c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f17189a) {
            case 0:
                LocationController.j(this.f17190b, this.f17191c);
                return;
            case 1:
                LocationController.g(this.f17190b, this.f17191c);
                return;
            default:
                LocationController.x(this.f17190b, this.f17191c);
                return;
        }
    }
}
