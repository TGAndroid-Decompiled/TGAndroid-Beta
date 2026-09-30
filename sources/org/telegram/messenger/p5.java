package org.telegram.messenger;
public final class p5 implements Runnable {
    public final int f17280a;
    public final LocationController f17281b;
    public final Integer f17282c;

    public p5(LocationController locationController, Integer num, int i10) {
        this.f17280a = i10;
        this.f17281b = locationController;
        this.f17282c = num;
    }

    @Override
    public final void run() {
        switch (this.f17280a) {
            case 0:
                this.f17281b.lambda$onConnected$2(this.f17282c);
                return;
            default:
                this.f17281b.lambda$onConnected$1(this.f17282c);
                return;
        }
    }
}
