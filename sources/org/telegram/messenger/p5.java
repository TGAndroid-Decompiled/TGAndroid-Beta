package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class p5 implements Runnable {
    public final int f18799a;
    public final LocationController f18800b;
    public final LocationController.SharingLocationInfo f18801c;

    public p5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18799a = i10;
        this.f18800b = locationController;
        this.f18801c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18799a) {
            case 0:
                LocationController.j(this.f18800b, this.f18801c);
                return;
            case 1:
                LocationController.g(this.f18800b, this.f18801c);
                return;
            default:
                LocationController.x(this.f18800b, this.f18801c);
                return;
        }
    }
}
