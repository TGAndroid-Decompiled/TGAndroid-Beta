package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f18561a;
    public final LocationController f18562b;
    public final LocationController.SharingLocationInfo f18563c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18561a = i10;
        this.f18562b = locationController;
        this.f18563c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18561a) {
            case 0:
                LocationController.j(this.f18562b, this.f18563c);
                return;
            case 1:
                LocationController.g(this.f18562b, this.f18563c);
                return;
            default:
                LocationController.x(this.f18562b, this.f18563c);
                return;
        }
    }
}
