package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f14687a;
    public final LocationSharingService f14688b;

    public a6(LocationSharingService locationSharingService, int i10) {
        this.f14687a = i10;
        this.f14688b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f14687a) {
            case 0:
                LocationSharingService.a(this.f14688b);
                return;
            default:
                LocationSharingService.b(this.f14688b);
                return;
        }
    }
}
