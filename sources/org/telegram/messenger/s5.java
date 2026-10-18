package org.telegram.messenger;
public final class s5 implements Runnable {
    public final int f19471a;
    public final LocationController f19472b;
    public final Integer f19473c;

    public s5(LocationController locationController, Integer num, int i10) {
        this.f19471a = i10;
        this.f19472b = locationController;
        this.f19473c = num;
    }

    @Override
    public final void run() {
        switch (this.f19471a) {
            case 0:
                this.f19472b.lambda$onConnected$2(this.f19473c);
                return;
            default:
                this.f19472b.lambda$onConnected$1(this.f19473c);
                return;
        }
    }
}
