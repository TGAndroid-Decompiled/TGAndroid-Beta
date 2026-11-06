package org.telegram.messenger;
public final class td implements Runnable {
    public final int f25600a;
    public final LocationSharingService f25601b;

    public td(LocationSharingService locationSharingService, int i7) {
        this.f25600a = i7;
        this.f25601b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f25600a) {
            case 0:
                LocationSharingService locationSharingService = this.f25601b;
                locationSharingService.f21239b.postDelayed(locationSharingService.f21240c, 1000L);
                Utilities.d.c(new pd(1));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f25601b;
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
