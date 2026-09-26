package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17259a;
    public final LocationController f17260b;
    public final Integer f17261c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17259a = i10;
        this.f17260b = locationController;
        this.f17261c = num;
    }

    @Override
    public final void run() {
        switch (this.f17259a) {
            case 0:
                LocationController.r(this.f17260b, this.f17261c);
                return;
            default:
                LocationController.e(this.f17260b, this.f17261c);
                return;
        }
    }
}
