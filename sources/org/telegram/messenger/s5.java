package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class s5 implements Runnable {
    public final int f19476a;
    public final LocationController f19477b;
    public final LocationController.SharingLocationInfo f19478c;

    public s5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f19476a = i10;
        this.f19477b = locationController;
        this.f19478c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f19476a) {
            case 0:
                LocationController.j(this.f19477b, this.f19478c);
                return;
            case 1:
                LocationController.g(this.f19477b, this.f19478c);
                return;
            default:
                LocationController.x(this.f19477b, this.f19478c);
                return;
        }
    }
}
