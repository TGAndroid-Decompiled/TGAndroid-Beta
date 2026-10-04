package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f18746a;
    public final LocationController f18747b;
    public final LocationController.SharingLocationInfo f18748c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18746a = i10;
        this.f18747b = locationController;
        this.f18748c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18746a) {
            case 0:
                LocationController.j(this.f18747b, this.f18748c);
                return;
            case 1:
                LocationController.g(this.f18747b, this.f18748c);
                return;
            default:
                LocationController.x(this.f18747b, this.f18748c);
                return;
        }
    }
}
