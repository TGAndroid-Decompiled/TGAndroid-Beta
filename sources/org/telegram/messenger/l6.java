package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f16887a;
    public final MediaController f16888b;
    public final boolean f16889c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f16887a = i10;
        this.f16888b = mediaController;
        this.f16889c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16887a) {
            case 0:
                MediaController.R(this.f16888b, this.f16889c);
                return;
            default:
                MediaController.a0(this.f16888b, this.f16889c);
                return;
        }
    }
}
