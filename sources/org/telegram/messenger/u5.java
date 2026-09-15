package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17433a;
    public final LocationSharingService f17434b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17433a = i10;
        this.f17434b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17433a) {
            case 0:
                LocationSharingService.a(this.f17434b);
                return;
            default:
                LocationSharingService.b(this.f17434b);
                return;
        }
    }
}
