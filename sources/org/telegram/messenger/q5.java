package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f18902a;
    public final LocationController f18903b;
    public final Integer f18904c;

    public q5(LocationController locationController, Integer num, int i10) {
        this.f18902a = i10;
        this.f18903b = locationController;
        this.f18904c = num;
    }

    @Override
    public final void run() {
        switch (this.f18902a) {
            case 0:
                LocationController.r(this.f18903b, this.f18904c);
                return;
            default:
                LocationController.e(this.f18903b, this.f18904c);
                return;
        }
    }
}
