package org.telegram.messenger;
public final class c6 implements Runnable {
    public final int f16635a;
    public final MediaController f16636b;

    public c6(MediaController mediaController, int i10) {
        this.f16635a = i10;
        this.f16636b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f16635a) {
            case 0:
                MediaController.f(this.f16636b);
                return;
            case 1:
                MediaController.H(this.f16636b);
                return;
            case 2:
                MediaController.c0(this.f16636b);
                return;
            case 3:
                MediaController.G(this.f16636b);
                return;
            case 4:
                MediaController.t(this.f16636b);
                return;
            case 5:
                MediaController.W(this.f16636b);
                return;
            case 6:
                MediaController.c(this.f16636b);
                return;
            case 7:
                MediaController.V(this.f16636b);
                return;
            case 8:
                MediaController.C(this.f16636b);
                return;
            case 9:
                MediaController.Q(this.f16636b);
                return;
            default:
                MediaController.J(this.f16636b);
                return;
        }
    }
}
