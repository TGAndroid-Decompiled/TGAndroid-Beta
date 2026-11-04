package org.telegram.messenger;
public final class md implements Runnable {
    public final int f24189a;
    public final LocationSharingService f24190b;

    public md(LocationSharingService locationSharingService, int i3) {
        this.f24189a = i3;
        this.f24190b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f24189a) {
            case 0:
                LocationSharingService locationSharingService = this.f24190b;
                locationSharingService.f21292b.postDelayed(locationSharingService.f21293c, 1000L);
                Utilities.d.c(new hc(5));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f24190b;
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
