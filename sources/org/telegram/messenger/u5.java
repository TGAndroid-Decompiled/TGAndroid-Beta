package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class u5 implements Runnable {
    public final int f16460a;
    public final LocationController f16461b;
    public final LocationController.SharingLocationInfo f16462c;

    public u5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f16460a = i10;
        this.f16461b = locationController;
        this.f16462c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f16460a) {
            case 0:
                LocationController.j(this.f16461b, this.f16462c);
                return;
            case 1:
                LocationController.g(this.f16461b, this.f16462c);
                return;
            default:
                LocationController.x(this.f16461b, this.f16462c);
                return;
        }
    }
}
