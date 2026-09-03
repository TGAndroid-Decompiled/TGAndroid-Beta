package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class q5 implements Runnable {
    public final int f18167a;
    public final LocationController f18168b;
    public final LocationController.SharingLocationInfo f18169c;

    public q5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18167a = i10;
        this.f18168b = locationController;
        this.f18169c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18167a) {
            case 0:
                LocationController.j(this.f18168b, this.f18169c);
                return;
            case 1:
                LocationController.g(this.f18168b, this.f18169c);
                return;
            default:
                LocationController.x(this.f18168b, this.f18169c);
                return;
        }
    }
}
