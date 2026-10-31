package org.telegram.messenger;
public final class od implements Runnable {
    public final int f17259a;
    public final LocationSharingService f17260b;

    public od(LocationSharingService locationSharingService, int i10) {
        this.f17259a = i10;
        this.f17260b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17259a) {
            case 0:
                LocationSharingService locationSharingService = this.f17260b;
                locationSharingService.f14430b.postDelayed(locationSharingService.f14431c, 1000L);
                Utilities.d.c(new ag.f3(22));
                return;
            default:
                LocationSharingService locationSharingService2 = this.f17260b;
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
