package org.telegram.messenger;
public final class sd implements Runnable {
    public final int f26784a;
    public final LocationSharingService f26785b;

    public sd(LocationSharingService locationSharingService, int i7) {
        this.f26784a = i7;
        this.f26785b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f26784a) {
            case 0:
                LocationSharingService locationSharingService = this.f26785b;
                locationSharingService.f22715b.postDelayed(locationSharingService.f22716c, 1000L);
                Utilities.d.c(new j2(9));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f26785b;
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
