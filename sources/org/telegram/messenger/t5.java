package org.telegram.messenger;
public final class t5 implements Runnable {
    public final int f19556a;
    public final LocationController f19557b;
    public final Integer f19558c;

    public t5(LocationController locationController, Integer num, int i10) {
        this.f19556a = i10;
        this.f19557b = locationController;
        this.f19558c = num;
    }

    @Override
    public final void run() {
        switch (this.f19556a) {
            case 0:
                this.f19557b.lambda$onConnected$2(this.f19558c);
                return;
            default:
                this.f19557b.lambda$onConnected$1(this.f19558c);
                return;
        }
    }
}
