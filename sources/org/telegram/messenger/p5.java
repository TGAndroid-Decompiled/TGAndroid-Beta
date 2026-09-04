package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18655a;
    public final LocationController f18656b;
    public final Integer f18657c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f18655a = i10;
        this.f18656b = locationController;
        this.f18657c = num;
    }

    @Override
    public final void run() {
        switch (this.f18655a) {
            case 0:
                LocationController.r(this.f18656b, this.f18657c);
                return;
            default:
                LocationController.e(this.f18656b, this.f18657c);
                return;
        }
    }
}
