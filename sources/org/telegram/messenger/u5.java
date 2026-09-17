package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f17442a;
    public final LocationSharingService f17443b;

    public u5(LocationSharingService locationSharingService, int i10) {
        this.f17442a = i10;
        this.f17443b = locationSharingService;
    }

    @Override
    public final void run() {
        switch (this.f17442a) {
            case 0:
                LocationSharingService.a(this.f17443b);
                return;
            default:
                LocationSharingService.b(this.f17443b);
                return;
        }
    }
}
