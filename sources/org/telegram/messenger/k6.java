package org.telegram.messenger;
public final class k6 implements Runnable {
    public final int f20757a;
    public final MediaController f20758b;
    public final boolean f20759c;

    public k6(MediaController mediaController, boolean z10, int i9) {
        this.f20757a = i9;
        this.f20758b = mediaController;
        this.f20759c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20757a) {
            case 0:
                MediaController.R(this.f20758b, this.f20759c);
                return;
            default:
                MediaController.a0(this.f20758b, this.f20759c);
                return;
        }
    }
}
