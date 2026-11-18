package org.telegram.messenger;
public final class rd implements Runnable {
    public final int f26570a;
    public final LocationSharingService f26571b;

    public rd(LocationSharingService locationSharingService, int i7) {
        this.f26570a = i7;
        this.f26571b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f26570a) {
            case 0:
                LocationSharingService locationSharingService = this.f26571b;
                locationSharingService.f22684b.postDelayed(locationSharingService.f22685c, 1000L);
                Utilities.d.c(new j2(9));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f26571b;
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
