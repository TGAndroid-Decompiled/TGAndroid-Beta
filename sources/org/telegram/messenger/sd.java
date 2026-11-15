package org.telegram.messenger;
public final class sd implements Runnable {
    public final int f26441a;
    public final LocationSharingService f26442b;

    public sd(LocationSharingService locationSharingService, int i7) {
        this.f26441a = i7;
        this.f26442b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f26441a) {
            case 0:
                LocationSharingService locationSharingService = this.f26442b;
                locationSharingService.f22321b.postDelayed(locationSharingService.f22322c, 1000L);
                Utilities.d.c(new c6(7));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f26442b;
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
