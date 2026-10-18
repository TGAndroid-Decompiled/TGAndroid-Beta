package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f17935a;
    public final MediaController f17936b;

    public b6(MediaController mediaController, int i10) {
        this.f17935a = i10;
        this.f17936b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f17935a) {
            case 0:
                MediaController.f(this.f17936b);
                return;
            case 1:
                MediaController.H(this.f17936b);
                return;
            case 2:
                MediaController.c0(this.f17936b);
                return;
            case 3:
                MediaController.G(this.f17936b);
                return;
            case 4:
                MediaController.t(this.f17936b);
                return;
            case 5:
                MediaController.W(this.f17936b);
                return;
            case 6:
                MediaController.c(this.f17936b);
                return;
            case 7:
                MediaController.V(this.f17936b);
                return;
            case 8:
                MediaController.C(this.f17936b);
                return;
            case 9:
                MediaController.Q(this.f17936b);
                return;
            default:
                MediaController.J(this.f17936b);
                return;
        }
    }
}
