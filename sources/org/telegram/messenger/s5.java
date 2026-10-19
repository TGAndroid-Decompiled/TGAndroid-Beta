package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class s5 implements Runnable {
    public final int f19479a;
    public final LocationController f19480b;
    public final LocationController.SharingLocationInfo f19481c;

    public s5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19479a = i10;
        this.f19480b = locationController;
        this.f19481c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19479a) {
            case 0:
                LocationController.j(this.f19480b, this.f19481c);
                return;
            case 1:
                LocationController.g(this.f19480b, this.f19481c);
                return;
            default:
                LocationController.x(this.f19480b, this.f19481c);
                return;
        }
    }
}
