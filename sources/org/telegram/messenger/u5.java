package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19728a;
    public final LocationController f19729b;
    public final Integer f19730c;

    public u5(LocationController locationController, Integer num, int i10) {
        this.f19728a = i10;
        this.f19729b = locationController;
        this.f19730c = num;
    }

    @Override
    public final void run() {
        switch (this.f19728a) {
            case 0:
                this.f19729b.lambda$onConnected$2(this.f19730c);
                return;
            default:
                this.f19729b.lambda$onConnected$1(this.f19730c);
                return;
        }
    }
}
