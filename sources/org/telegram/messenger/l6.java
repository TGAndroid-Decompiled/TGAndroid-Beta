package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16894a;
    public final MediaController f16895b;
    public final boolean f16896c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16894a = i10;
        this.f16895b = mediaController;
        this.f16896c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16894a) {
            case 0:
                MediaController.R(this.f16895b, this.f16896c);
                return;
            default:
                MediaController.a0(this.f16895b, this.f16896c);
                return;
        }
    }
}
