package org.telegram.messenger;
public final class a6 implements Runnable {
    public final int f17839a;
    public final LocationSharingService f17840b;

    public a6(LocationSharingService locationSharingService, int i10) {
        this.f17839a = i10;
        this.f17840b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17839a) {
            case 0:
                LocationSharingService.a(this.f17840b);
                return;
            default:
                LocationSharingService.b(this.f17840b);
                return;
        }
    }
}
