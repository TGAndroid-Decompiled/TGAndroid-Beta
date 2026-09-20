package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17230a;
    public final LocationController f17231b;
    public final Integer f17232c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17230a = i10;
        this.f17231b = locationController;
        this.f17232c = num;
    }

    @Override
    public final void run() {
        switch (this.f17230a) {
            case 0:
                this.f17231b.lambda$onConnected$2(this.f17232c);
                return;
            default:
                this.f17231b.lambda$onConnected$1(this.f17232c);
                return;
        }
    }
}
