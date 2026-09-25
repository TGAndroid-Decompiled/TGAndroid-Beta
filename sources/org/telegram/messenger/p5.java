package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17259a;
    public final LocationController f17260b;
    public final Integer f17261c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17259a = i10;
        this.f17260b = locationController;
        this.f17261c = num;
    }

    @Override
    public final void run() {
        switch (this.f17259a) {
            case 0:
                this.f17260b.lambda$onConnected$2(this.f17261c);
                return;
            default:
                this.f17260b.lambda$onConnected$1(this.f17261c);
                return;
        }
    }
}
