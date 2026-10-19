package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f20124a;
    public final LocationSharingService f20125b;

    public y5(LocationSharingService locationSharingService, int i10) {
        this.f20124a = i10;
        this.f20125b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f20124a) {
            case 0:
                LocationSharingService.a(this.f20125b);
                return;
            default:
                LocationSharingService.b(this.f20125b);
                return;
        }
    }
}
