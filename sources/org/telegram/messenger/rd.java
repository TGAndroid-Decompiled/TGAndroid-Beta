package org.telegram.messenger;
public final class rd implements Runnable {
    public final int f26572a;
    public final LocationSharingService f26573b;

    public rd(LocationSharingService locationSharingService, int i7) {
        this.f26572a = i7;
        this.f26573b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f26572a) {
            case 0:
                LocationSharingService locationSharingService = this.f26573b;
                locationSharingService.f22687b.postDelayed(locationSharingService.f22688c, 1000L);
                Utilities.d.c(new j2(9));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f26573b;
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
