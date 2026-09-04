package org.telegram.messenger;
public final class l6 implements Runnable {
    public final int f18240a;
    public final MediaController f18241b;
    public final boolean f18242c;

    public l6(MediaController mediaController, boolean z10, int i10) {
        this.f18240a = i10;
        this.f18241b = mediaController;
        this.f18242c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18240a) {
            case 0:
                MediaController.R(this.f18241b, this.f18242c);
                return;
            default:
                MediaController.a0(this.f18241b, this.f18242c);
                return;
        }
    }
}
