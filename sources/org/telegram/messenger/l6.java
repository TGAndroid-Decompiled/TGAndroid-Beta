package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16646a;
    public final MediaController f16647b;
    public final boolean f16648c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16646a = i10;
        this.f16647b = mediaController;
        this.f16648c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16646a) {
            case 0:
                MediaController.R(this.f16647b, this.f16648c);
                return;
            default:
                MediaController.a0(this.f16647b, this.f16648c);
                return;
        }
    }
}
