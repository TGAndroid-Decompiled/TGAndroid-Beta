package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17416a;
    public final LocationSharingService f17417b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17416a = i10;
        this.f17417b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17416a) {
            case 0:
                LocationSharingService.a(this.f17417b);
                return;
            default:
                LocationSharingService.b(this.f17417b);
                return;
        }
    }
}
