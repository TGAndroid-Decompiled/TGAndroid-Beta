package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f19394a;
    public final LocationSharingService f19395b;

    public v5(LocationSharingService locationSharingService, int i10) {
        this.f19394a = i10;
        this.f19395b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19394a) {
            case 0:
                LocationSharingService.a(this.f19395b);
                return;
            default:
                LocationSharingService.b(this.f19395b);
                return;
        }
    }
}
