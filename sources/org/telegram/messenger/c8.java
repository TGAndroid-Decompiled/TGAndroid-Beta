package org.telegram.messenger;
public final class c8 implements Runnable {
    public final int f16050a;
    public final MediaDataController f16051b;
    public final boolean f16052c;

    public c8(MediaDataController mediaDataController, boolean z10, int i10) {
        this.f16050a = i10;
        this.f16051b = mediaDataController;
        this.f16052c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16050a) {
            case 0:
                MediaDataController.S2(this.f16051b, this.f16052c);
                return;
            default:
                MediaDataController.N1(this.f16051b, this.f16052c);
                return;
        }
    }
}
