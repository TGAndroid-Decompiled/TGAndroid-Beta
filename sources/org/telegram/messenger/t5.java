package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f18955a;
    public final LocationController f18956b;
    public final Integer f18957c;

    public t5(LocationController locationController, Integer num, int i10) {
        this.f18955a = i10;
        this.f18956b = locationController;
        this.f18957c = num;
    }

    @Override
    public final void run() {
        switch (this.f18955a) {
            case 0:
                this.f18956b.lambda$onConnected$2(this.f18957c);
                return;
            default:
                this.f18956b.lambda$onConnected$1(this.f18957c);
                return;
        }
    }
}
