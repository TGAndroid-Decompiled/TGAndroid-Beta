package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17264a;
    public final LocationController f17265b;
    public final Integer f17266c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17264a = i10;
        this.f17265b = locationController;
        this.f17266c = num;
    }

    @Override
    public final void run() {
        switch (this.f17264a) {
            case 0:
                LocationController.r(this.f17265b, this.f17266c);
                return;
            default:
                LocationController.e(this.f17265b, this.f17266c);
                return;
        }
    }
}
