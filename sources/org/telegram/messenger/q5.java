package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class q5 implements Runnable {
    public final int f19754a;
    public final LocationController f19755b;
    public final LocationController.SharingLocationInfo f19756c;

    public q5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19754a = i10;
        this.f19755b = locationController;
        this.f19756c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19754a) {
            case 0:
                LocationController.j(this.f19755b, this.f19756c);
                return;
            case 1:
                LocationController.g(this.f19755b, this.f19756c);
                return;
            default:
                LocationController.x(this.f19755b, this.f19756c);
                return;
        }
    }
}
