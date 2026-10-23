package org.telegram.messenger;
public final class u5 implements Runnable {
    public final int f19663a;
    public final LocationController f19664b;
    public final Integer f19665c;

    public u5(LocationController locationController, Integer num, int i10) {
        this.f19663a = i10;
        this.f19664b = locationController;
        this.f19665c = num;
    }

    @Override
    public final void run() {
        switch (this.f19663a) {
            case 0:
                this.f19664b.lambda$onConnected$2(this.f19665c);
                return;
            default:
                this.f19664b.lambda$onConnected$1(this.f19665c);
                return;
        }
    }
}
