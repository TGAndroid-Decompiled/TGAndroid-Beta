package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class s5 implements Runnable {
    public final int f18355a;
    public final LocationController f18356b;
    public final LocationController.SharingLocationInfo f18357c;

    public s5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18355a = i10;
        this.f18356b = locationController;
        this.f18357c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18355a) {
            case 0:
                LocationController.j(this.f18356b, this.f18357c);
                return;
            case 1:
                LocationController.g(this.f18356b, this.f18357c);
                return;
            default:
                LocationController.x(this.f18356b, this.f18357c);
                return;
        }
    }
}
