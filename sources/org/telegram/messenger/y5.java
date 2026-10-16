package org.telegram.messenger;
public final class y5 implements Runnable {
    public final int f18764a;
    public final LocationSharingService f18765b;

    public y5(LocationSharingService locationSharingService, int i10) {
        this.f18764a = i10;
        this.f18765b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f18764a) {
            case 0:
                LocationSharingService.a(this.f18765b);
                return;
            default:
                LocationSharingService.b(this.f18765b);
                return;
        }
    }
}
