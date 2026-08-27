package org.telegram.messenger;

public final class p5 implements Runnable {

    public final int f21223a;

    public final LocationController f21224b;

    public final LocationController.SharingLocationInfo f21225c;

    public p5(int i10, LocationController.SharingLocationInfo sharingLocationInfo, LocationController locationController) {
        this.f21223a = i10;
        this.f21224b = locationController;
        this.f21225c = sharingLocationInfo;
    }

    @Override
    public final void run() {
        switch (this.f21223a) {
            case 0:
                this.f21224b.lambda$broadcastLastKnownLocation$6(this.f21225c);
                break;
            case 1:
                this.f21224b.lambda$removeSharingLocation$20(this.f21225c);
                break;
            default:
                this.f21224b.lambda$update$8(this.f21225c);
                break;
        }
    }
}
