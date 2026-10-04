package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18849a;
    public final LocationController f18850b;
    public final Integer f18851c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f18849a = i10;
        this.f18850b = locationController;
        this.f18851c = num;
    }

    @Override
    public final void run() {
        switch (this.f18849a) {
            case 0:
                this.f18850b.lambda$onConnected$2(this.f18851c);
                return;
            default:
                this.f18850b.lambda$onConnected$1(this.f18851c);
                return;
        }
    }
}
