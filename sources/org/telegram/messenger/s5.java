package org.telegram.messenger;
public final class s5 implements Runnable {
    public final int f19470a;
    public final LocationController f19471b;
    public final Integer f19472c;

    public s5(LocationController locationController, Integer num, int i10) {
        this.f19470a = i10;
        this.f19471b = locationController;
        this.f19472c = num;
    }

    @Override
    public final void run() {
        switch (this.f19470a) {
            case 0:
                this.f19471b.lambda$onConnected$2(this.f19472c);
                return;
            default:
                this.f19471b.lambda$onConnected$1(this.f19472c);
                return;
        }
    }
}
