package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f21309a;
    public final LocationController f21310b;
    public final Integer f21311c;

    public q5(LocationController locationController, Integer num, int i10) {
        this.f21309a = i10;
        this.f21310b = locationController;
        this.f21311c = num;
    }

    @Override
    public final void run() {
        switch (this.f21309a) {
            case 0:
                LocationController.r(this.f21310b, this.f21311c);
                return;
            default:
                LocationController.e(this.f21310b, this.f21311c);
                return;
        }
    }
}
