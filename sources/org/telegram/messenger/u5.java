package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19303a;
    public final LocationSharingService f19304b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f19303a = i10;
        this.f19304b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19303a) {
            case 0:
                LocationSharingService.a(this.f19304b);
                return;
            default:
                LocationSharingService.b(this.f19304b);
                return;
        }
    }
}
