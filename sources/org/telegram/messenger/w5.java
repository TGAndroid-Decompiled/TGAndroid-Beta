package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f20515a;
    public final LocationSharingService f20516b;

    public w5(LocationSharingService locationSharingService, int i10) {
        this.f20515a = i10;
        this.f20516b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f20515a) {
            case 0:
                LocationSharingService.a(this.f20516b);
                return;
            default:
                LocationSharingService.b(this.f20516b);
                return;
        }
    }
}
