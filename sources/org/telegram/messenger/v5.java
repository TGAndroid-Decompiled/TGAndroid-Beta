package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f19736a;
    public final LocationController f19737b;
    public final Integer f19738c;

    public v5(LocationController locationController, Integer num, int i10) {
        this.f19736a = i10;
        this.f19737b = locationController;
        this.f19738c = num;
    }

    @Override
    public final void run() {
        switch (this.f19736a) {
            case 0:
                this.f19737b.lambda$onConnected$2(this.f19738c);
                return;
            default:
                this.f19737b.lambda$onConnected$1(this.f19738c);
                return;
        }
    }
}
