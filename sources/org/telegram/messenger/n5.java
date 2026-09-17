package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class n5 implements Runnable {
    public final int f18484a;
    public final LocationController f18485b;
    public final LocationController.SharingLocationInfo f18486c;

    public n5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18484a = i10;
        this.f18485b = locationController;
        this.f18486c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18484a) {
            case 0:
                LocationController.j(this.f18485b, this.f18486c);
                return;
            case 1:
                LocationController.g(this.f18485b, this.f18486c);
                return;
            default:
                LocationController.x(this.f18485b, this.f18486c);
                return;
        }
    }
}
