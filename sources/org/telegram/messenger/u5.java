package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17653a;
    public final LocationSharingService f17654b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17653a = i10;
        this.f17654b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17653a) {
            case 0:
                LocationSharingService.a(this.f17654b);
                return;
            default:
                LocationSharingService.b(this.f17654b);
                return;
        }
    }
}
