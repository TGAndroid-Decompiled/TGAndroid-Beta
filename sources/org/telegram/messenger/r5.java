package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f19835a;
    public final LocationController f19836b;
    public final Integer f19837c;

    public r5(LocationController locationController, Integer num, int i10) {
        this.f19835a = i10;
        this.f19836b = locationController;
        this.f19837c = num;
    }

    @Override
    public final void run() {
        switch (this.f19835a) {
            case 0:
                LocationController.r(this.f19836b, this.f19837c);
                return;
            default:
                LocationController.e(this.f19836b, this.f19837c);
                return;
        }
    }
}
