package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17662a;
    public final LocationSharingService f17663b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17662a = i10;
        this.f17663b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17662a) {
            case 0:
                LocationSharingService.a(this.f17663b);
                return;
            default:
                LocationSharingService.b(this.f17663b);
                return;
        }
    }
}
