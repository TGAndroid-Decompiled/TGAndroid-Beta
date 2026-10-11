package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f19430a;
    public final LocationSharingService f19431b;

    public v5(LocationSharingService locationSharingService, int i10) {
        this.f19430a = i10;
        this.f19431b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19430a) {
            case 0:
                LocationSharingService.a(this.f19431b);
                return;
            default:
                LocationSharingService.b(this.f19431b);
                return;
        }
    }
}
