package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f19063a;
    public final LocationSharingService f19064b;

    public y5(LocationSharingService locationSharingService, int i10) {
        this.f19063a = i10;
        this.f19064b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19063a) {
            case 0:
                LocationSharingService.a(this.f19064b);
                return;
            default:
                LocationSharingService.b(this.f19064b);
                return;
        }
    }
}
