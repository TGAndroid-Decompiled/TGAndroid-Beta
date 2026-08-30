package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class q5 implements Runnable {
    public final int f18193a;
    public final LocationController f18194b;
    public final LocationController.SharingLocationInfo f18195c;

    public q5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18193a = i10;
        this.f18194b = locationController;
        this.f18195c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18193a) {
            case 0:
                LocationController.j(this.f18194b, this.f18195c);
                return;
            case 1:
                LocationController.g(this.f18194b, this.f18195c);
                return;
            default:
                LocationController.x(this.f18194b, this.f18195c);
                return;
        }
    }
}
