package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f21406a;
    public final LocationController f21407b;

    public r5(LocationController locationController, int i10) {
        this.f21406a = i10;
        this.f21407b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f21406a) {
            case 0:
                LocationController.p(this.f21407b);
                return;
            case 1:
                LocationController.m(this.f21407b);
                return;
            case 2:
                LocationController.A(this.f21407b);
                return;
            case 3:
                LocationController.q(this.f21407b);
                return;
            case 4:
                LocationController.D(this.f21407b);
                return;
            case 5:
                LocationController.v(this.f21407b);
                return;
            default:
                LocationController.n(this.f21407b);
                return;
        }
    }
}
