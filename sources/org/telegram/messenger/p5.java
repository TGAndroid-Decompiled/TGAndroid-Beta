package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17256a;
    public final LocationController f17257b;
    public final Integer f17258c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17256a = i10;
        this.f17257b = locationController;
        this.f17258c = num;
    }

    @Override
    public final void run() {
        switch (this.f17256a) {
            case 0:
                this.f17257b.lambda$onConnected$2(this.f17258c);
                return;
            default:
                this.f17257b.lambda$onConnected$1(this.f17258c);
                return;
        }
    }
}
