package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18682a;
    public final LocationController f18683b;
    public final Integer f18684c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f18682a = i10;
        this.f18683b = locationController;
        this.f18684c = num;
    }

    @Override
    public final void run() {
        switch (this.f18682a) {
            case 0:
                LocationController.r(this.f18683b, this.f18684c);
                return;
            default:
                LocationController.e(this.f18683b, this.f18684c);
                return;
        }
    }
}
