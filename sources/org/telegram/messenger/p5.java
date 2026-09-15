package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17017a;
    public final LocationController f17018b;
    public final Integer f17019c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17017a = i10;
        this.f17018b = locationController;
        this.f17019c = num;
    }

    @Override
    public final void run() {
        switch (this.f17017a) {
            case 0:
                LocationController.r(this.f17018b, this.f17019c);
                return;
            default:
                LocationController.e(this.f17018b, this.f17019c);
                return;
        }
    }
}
