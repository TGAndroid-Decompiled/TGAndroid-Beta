package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f18430a;
    public final MediaController f18431b;
    public final boolean f18432c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f18430a = i10;
        this.f18431b = mediaController;
        this.f18432c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18430a) {
            case 0:
                MediaController.R(this.f18431b, this.f18432c);
                return;
            default:
                MediaController.a0(this.f18431b, this.f18432c);
                return;
        }
    }
}
