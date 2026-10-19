package org.telegram.messenger;
public final class s5 implements Runnable {
    public final int f19468a;
    public final LocationController f19469b;
    public final Integer f19470c;

    public s5(LocationController locationController, Integer num, int i10) {
        this.f19468a = i10;
        this.f19469b = locationController;
        this.f19470c = num;
    }

    @Override
    public final void run() {
        switch (this.f19468a) {
            case 0:
                this.f19469b.lambda$onConnected$2(this.f19470c);
                return;
            default:
                this.f19469b.lambda$onConnected$1(this.f19470c);
                return;
        }
    }
}
