package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f18848a;
    public final LocationController f18849b;
    public final Integer f18850c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f18848a = i10;
        this.f18849b = locationController;
        this.f18850c = num;
    }

    @Override
    public final void run() {
        switch (this.f18848a) {
            case 0:
                this.f18849b.lambda$onConnected$2(this.f18850c);
                return;
            default:
                this.f18849b.lambda$onConnected$1(this.f18850c);
                return;
        }
    }
}
