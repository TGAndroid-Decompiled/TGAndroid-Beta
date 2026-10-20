package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19643a;
    public final LocationController f19644b;
    public final Integer f19645c;

    public u5(LocationController locationController, Integer num, int i10) {
        this.f19643a = i10;
        this.f19644b = locationController;
        this.f19645c = num;
    }

    @Override
    public final void run() {
        switch (this.f19643a) {
            case 0:
                this.f19644b.lambda$onConnected$2(this.f19645c);
                return;
            default:
                this.f19644b.lambda$onConnected$1(this.f19645c);
                return;
        }
    }
}
