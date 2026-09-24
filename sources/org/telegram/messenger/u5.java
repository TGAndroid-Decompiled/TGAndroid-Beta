package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17648a;
    public final LocationSharingService f17649b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17648a = i10;
        this.f17649b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17648a) {
            case 0:
                LocationSharingService.a(this.f17649b);
                return;
            default:
                LocationSharingService.b(this.f17649b);
                return;
        }
    }
}
