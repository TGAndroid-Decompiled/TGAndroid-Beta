package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f19073a;
    public final LocationSharingService f19074b;

    public t5(LocationSharingService locationSharingService, int i10) {
        this.f19073a = i10;
        this.f19074b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19073a) {
            case 0:
                LocationSharingService.a(this.f19074b);
                return;
            default:
                LocationSharingService.b(this.f19074b);
                return;
        }
    }
}
