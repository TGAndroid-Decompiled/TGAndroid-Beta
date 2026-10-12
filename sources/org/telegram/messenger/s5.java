package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class s5 implements Runnable {
    public final int f18839a;
    public final LocationController f18840b;
    public final LocationController.SharingLocationInfo f18841c;

    public s5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f18839a = i10;
        this.f18840b = locationController;
        this.f18841c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f18839a) {
            case 0:
                LocationController.j(this.f18840b, this.f18841c);
                return;
            case 1:
                LocationController.g(this.f18840b, this.f18841c);
                return;
            default:
                LocationController.x(this.f18840b, this.f18841c);
                return;
        }
    }
}
