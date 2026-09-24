package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17244a;
    public final LocationController f17245b;
    public final Integer f17246c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17244a = i10;
        this.f17245b = locationController;
        this.f17246c = num;
    }

    @Override
    public final void run() {
        switch (this.f17244a) {
            case 0:
                LocationController.r(this.f17245b, this.f17246c);
                return;
            default:
                LocationController.e(this.f17245b, this.f17246c);
                return;
        }
    }
}
