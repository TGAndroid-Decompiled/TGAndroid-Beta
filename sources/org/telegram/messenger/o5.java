package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f17131a;
    public final LocationController f17132b;
    public final LocationController.SharingLocationInfo f17133c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f17131a = i10;
        this.f17132b = locationController;
        this.f17133c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f17131a) {
            case 0:
                LocationController.j(this.f17132b, this.f17133c);
                return;
            case 1:
                LocationController.g(this.f17132b, this.f17133c);
                return;
            default:
                LocationController.x(this.f17132b, this.f17133c);
                return;
        }
    }
}
