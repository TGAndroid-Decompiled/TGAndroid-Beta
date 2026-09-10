package org.telegram.messenger;
public final class v5 implements Runnable {
    public final int f16563a;
    public final LocationController f16564b;
    public final Integer f16565c;

    public v5(LocationController locationController, Integer num, int i10) {
        this.f16563a = i10;
        this.f16564b = locationController;
        this.f16565c = num;
    }

    @Override
    public final void run() {
        switch (this.f16563a) {
            case 0:
                this.f16564b.lambda$onConnected$2(this.f16565c);
                return;
            default:
                this.f16564b.lambda$onConnected$1(this.f16565c);
                return;
        }
    }
}
