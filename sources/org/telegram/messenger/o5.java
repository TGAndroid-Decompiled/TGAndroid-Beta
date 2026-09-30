package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f17173a;
    public final LocationController f17174b;
    public final LocationController.SharingLocationInfo f17175c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f17173a = i10;
        this.f17174b = locationController;
        this.f17175c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f17173a) {
            case 0:
                LocationController.j(this.f17174b, this.f17175c);
                return;
            case 1:
                LocationController.g(this.f17174b, this.f17175c);
                return;
            default:
                LocationController.x(this.f17174b, this.f17175c);
                return;
        }
    }
}
