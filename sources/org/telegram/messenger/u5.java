package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class u5 implements Runnable {
    public final int f19721a;
    public final LocationController f19722b;
    public final LocationController.SharingLocationInfo f19723c;

    public u5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19721a = i10;
        this.f19722b = locationController;
        this.f19723c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19721a) {
            case 0:
                LocationController.j(this.f19722b, this.f19723c);
                return;
            case 1:
                LocationController.g(this.f19722b, this.f19723c);
                return;
            default:
                LocationController.x(this.f19722b, this.f19723c);
                return;
        }
    }
}
