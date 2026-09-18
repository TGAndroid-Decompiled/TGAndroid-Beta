package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17026a;
    public final LocationController f17027b;
    public final Integer f17028c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17026a = i10;
        this.f17027b = locationController;
        this.f17028c = num;
    }

    @Override
    public final void run() {
        switch (this.f17026a) {
            case 0:
                LocationController.r(this.f17027b, this.f17028c);
                return;
            default:
                LocationController.e(this.f17027b, this.f17028c);
                return;
        }
    }
}
