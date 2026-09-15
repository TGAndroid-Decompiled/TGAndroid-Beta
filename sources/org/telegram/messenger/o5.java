package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f16908a;
    public final LocationController f16909b;
    public final LocationController.SharingLocationInfo f16910c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f16908a = i10;
        this.f16909b = locationController;
        this.f16910c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f16908a) {
            case 0:
                LocationController.j(this.f16909b, this.f16910c);
                return;
            case 1:
                LocationController.g(this.f16909b, this.f16910c);
                return;
            default:
                LocationController.x(this.f16909b, this.f16910c);
                return;
        }
    }
}
