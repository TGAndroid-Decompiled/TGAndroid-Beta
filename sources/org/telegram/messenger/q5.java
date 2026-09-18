package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f17120a;
    public final LocationController f17121b;

    public q5(LocationController locationController, int i10) {
        this.f17120a = i10;
        this.f17121b = locationController;
    }

    @Override
    public final void run() {
        switch (this.f17120a) {
            case 0:
                LocationController.p(this.f17121b);
                return;
            case 1:
                LocationController.m(this.f17121b);
                return;
            case 2:
                this.f17121b.lambda$new$0();
                return;
            case 3:
                LocationController.q(this.f17121b);
                return;
            case 4:
                this.f17121b.lambda$removeAllLocationSharings$24();
                return;
            case 5:
                LocationController.v(this.f17121b);
                return;
            default:
                LocationController.n(this.f17121b);
                return;
        }
    }
}
