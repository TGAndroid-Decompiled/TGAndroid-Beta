package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f21792a;
    public final LocationSharingService f21793b;

    public v5(LocationSharingService locationSharingService, int i10) {
        this.f21792a = i10;
        this.f21793b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f21792a) {
            case 0:
                LocationSharingService.a(this.f21793b);
                return;
            default:
                LocationSharingService.b(this.f21793b);
                return;
        }
    }
}
