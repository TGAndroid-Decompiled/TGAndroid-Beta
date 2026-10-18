package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class r5 implements Runnable {
    public final int f19399a;
    public final LocationController f19400b;
    public final LocationController.SharingLocationInfo f19401c;

    public r5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19399a = i10;
        this.f19400b = locationController;
        this.f19401c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19399a) {
            case 0:
                LocationController.j(this.f19400b, this.f19401c);
                return;
            case 1:
                LocationController.g(this.f19400b, this.f19401c);
                return;
            default:
                LocationController.x(this.f19400b, this.f19401c);
                return;
        }
    }
}
