package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f18877a;
    public final LocationSharingService f18878b;

    public w5(LocationSharingService locationSharingService, int i10) {
        this.f18877a = i10;
        this.f18878b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f18877a) {
            case 0:
                LocationSharingService.a(this.f18878b);
                return;
            default:
                LocationSharingService.b(this.f18878b);
                return;
        }
    }
}
