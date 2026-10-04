package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f18437a;
    public final MediaController f18438b;
    public final boolean f18439c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f18437a = i10;
        this.f18438b = mediaController;
        this.f18439c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18437a) {
            case 0:
                MediaController.R(this.f18438b, this.f18439c);
                return;
            default:
                MediaController.a0(this.f18438b, this.f18439c);
                return;
        }
    }
}
