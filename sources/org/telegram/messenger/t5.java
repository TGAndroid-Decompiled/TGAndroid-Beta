package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f18954a;
    public final LocationController f18955b;
    public final Integer f18956c;

    public t5(LocationController locationController, Integer num, int i10) {
        this.f18954a = i10;
        this.f18955b = locationController;
        this.f18956c = num;
    }

    @Override
    public final void run() {
        switch (this.f18954a) {
            case 0:
                this.f18955b.lambda$onConnected$2(this.f18956c);
                return;
            default:
                this.f18955b.lambda$onConnected$1(this.f18956c);
                return;
        }
    }
}
