package org.telegram.messenger;
public final class rd implements Runnable {
    public final int f26671a;
    public final LocationSharingService f26672b;

    public rd(LocationSharingService locationSharingService, int i7) {
        this.f26671a = i7;
        this.f26672b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f26671a) {
            case 0:
                LocationSharingService locationSharingService = this.f26672b;
                locationSharingService.f22782b.postDelayed(locationSharingService.f22783c, 1000L);
                Utilities.d.c(new j2(9));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f26672b;
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
