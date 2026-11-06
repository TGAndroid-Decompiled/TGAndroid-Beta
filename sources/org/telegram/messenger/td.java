package org.telegram.messenger;
public final class td implements Runnable {
    public final int f25608a;
    public final LocationSharingService f25609b;

    public td(LocationSharingService locationSharingService, int i7) {
        this.f25608a = i7;
        this.f25609b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f25608a) {
            case 0:
                LocationSharingService locationSharingService = this.f25609b;
                locationSharingService.f21239b.postDelayed(locationSharingService.f21240c, 1000L);
                Utilities.d.c(new pd(1));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f25609b;
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
