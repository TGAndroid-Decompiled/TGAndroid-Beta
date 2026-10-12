package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f18460a;
    public final LocationController f18461b;
    public final Integer f18462c;

    public t5(LocationController locationController, Integer num, int i10) {
        this.f18460a = i10;
        this.f18461b = locationController;
        this.f18462c = num;
    }

    @Override
    public final void run() {
        switch (this.f18460a) {
            case 0:
                LocationController.r(this.f18461b, this.f18462c);
                return;
            default:
                LocationController.e(this.f18461b, this.f18462c);
                return;
        }
    }
}
