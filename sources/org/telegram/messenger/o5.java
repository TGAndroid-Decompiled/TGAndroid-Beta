package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f17172a;
    public final LocationController f17173b;
    public final LocationController.SharingLocationInfo f17174c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f17172a = i10;
        this.f17173b = locationController;
        this.f17174c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f17172a) {
            case 0:
                LocationController.j(this.f17173b, this.f17174c);
                return;
            case 1:
                LocationController.g(this.f17173b, this.f17174c);
                return;
            default:
                LocationController.x(this.f17173b, this.f17174c);
                return;
        }
    }
}
