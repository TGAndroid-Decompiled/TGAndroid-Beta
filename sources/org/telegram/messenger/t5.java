package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f18162a;
    public final LocationController f18163b;
    public final Integer f18164c;

    public t5(LocationController locationController, Integer num, int i10) {
        this.f18162a = i10;
        this.f18163b = locationController;
        this.f18164c = num;
    }

    @Override
    public final void run() {
        switch (this.f18162a) {
            case 0:
                LocationController.r(this.f18163b, this.f18164c);
                return;
            default:
                LocationController.e(this.f18163b, this.f18164c);
                return;
        }
    }
}
