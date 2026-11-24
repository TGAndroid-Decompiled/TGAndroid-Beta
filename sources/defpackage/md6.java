package defpackage;

import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.Utilities;
public final class md6 implements Runnable {
    public final byte a;
    public final LocationSharingService b;

    public md6(LocationSharingService locationSharingService, byte b) {
        this.a = b;
        this.b = locationSharingService;
    }

    @Override
    public final void run() {
        byte b = this.a;
        LocationSharingService locationSharingService = this.b;
        switch (b) {
            case 0:
                int i = LocationSharingService.d;
                locationSharingService.b.postDelayed(locationSharingService.c, 1000L);
                Utilities.d.c(new bn3((byte) 25));
                return;
            default:
                if (LocationSharingService.a().isEmpty()) {
                    locationSharingService.stopSelf();
                    return;
                } else {
                    locationSharingService.c(true);
                    return;
                }
        }
    }
}
