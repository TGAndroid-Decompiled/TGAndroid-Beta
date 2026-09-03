package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f18245a;
    public final LocationController f18246b;
    public final Integer f18247c;

    public r5(LocationController locationController, Integer num, int i10) {
        this.f18245a = i10;
        this.f18246b = locationController;
        this.f18247c = num;
    }

    @Override
    public final void run() {
        switch (this.f18245a) {
            case 0:
                LocationController.r(this.f18246b, this.f18247c);
                return;
            default:
                LocationController.e(this.f18246b, this.f18247c);
                return;
        }
    }
}
