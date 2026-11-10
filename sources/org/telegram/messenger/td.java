package org.telegram.messenger;
public final class td implements Runnable {
    public final int f25613a;
    public final LocationSharingService f25614b;

    public td(LocationSharingService locationSharingService, int i7) {
        this.f25613a = i7;
        this.f25614b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f25613a) {
            case 0:
                LocationSharingService locationSharingService = this.f25614b;
                locationSharingService.f21247b.postDelayed(locationSharingService.f21248c, 1000L);
                Utilities.d.c(new rc(3));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f25614b;
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
