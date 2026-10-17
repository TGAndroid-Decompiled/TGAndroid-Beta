package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f20046a;
    public final LocationSharingService f20047b;

    public x5(LocationSharingService locationSharingService, int i10) {
        this.f20046a = i10;
        this.f20047b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f20046a) {
            case 0:
                LocationSharingService.a(this.f20047b);
                return;
            default:
                LocationSharingService.b(this.f20047b);
                return;
        }
    }
}
