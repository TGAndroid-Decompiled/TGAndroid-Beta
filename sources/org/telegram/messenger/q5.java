package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f18947a;
    public final LocationController f18948b;
    public final Integer f18949c;

    public q5(LocationController locationController, Integer num, int i10) {
        this.f18947a = i10;
        this.f18948b = locationController;
        this.f18949c = num;
    }

    @Override
    public final void run() {
        switch (this.f18947a) {
            case 0:
                LocationController.r(this.f18948b, this.f18949c);
                return;
            default:
                LocationController.e(this.f18948b, this.f18949c);
                return;
        }
    }
}
