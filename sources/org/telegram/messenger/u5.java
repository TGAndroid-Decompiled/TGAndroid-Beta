package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17668a;
    public final LocationSharingService f17669b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17668a = i10;
        this.f17669b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17668a) {
            case 0:
                LocationSharingService.a(this.f17669b);
                return;
            default:
                LocationSharingService.b(this.f17669b);
                return;
        }
    }
}
