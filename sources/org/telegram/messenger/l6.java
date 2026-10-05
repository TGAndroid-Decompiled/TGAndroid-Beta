package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f18435a;
    public final MediaController f18436b;
    public final boolean f18437c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f18435a = i10;
        this.f18436b = mediaController;
        this.f18437c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18435a) {
            case 0:
                MediaController.R(this.f18436b, this.f18437c);
                return;
            default:
                MediaController.a0(this.f18436b, this.f18437c);
                return;
        }
    }
}
