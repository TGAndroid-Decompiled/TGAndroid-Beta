package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17663a;
    public final LocationSharingService f17664b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17663a = i10;
        this.f17664b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17663a) {
            case 0:
                LocationSharingService.a(this.f17664b);
                return;
            default:
                LocationSharingService.b(this.f17664b);
                return;
        }
    }
}
