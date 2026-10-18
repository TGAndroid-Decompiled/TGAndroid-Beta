package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f19553a;
    public final LocationController f19554b;
    public final Integer f19555c;

    public t5(LocationController locationController, Integer num, int i10) {
        this.f19553a = i10;
        this.f19554b = locationController;
        this.f19555c = num;
    }

    @Override
    public final void run() {
        switch (this.f19553a) {
            case 0:
                LocationController.r(this.f19554b, this.f19555c);
                return;
            default:
                LocationController.e(this.f19554b, this.f19555c);
                return;
        }
    }
}
