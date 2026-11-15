package org.telegram.messenger;
public final class sd implements Runnable {
    public final int f26431a;
    public final LocationSharingService f26432b;

    public sd(LocationSharingService locationSharingService, int i7) {
        this.f26431a = i7;
        this.f26432b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f26431a) {
            case 0:
                LocationSharingService locationSharingService = this.f26432b;
                locationSharingService.f22321b.postDelayed(locationSharingService.f22322c, 1000L);
                Utilities.d.c(new c6(7));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f26432b;
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
