package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f19799a;
    public final LocationController f19800b;
    public final Integer f19801c;

    public v5(LocationController locationController, Integer num, int i10) {
        this.f19799a = i10;
        this.f19800b = locationController;
        this.f19801c = num;
    }

    @Override
    public final void run() {
        switch (this.f19799a) {
            case 0:
                this.f19800b.lambda$onConnected$2(this.f19801c);
                return;
            default:
                this.f19800b.lambda$onConnected$1(this.f19801c);
                return;
        }
    }
}
