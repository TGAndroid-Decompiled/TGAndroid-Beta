package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17657a;
    public final LocationSharingService f17658b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17657a = i10;
        this.f17658b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17657a) {
            case 0:
                LocationSharingService.a(this.f17658b);
                return;
            default:
                LocationSharingService.b(this.f17658b);
                return;
        }
    }
}
