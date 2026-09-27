package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f17160a;
    public final LocationController f17161b;
    public final LocationController.SharingLocationInfo f17162c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f17160a = i10;
        this.f17161b = locationController;
        this.f17162c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f17160a) {
            case 0:
                LocationController.j(this.f17161b, this.f17162c);
                return;
            case 1:
                LocationController.g(this.f17161b, this.f17162c);
                return;
            default:
                LocationController.x(this.f17161b, this.f17162c);
                return;
        }
    }
}
