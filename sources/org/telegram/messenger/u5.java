package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19118a;
    public final LocationSharingService f19119b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f19118a = i10;
        this.f19119b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19118a) {
            case 0:
                LocationSharingService.a(this.f19119b);
                return;
            default:
                LocationSharingService.b(this.f19119b);
                return;
        }
    }
}
