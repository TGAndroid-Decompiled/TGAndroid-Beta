package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f18271a;
    public final LocationController f18272b;
    public final Integer f18273c;

    public r5(LocationController locationController, Integer num, int i10) {
        this.f18271a = i10;
        this.f18272b = locationController;
        this.f18273c = num;
    }

    @Override
    public final void run() {
        switch (this.f18271a) {
            case 0:
                LocationController.r(this.f18272b, this.f18273c);
                return;
            default:
                LocationController.e(this.f18272b, this.f18273c);
                return;
        }
    }
}
