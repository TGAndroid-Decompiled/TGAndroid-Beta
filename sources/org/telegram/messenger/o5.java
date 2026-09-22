package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f16904a;
    public final LocationController f16905b;
    public final LocationController.SharingLocationInfo f16906c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f16904a = i10;
        this.f16905b = locationController;
        this.f16906c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f16904a) {
            case 0:
                LocationController.j(this.f16905b, this.f16906c);
                return;
            case 1:
                LocationController.g(this.f16905b, this.f16906c);
                return;
            default:
                LocationController.x(this.f16905b, this.f16906c);
                return;
        }
    }
}
