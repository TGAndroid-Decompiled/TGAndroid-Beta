package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class q5 implements Runnable {
    public final int f19752a;
    public final LocationController f19753b;
    public final LocationController.SharingLocationInfo f19754c;

    public q5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19752a = i10;
        this.f19753b = locationController;
        this.f19754c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19752a) {
            case 0:
                LocationController.j(this.f19753b, this.f19754c);
                return;
            case 1:
                LocationController.g(this.f19753b, this.f19754c);
                return;
            default:
                LocationController.x(this.f19753b, this.f19754c);
                return;
        }
    }
}
