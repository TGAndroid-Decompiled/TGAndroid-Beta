package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17245a;
    public final LocationController f17246b;
    public final Integer f17247c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17245a = i10;
        this.f17246b = locationController;
        this.f17247c = num;
    }

    @Override
    public final void run() {
        switch (this.f17245a) {
            case 0:
                LocationController.r(this.f17246b, this.f17247c);
                return;
            default:
                LocationController.e(this.f17246b, this.f17247c);
                return;
        }
    }
}
