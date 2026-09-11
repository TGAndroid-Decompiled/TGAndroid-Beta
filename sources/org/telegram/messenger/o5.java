package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f18571a;
    public final LocationController f18572b;
    public final Integer f18573c;

    public o5(LocationController locationController, Integer num, int i10) {
        this.f18571a = i10;
        this.f18572b = locationController;
        this.f18573c = num;
    }

    @Override
    public final void run() {
        switch (this.f18571a) {
            case 0:
                LocationController.r(this.f18572b, this.f18573c);
                return;
            default:
                LocationController.e(this.f18572b, this.f18573c);
                return;
        }
    }
}
