package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f18438a;
    public final MediaController f18439b;
    public final boolean f18440c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f18438a = i10;
        this.f18439b = mediaController;
        this.f18440c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18438a) {
            case 0:
                MediaController.R(this.f18439b, this.f18440c);
                return;
            default:
                MediaController.a0(this.f18439b, this.f18440c);
                return;
        }
    }
}
