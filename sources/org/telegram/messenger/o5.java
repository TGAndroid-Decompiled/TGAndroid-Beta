package org.telegram.messenger;
public final class o5 implements Runnable {
    public final int f21113a;
    public final LocationController f21114b;
    public final Integer f21115c;

    public o5(LocationController locationController, Integer num, int i9) {
        this.f21113a = i9;
        this.f21114b = locationController;
        this.f21115c = num;
    }

    @Override
    public final void run() {
        switch (this.f21113a) {
            case 0:
                this.f21114b.lambda$onConnected$2(this.f21115c);
                return;
            default:
                this.f21114b.lambda$onConnected$1(this.f21115c);
                return;
        }
    }
}
