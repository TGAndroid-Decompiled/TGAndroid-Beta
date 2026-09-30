package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17679a;
    public final LocationSharingService f17680b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17679a = i10;
        this.f17680b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17679a) {
            case 0:
                LocationSharingService.a(this.f17680b);
                return;
            default:
                LocationSharingService.b(this.f17680b);
                return;
        }
    }
}
