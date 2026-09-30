package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16895a;
    public final MediaController f16896b;
    public final boolean f16897c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16895a = i10;
        this.f16896b = mediaController;
        this.f16897c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16895a) {
            case 0:
                MediaController.R(this.f16896b, this.f16897c);
                return;
            default:
                MediaController.a0(this.f16896b, this.f16897c);
                return;
        }
    }
}
