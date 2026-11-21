package org.telegram.messenger;
public final class rd implements Runnable {
    public final int f26598a;
    public final LocationSharingService f26599b;

    public rd(LocationSharingService locationSharingService, int i7) {
        this.f26598a = i7;
        this.f26599b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f26598a) {
            case 0:
                LocationSharingService locationSharingService = this.f26599b;
                locationSharingService.f22712b.postDelayed(locationSharingService.f22713c, 1000L);
                Utilities.d.c(new j2(9));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f26599b;
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
