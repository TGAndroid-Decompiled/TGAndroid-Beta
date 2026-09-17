package org.telegram.messenger;
public final class k6 implements Runnable {
    public final int f18187a;
    public final MediaController f18188b;
    public final boolean f18189c;

    public k6(MediaController mediaController, boolean z10, int i10) {
        this.f18187a = i10;
        this.f18188b = mediaController;
        this.f18189c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18187a) {
            case 0:
                MediaController.R(this.f18188b, this.f18189c);
                return;
            default:
                MediaController.a0(this.f18188b, this.f18189c);
                return;
        }
    }
}
