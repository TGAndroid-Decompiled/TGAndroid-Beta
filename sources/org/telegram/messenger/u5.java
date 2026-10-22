package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class u5 implements Runnable {
    public final int f19656a;
    public final LocationController f19657b;
    public final LocationController.SharingLocationInfo f19658c;

    public u5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19656a = i10;
        this.f19657b = locationController;
        this.f19658c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19656a) {
            case 0:
                LocationController.j(this.f19657b, this.f19658c);
                return;
            case 1:
                LocationController.g(this.f19657b, this.f19658c);
                return;
            default:
                LocationController.x(this.f19657b, this.f19658c);
                return;
        }
    }
}
