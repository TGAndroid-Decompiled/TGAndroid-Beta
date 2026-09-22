package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17009a;
    public final LocationController f17010b;
    public final Integer f17011c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17009a = i10;
        this.f17010b = locationController;
        this.f17011c = num;
    }

    @Override
    public final void run() {
        switch (this.f17009a) {
            case 0:
                LocationController.r(this.f17010b, this.f17011c);
                return;
            default:
                LocationController.e(this.f17010b, this.f17011c);
                return;
        }
    }
}
