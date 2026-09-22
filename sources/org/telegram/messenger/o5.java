package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f17146a;
    public final LocationController f17147b;
    public final LocationController.SharingLocationInfo f17148c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f17146a = i10;
        this.f17147b = locationController;
        this.f17148c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f17146a) {
            case 0:
                LocationController.j(this.f17147b, this.f17148c);
                return;
            case 1:
                LocationController.g(this.f17147b, this.f17148c);
                return;
            default:
                LocationController.x(this.f17147b, this.f17148c);
                return;
        }
    }
}
