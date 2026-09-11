package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18678a;
    public final LocationController f18679b;

    public p5(LocationController locationController, int i10) {
        this.f18678a = i10;
        this.f18679b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f18678a) {
            case 0:
                LocationController.p(this.f18679b);
                return;
            case 1:
                LocationController.m(this.f18679b);
                return;
            case 2:
                LocationController.A(this.f18679b);
                return;
            case 3:
                LocationController.q(this.f18679b);
                return;
            case 4:
                LocationController.D(this.f18679b);
                return;
            case 5:
                LocationController.v(this.f18679b);
                return;
            default:
                LocationController.n(this.f18679b);
                return;
        }
    }
}
