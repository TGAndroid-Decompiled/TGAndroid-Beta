package org.telegram.messenger;
public final class s5 implements Runnable {
    public final int f19946a;
    public final LocationController f19947b;

    public s5(LocationController locationController, int i10) {
        this.f19946a = i10;
        this.f19947b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f19946a) {
            case 0:
                LocationController.p(this.f19947b);
                return;
            case 1:
                LocationController.m(this.f19947b);
                return;
            case 2:
                LocationController.A(this.f19947b);
                return;
            case 3:
                LocationController.q(this.f19947b);
                return;
            case 4:
                LocationController.D(this.f19947b);
                return;
            case 5:
                LocationController.v(this.f19947b);
                return;
            default:
                LocationController.n(this.f19947b);
                return;
        }
    }
}
