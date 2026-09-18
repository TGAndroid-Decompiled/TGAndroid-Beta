package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17616a;
    public final LocationSharingService f17617b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17616a = i10;
        this.f17617b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17616a) {
            case 0:
                LocationSharingService.a(this.f17617b);
                return;
            default:
                LocationSharingService.b(this.f17617b);
                return;
        }
    }
}
