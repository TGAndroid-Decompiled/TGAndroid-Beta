package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f18860a;
    public final LocationSharingService f18861b;

    public w5(LocationSharingService locationSharingService, int i10) {
        this.f18860a = i10;
        this.f18861b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f18860a) {
            case 0:
                LocationSharingService.a(this.f18861b);
                return;
            default:
                LocationSharingService.b(this.f18861b);
                return;
        }
    }
}
