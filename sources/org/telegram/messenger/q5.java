package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f18956a;
    public final LocationController f18957b;

    public q5(LocationController locationController, int i10) {
        this.f18956a = i10;
        this.f18957b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f18956a) {
            case 0:
                LocationController.p(this.f18957b);
                return;
            case 1:
                LocationController.m(this.f18957b);
                return;
            case 2:
                this.f18957b.lambda$new$0();
                return;
            case 3:
                LocationController.q(this.f18957b);
                return;
            case 4:
                this.f18957b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                LocationController.v(this.f18957b);
                return;
            default:
                LocationController.n(this.f18957b);
                return;
        }
    }
}
