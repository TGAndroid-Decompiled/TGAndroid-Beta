package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class r5 implements Runnable {
    public final int f19396a;
    public final LocationController f19397b;
    public final LocationController.SharingLocationInfo f19398c;

    public r5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19396a = i10;
        this.f19397b = locationController;
        this.f19398c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19396a) {
            case 0:
                LocationController.j(this.f19397b, this.f19398c);
                return;
            case 1:
                LocationController.g(this.f19397b, this.f19398c);
                return;
            default:
                LocationController.x(this.f19397b, this.f19398c);
                return;
        }
    }
}
