package org.telegram.messenger;
public final class c6 implements Runnable {
    public final int f16938a;
    public final MediaController f16939b;

    public c6(MediaController mediaController, int i10) {
        this.f16938a = i10;
        this.f16939b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f16938a) {
            case 0:
                MediaController.f(this.f16939b);
                return;
            case 1:
                MediaController.H(this.f16939b);
                return;
            case 2:
                MediaController.c0(this.f16939b);
                return;
            case 3:
                MediaController.G(this.f16939b);
                return;
            case 4:
                MediaController.t(this.f16939b);
                return;
            case 5:
                MediaController.W(this.f16939b);
                return;
            case 6:
                MediaController.c(this.f16939b);
                return;
            case 7:
                MediaController.V(this.f16939b);
                return;
            case 8:
                MediaController.C(this.f16939b);
                return;
            case 9:
                MediaController.Q(this.f16939b);
                return;
            default:
                MediaController.J(this.f16939b);
                return;
        }
    }
}
