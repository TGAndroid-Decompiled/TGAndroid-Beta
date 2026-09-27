package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f16059a;
    public final MediaDataController f16060b;
    public final boolean f16061c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f16059a = i10;
        this.f16060b = mediaDataController;
        this.f16061c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16059a) {
            case 0:
                MediaDataController.S2(this.f16060b, this.f16061c);
                return;
            default:
                MediaDataController.N1(this.f16060b, this.f16061c);
                return;
        }
    }
}
