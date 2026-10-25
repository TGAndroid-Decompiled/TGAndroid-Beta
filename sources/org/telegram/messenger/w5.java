package org.telegram.messenger;
public final class w5 implements Runnable {
    public final int f21734a;
    public final LocationController f21735b;
    public final Integer f21736c;

    public w5(LocationController locationController, Integer num, int i10) {
        this.f21734a = i10;
        this.f21735b = locationController;
        this.f21736c = num;
    }

    @Override
    public final void run() {
        switch (this.f21734a) {
            case 0:
                this.f21735b.lambda$onConnected$2(this.f21736c);
                return;
            default:
                this.f21735b.lambda$onConnected$1(this.f21736c);
                return;
        }
    }
}
