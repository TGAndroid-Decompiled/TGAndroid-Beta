package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16893a;
    public final MediaController f16894b;
    public final boolean f16895c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16893a = i10;
        this.f16894b = mediaController;
        this.f16895c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16893a) {
            case 0:
                MediaController.R(this.f16894b, this.f16895c);
                return;
            default:
                MediaController.a0(this.f16894b, this.f16895c);
                return;
        }
    }
}
