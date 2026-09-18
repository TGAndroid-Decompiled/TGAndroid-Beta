package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f16917a;
    public final LocationController f16918b;
    public final LocationController.SharingLocationInfo f16919c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f16917a = i10;
        this.f16918b = locationController;
        this.f16919c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f16917a) {
            case 0:
                LocationController.j(this.f16918b, this.f16919c);
                return;
            case 1:
                LocationController.g(this.f16918b, this.f16919c);
                return;
            default:
                LocationController.x(this.f16918b, this.f16919c);
                return;
        }
    }
}
