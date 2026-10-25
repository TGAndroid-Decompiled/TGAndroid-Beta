package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f19684a;
    public final LocationSharingService f19685b;

    public b6(LocationSharingService locationSharingService, int i10) {
        this.f19684a = i10;
        this.f19685b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19684a) {
            case 0:
                LocationSharingService.a(this.f19685b);
                return;
            default:
                LocationSharingService.b(this.f19685b);
                return;
        }
    }
}
