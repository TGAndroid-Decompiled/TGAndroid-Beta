package org.telegram.messenger;
public final class pd implements Runnable {
    public final int f17592a;
    public final LocationSharingService f17593b;

    public pd(LocationSharingService locationSharingService, int i10) {
        this.f17592a = i10;
        this.f17593b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17592a) {
            case 0:
                LocationSharingService locationSharingService = this.f17593b;
                locationSharingService.f14431b.postDelayed(locationSharingService.f14432c, 1000L);
                Utilities.d.c(new ag.f3(22));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f17593b;
                if (LocationSharingService.a().isEmpty()) {
                    locationSharingService2.stopSelf();
                    return;
                } else {
                    locationSharingService2.c(true);
                    return;
                }
        }
    }
}
