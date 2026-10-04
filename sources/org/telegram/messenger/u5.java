package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19298a;
    public final LocationSharingService f19299b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f19298a = i10;
        this.f19299b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19298a) {
            case 0:
                LocationSharingService.a(this.f19299b);
                return;
            default:
                LocationSharingService.b(this.f19299b);
                return;
        }
    }
}
