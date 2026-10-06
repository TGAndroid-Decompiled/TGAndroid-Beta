package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18853a;
    public final LocationController f18854b;
    public final Integer f18855c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f18853a = i10;
        this.f18854b = locationController;
        this.f18855c = num;
    }

    @Override
    public final void run() {
        switch (this.f18853a) {
            case 0:
                this.f18854b.lambda$onConnected$2(this.f18855c);
                return;
            default:
                this.f18854b.lambda$onConnected$1(this.f18855c);
                return;
        }
    }
}
