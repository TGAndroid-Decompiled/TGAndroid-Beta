package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class o5 implements Runnable {
    public final int f17166a;
    public final LocationController f17167b;
    public final LocationController.SharingLocationInfo f17168c;

    public o5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f17166a = i10;
        this.f17167b = locationController;
        this.f17168c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f17166a) {
            case 0:
                LocationController.j(this.f17167b, this.f17168c);
                return;
            case 1:
                LocationController.g(this.f17167b, this.f17168c);
                return;
            default:
                LocationController.x(this.f17167b, this.f17168c);
                return;
        }
    }
}
