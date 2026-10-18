package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f20051a;
    public final LocationSharingService f20052b;

    public x5(LocationSharingService locationSharingService, int i10) {
        this.f20051a = i10;
        this.f20052b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f20051a) {
            case 0:
                LocationSharingService.a(this.f20052b);
                return;
            default:
                LocationSharingService.b(this.f20052b);
                return;
        }
    }
}
