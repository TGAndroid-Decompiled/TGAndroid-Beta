package org.telegram.messenger;
public final class c6 implements Runnable {
    public final int f19758a;
    public final LocationSharingService f19759b;

    public c6(LocationSharingService locationSharingService, int i10) {
        this.f19758a = i10;
        this.f19759b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19758a) {
            case 0:
                LocationSharingService.a(this.f19759b);
                return;
            default:
                LocationSharingService.b(this.f19759b);
                return;
        }
    }
}
