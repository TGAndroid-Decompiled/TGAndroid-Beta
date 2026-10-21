package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19640a;
    public final LocationController f19641b;
    public final Integer f19642c;

    public u5(LocationController locationController, Integer num, int i10) {
        this.f19640a = i10;
        this.f19641b = locationController;
        this.f19642c = num;
    }

    @Override
    public final void run() {
        switch (this.f19640a) {
            case 0:
                this.f19641b.lambda$onConnected$2(this.f19642c);
                return;
            default:
                this.f19641b.lambda$onConnected$1(this.f19642c);
                return;
        }
    }
}
