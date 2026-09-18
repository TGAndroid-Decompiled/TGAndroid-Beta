package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16823a;
    public final MediaController f16824b;
    public final boolean f16825c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16823a = i10;
        this.f16824b = mediaController;
        this.f16825c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16823a) {
            case 0:
                MediaController.R(this.f16824b, this.f16825c);
                return;
            default:
                MediaController.a0(this.f16824b, this.f16825c);
                return;
        }
    }
}
