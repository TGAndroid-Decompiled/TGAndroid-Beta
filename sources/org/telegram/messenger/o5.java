package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f18598a;
    public final LocationController f18599b;
    public final Integer f18600c;

    public o5(LocationController locationController, Integer num, int i10) {
        this.f18598a = i10;
        this.f18599b = locationController;
        this.f18600c = num;
    }

    @Override
    public final void run() {
        switch (this.f18598a) {
            case 0:
                LocationController.r(this.f18599b, this.f18600c);
                return;
            default:
                LocationController.e(this.f18599b, this.f18600c);
                return;
        }
    }
}
