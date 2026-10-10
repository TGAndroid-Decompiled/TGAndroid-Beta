package org.telegram.messenger;
public final class q5 implements Runnable {
    public final int f18906a;
    public final LocationController f18907b;
    public final Integer f18908c;

    public q5(LocationController locationController, Integer num, int i10) {
        this.f18906a = i10;
        this.f18907b = locationController;
        this.f18908c = num;
    }

    @Override
    public final void run() {
        switch (this.f18906a) {
            case 0:
                LocationController.r(this.f18907b, this.f18908c);
                return;
            default:
                LocationController.e(this.f18907b, this.f18908c);
                return;
        }
    }
}
