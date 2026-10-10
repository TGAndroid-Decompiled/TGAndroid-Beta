package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class p5 implements Runnable {
    public final int f18803a;
    public final LocationController f18804b;
    public final LocationController.SharingLocationInfo f18805c;

    public p5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18803a = i10;
        this.f18804b = locationController;
        this.f18805c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18803a) {
            case 0:
                LocationController.j(this.f18804b, this.f18805c);
                return;
            case 1:
                LocationController.g(this.f18804b, this.f18805c);
                return;
            default:
                LocationController.x(this.f18804b, this.f18805c);
                return;
        }
    }
}
