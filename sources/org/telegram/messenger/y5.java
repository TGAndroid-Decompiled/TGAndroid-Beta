package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f20121a;
    public final LocationSharingService f20122b;

    public y5(LocationSharingService locationSharingService, int i10) {
        this.f20121a = i10;
        this.f20122b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f20121a) {
            case 0:
                LocationSharingService.a(this.f20122b);
                return;
            default:
                LocationSharingService.b(this.f20122b);
                return;
        }
    }
}
