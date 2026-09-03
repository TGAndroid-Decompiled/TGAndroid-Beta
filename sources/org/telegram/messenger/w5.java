package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f20517a;
    public final LocationSharingService f20518b;

    public w5(LocationSharingService locationSharingService, int i10) {
        this.f20517a = i10;
        this.f20518b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f20517a) {
            case 0:
                LocationSharingService.a(this.f20518b);
                return;
            default:
                LocationSharingService.b(this.f20518b);
                return;
        }
    }
}
