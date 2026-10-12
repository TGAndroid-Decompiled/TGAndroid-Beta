package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f19635a;
    public final LocationSharingService f19636b;

    public y5(LocationSharingService locationSharingService, int i10) {
        this.f19635a = i10;
        this.f19636b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19635a) {
            case 0:
                LocationSharingService.a(this.f19636b);
                return;
            default:
                LocationSharingService.b(this.f19636b);
                return;
        }
    }
}
