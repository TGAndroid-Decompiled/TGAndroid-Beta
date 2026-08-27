package org.telegram.messenger;

public final class q5 implements Runnable {

    public final int f21320a;

    public final LocationController f21321b;

    public final Integer f21322c;

    public q5(LocationController locationController, Integer num, int i10) {
        this.f21320a = i10;
        this.f21321b = locationController;
        this.f21322c = num;
    }

    @Override
    public final void run() {
        switch (this.f21320a) {
            case 0:
                this.f21321b.lambda$onConnected$2(this.f21322c);
                break;
            default:
                this.f21321b.lambda$onConnected$1(this.f21322c);
                break;
        }
    }
}
