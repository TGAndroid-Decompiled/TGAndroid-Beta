package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f17084a;
    public final LocationController f17085b;
    public final LocationController.SharingLocationInfo f17086c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f17084a = i10;
        this.f17085b = locationController;
        this.f17086c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f17084a) {
            case 0:
                LocationController.j(this.f17085b, this.f17086c);
                return;
            case 1:
                LocationController.g(this.f17085b, this.f17086c);
                return;
            default:
                LocationController.x(this.f17085b, this.f17086c);
                return;
        }
    }
}
