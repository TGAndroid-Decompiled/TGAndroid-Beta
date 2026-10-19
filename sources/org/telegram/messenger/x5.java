package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f20045a;
    public final LocationSharingService f20046b;

    public x5(LocationSharingService locationSharingService, int i10) {
        this.f20045a = i10;
        this.f20046b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f20045a) {
            case 0:
                LocationSharingService.a(this.f20046b);
                return;
            default:
                LocationSharingService.b(this.f20046b);
                return;
        }
    }
}
