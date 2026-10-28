package org.telegram.messenger;

import org.telegram.messenger.LocationController;
public final class w5 implements Runnable {
    public final int f21719a;
    public final LocationController f21720b;
    public final LocationController.SharingLocationInfo f21721c;

    public w5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f21719a = i10;
        this.f21720b = locationController;
        this.f21721c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f21719a) {
            case 0:
                this.f21720b.lambda$broadcastLastKnownLocation$6(this.f21721c);
                return;
            case 1:
                this.f21720b.lambda$removeSharingLocation$20(this.f21721c);
                return;
            default:
                this.f21720b.lambda$update$8(this.f21721c);
                return;
        }
    }
}
