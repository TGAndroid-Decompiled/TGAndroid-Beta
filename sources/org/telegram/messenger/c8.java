package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f16065a;
    public final MediaDataController f16066b;
    public final boolean f16067c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f16065a = i10;
        this.f16066b = mediaDataController;
        this.f16067c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16065a) {
            case 0:
                MediaDataController.S2(this.f16066b, this.f16067c);
                return;
            default:
                MediaDataController.N1(this.f16066b, this.f16067c);
                return;
        }
    }
}
