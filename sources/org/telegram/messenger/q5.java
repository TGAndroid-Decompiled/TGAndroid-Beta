package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f18911a;
    public final LocationController f18912b;
    public final Integer f18913c;

    public q5(LocationController locationController, Integer num, int i10) {
        this.f18911a = i10;
        this.f18912b = locationController;
        this.f18913c = num;
    }

    @Override
    public final void run() {
        switch (this.f18911a) {
            case 0:
                LocationController.r(this.f18912b, this.f18913c);
                return;
            default:
                LocationController.e(this.f18912b, this.f18913c);
                return;
        }
    }
}
