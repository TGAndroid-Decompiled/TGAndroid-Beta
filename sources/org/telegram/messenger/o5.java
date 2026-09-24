package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f17151a;
    public final LocationController f17152b;
    public final LocationController.SharingLocationInfo f17153c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f17151a = i10;
        this.f17152b = locationController;
        this.f17153c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f17151a) {
            case 0:
                LocationController.j(this.f17152b, this.f17153c);
                return;
            case 1:
                LocationController.g(this.f17152b, this.f17153c);
                return;
            default:
                LocationController.x(this.f17152b, this.f17153c);
                return;
        }
    }
}
