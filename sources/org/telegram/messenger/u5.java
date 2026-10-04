package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19291a;
    public final LocationSharingService f19292b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f19291a = i10;
        this.f19292b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19291a) {
            case 0:
                LocationSharingService.a(this.f19292b);
                return;
            default:
                LocationSharingService.b(this.f19292b);
                return;
        }
    }
}
