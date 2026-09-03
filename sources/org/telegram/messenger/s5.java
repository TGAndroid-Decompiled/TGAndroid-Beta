package org.telegram.messenger;
public final class s5 implements Runnable {
    public final int f18343a;
    public final LocationController f18344b;

    public s5(LocationController locationController, int i10) {
        this.f18343a = i10;
        this.f18344b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f18343a) {
            case 0:
                LocationController.p(this.f18344b);
                return;
            case 1:
                LocationController.m(this.f18344b);
                return;
            case 2:
                LocationController.A(this.f18344b);
                return;
            case 3:
                LocationController.q(this.f18344b);
                return;
            case 4:
                LocationController.D(this.f18344b);
                return;
            case 5:
                LocationController.v(this.f18344b);
                return;
            default:
                LocationController.n(this.f18344b);
                return;
        }
    }
}
