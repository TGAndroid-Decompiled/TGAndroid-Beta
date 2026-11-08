package org.telegram.messenger;
public final class td implements Runnable {
    public final int f25609a;
    public final LocationSharingService f25610b;

    public td(LocationSharingService locationSharingService, int i7) {
        this.f25609a = i7;
        this.f25610b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f25609a) {
            case 0:
                LocationSharingService locationSharingService = this.f25610b;
                locationSharingService.f21242b.postDelayed(locationSharingService.f21243c, 1000L);
                Utilities.d.c(new rc(3));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f25610b;
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
