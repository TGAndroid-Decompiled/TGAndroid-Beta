package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class p5 implements Runnable {
    public final int f18804a;
    public final LocationController f18805b;
    public final LocationController.SharingLocationInfo f18806c;

    public p5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18804a = i10;
        this.f18805b = locationController;
        this.f18806c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18804a) {
            case 0:
                LocationController.j(this.f18805b, this.f18806c);
                return;
            case 1:
                LocationController.g(this.f18805b, this.f18806c);
                return;
            default:
                LocationController.x(this.f18805b, this.f18806c);
                return;
        }
    }
}
