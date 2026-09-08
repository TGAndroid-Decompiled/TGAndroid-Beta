package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19145a;
    public final LocationSharingService f19146b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f19145a = i10;
        this.f19146b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19145a) {
            case 0:
                LocationSharingService.a(this.f19146b);
                return;
            default:
                LocationSharingService.b(this.f19146b);
                return;
        }
    }
}
