package org.telegram.messenger;
public final class sd implements Runnable {
    public final int f26748a;
    public final LocationSharingService f26749b;

    public sd(LocationSharingService locationSharingService, int i7) {
        this.f26748a = i7;
        this.f26749b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f26748a) {
            case 0:
                LocationSharingService locationSharingService = this.f26749b;
                locationSharingService.f22679b.postDelayed(locationSharingService.f22680c, 1000L);
                Utilities.d.c(new j2(9));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f26749b;
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
