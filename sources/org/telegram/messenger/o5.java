package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f16915a;
    public final LocationController f16916b;
    public final LocationController.SharingLocationInfo f16917c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f16915a = i10;
        this.f16916b = locationController;
        this.f16917c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f16915a) {
            case 0:
                LocationController.j(this.f16916b, this.f16917c);
                return;
            case 1:
                LocationController.g(this.f16916b, this.f16917c);
                return;
            default:
                LocationController.x(this.f16916b, this.f16917c);
                return;
        }
    }
}
