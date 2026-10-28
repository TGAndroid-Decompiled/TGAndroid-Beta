package org.telegram.messenger;
public final class x5 implements Runnable {
    public final int f21814a;
    public final LocationController f21815b;
    public final Integer f21816c;

    public x5(LocationController locationController, Integer num, int i10) {
        this.f21814a = i10;
        this.f21815b = locationController;
        this.f21816c = num;
    }

    @Override
    public final void run() {
        switch (this.f21814a) {
            case 0:
                this.f21815b.lambda$onConnected$2(this.f21816c);
                return;
            default:
                this.f21815b.lambda$onConnected$1(this.f21816c);
                return;
        }
    }
}
