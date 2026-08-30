package org.telegram.messenger;
public final class s5 implements Runnable {
    public final int f18363a;
    public final LocationController f18364b;

    public s5(LocationController locationController, int i10) {
        this.f18363a = i10;
        this.f18364b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f18363a) {
            case 0:
                LocationController.p(this.f18364b);
                return;
            case 1:
                LocationController.m(this.f18364b);
                return;
            case 2:
                LocationController.A(this.f18364b);
                return;
            case 3:
                LocationController.q(this.f18364b);
                return;
            case 4:
                LocationController.D(this.f18364b);
                return;
            case 5:
                LocationController.v(this.f18364b);
                return;
            default:
                LocationController.n(this.f18364b);
                return;
        }
    }
}
