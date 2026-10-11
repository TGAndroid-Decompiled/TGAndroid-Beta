package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class p5 implements Runnable {
    public final int f18840a;
    public final LocationController f18841b;
    public final LocationController.SharingLocationInfo f18842c;

    public p5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18840a = i10;
        this.f18841b = locationController;
        this.f18842c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18840a) {
            case 0:
                LocationController.j(this.f18841b, this.f18842c);
                return;
            case 1:
                LocationController.g(this.f18841b, this.f18842c);
                return;
            default:
                LocationController.x(this.f18841b, this.f18842c);
                return;
        }
    }
}
