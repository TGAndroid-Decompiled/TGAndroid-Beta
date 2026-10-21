package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class t5 implements Runnable {
    public final int f19570a;
    public final LocationController f19571b;
    public final LocationController.SharingLocationInfo f19572c;

    public t5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19570a = i10;
        this.f19571b = locationController;
        this.f19572c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19570a) {
            case 0:
                LocationController.j(this.f19571b, this.f19572c);
                return;
            case 1:
                LocationController.g(this.f19571b, this.f19572c);
                return;
            default:
                LocationController.x(this.f19571b, this.f19572c);
                return;
        }
    }
}
