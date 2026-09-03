package org.telegram.messenger;
public final class r5 implements Runnable {
    public final int f19837a;
    public final LocationController f19838b;
    public final Integer f19839c;

    public r5(LocationController locationController, Integer num, int i10) {
        this.f19837a = i10;
        this.f19838b = locationController;
        this.f19839c = num;
    }

    @Override
    public final void run() {
        switch (this.f19837a) {
            case 0:
                LocationController.r(this.f19838b, this.f19839c);
                return;
            default:
                LocationController.e(this.f19838b, this.f19839c);
                return;
        }
    }
}
