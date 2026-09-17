package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f19046a;
    public final LocationSharingService f19047b;

    public t5(LocationSharingService locationSharingService, int i10) {
        this.f19046a = i10;
        this.f19047b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19046a) {
            case 0:
                LocationSharingService.a(this.f19047b);
                return;
            default:
                LocationSharingService.b(this.f19047b);
                return;
        }
    }
}
