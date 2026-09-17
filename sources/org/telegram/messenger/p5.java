package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18705a;
    public final LocationController f18706b;

    public p5(LocationController locationController, int i10) {
        this.f18705a = i10;
        this.f18706b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f18705a) {
            case 0:
                LocationController.p(this.f18706b);
                return;
            case 1:
                LocationController.m(this.f18706b);
                return;
            case 2:
                LocationController.A(this.f18706b);
                return;
            case 3:
                LocationController.q(this.f18706b);
                return;
            case 4:
                LocationController.D(this.f18706b);
                return;
            case 5:
                LocationController.v(this.f18706b);
                return;
            default:
                LocationController.n(this.f18706b);
                return;
        }
    }
}
