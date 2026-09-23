package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17006a;
    public final LocationController f17007b;
    public final Integer f17008c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17006a = i10;
        this.f17007b = locationController;
        this.f17008c = num;
    }

    @Override
    public final void run() {
        switch (this.f17006a) {
            case 0:
                LocationController.r(this.f17007b, this.f17008c);
                return;
            default:
                LocationController.e(this.f17007b, this.f17008c);
                return;
        }
    }
}
