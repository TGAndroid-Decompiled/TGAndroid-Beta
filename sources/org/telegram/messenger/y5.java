package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f19636a;
    public final LocationSharingService f19637b;

    public y5(LocationSharingService locationSharingService, int i10) {
        this.f19636a = i10;
        this.f19637b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19636a) {
            case 0:
                LocationSharingService.a(this.f19637b);
                return;
            default:
                LocationSharingService.b(this.f19637b);
                return;
        }
    }
}
