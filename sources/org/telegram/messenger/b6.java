package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f17932a;
    public final MediaController f17933b;

    public b6(MediaController mediaController, int i10) {
        this.f17932a = i10;
        this.f17933b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f17932a) {
            case 0:
                MediaController.f(this.f17933b);
                return;
            case 1:
                MediaController.H(this.f17933b);
                return;
            case 2:
                MediaController.c0(this.f17933b);
                return;
            case 3:
                MediaController.G(this.f17933b);
                return;
            case 4:
                MediaController.t(this.f17933b);
                return;
            case 5:
                MediaController.W(this.f17933b);
                return;
            case 6:
                MediaController.c(this.f17933b);
                return;
            case 7:
                MediaController.V(this.f17933b);
                return;
            case 8:
                MediaController.C(this.f17933b);
                return;
            case 9:
                MediaController.Q(this.f17933b);
                return;
            default:
                MediaController.J(this.f17933b);
                return;
        }
    }
}
