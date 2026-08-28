package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f21534a;
    public final LocationSharingService f21535b;

    public t5(LocationSharingService locationSharingService, int i9) {
        this.f21534a = i9;
        this.f21535b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f21534a) {
            case 0:
                LocationSharingService.a(this.f21535b);
                return;
            default:
                LocationSharingService.b(this.f21535b);
                return;
        }
    }
}
