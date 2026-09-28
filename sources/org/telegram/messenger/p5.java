package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17263a;
    public final LocationController f17264b;
    public final Integer f17265c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17263a = i10;
        this.f17264b = locationController;
        this.f17265c = num;
    }

    @Override
    public final void run() {
        switch (this.f17263a) {
            case 0:
                this.f17264b.lambda$onConnected$2(this.f17265c);
                return;
            default:
                this.f17264b.lambda$onConnected$1(this.f17265c);
                return;
        }
    }
}
