package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17902a;
    public final LocationSharingService f17903b;

    public a6(LocationSharingService locationSharingService, int i10) {
        this.f17902a = i10;
        this.f17903b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17902a) {
            case 0:
                LocationSharingService.a(this.f17903b);
                return;
            default:
                LocationSharingService.b(this.f17903b);
                return;
        }
    }
}
