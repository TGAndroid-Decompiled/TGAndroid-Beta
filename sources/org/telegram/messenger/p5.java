package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17189a;
    public final LocationController f17190b;
    public final Integer f17191c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17189a = i10;
        this.f17190b = locationController;
        this.f17191c = num;
    }

    @Override
    public final void run() {
        switch (this.f17189a) {
            case 0:
                this.f17190b.lambda$onConnected$2(this.f17191c);
                return;
            default:
                this.f17190b.lambda$onConnected$1(this.f17191c);
                return;
        }
    }
}
