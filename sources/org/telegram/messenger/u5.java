package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19292a;
    public final LocationSharingService f19293b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f19292a = i10;
        this.f19293b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19292a) {
            case 0:
                LocationSharingService.a(this.f19293b);
                return;
            default:
                LocationSharingService.b(this.f19293b);
                return;
        }
    }
}
