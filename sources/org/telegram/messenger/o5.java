package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f18534a;
    public final LocationController f18535b;
    public final LocationController.SharingLocationInfo f18536c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18534a = i10;
        this.f18535b = locationController;
        this.f18536c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18534a) {
            case 0:
                LocationController.j(this.f18535b, this.f18536c);
                return;
            case 1:
                LocationController.g(this.f18535b, this.f18536c);
                return;
            default:
                LocationController.x(this.f18535b, this.f18536c);
                return;
        }
    }
}
