package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f19392a;
    public final LocationSharingService f19393b;

    public v5(LocationSharingService locationSharingService, int i10) {
        this.f19392a = i10;
        this.f19393b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f19392a) {
            case 0:
                LocationSharingService.a(this.f19393b);
                return;
            default:
                LocationSharingService.b(this.f19393b);
                return;
        }
    }
}
