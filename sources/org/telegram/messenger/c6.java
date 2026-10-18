package org.telegram.messenger;
public final class c6 implements Runnable {
    public final int f18018a;
    public final MediaController f18019b;

    public c6(MediaController mediaController, int i10) {
        this.f18018a = i10;
        this.f18019b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f18018a) {
            case 0:
                MediaController.f(this.f18019b);
                return;
            case 1:
                MediaController.H(this.f18019b);
                return;
            case 2:
                MediaController.c0(this.f18019b);
                return;
            case 3:
                MediaController.G(this.f18019b);
                return;
            case 4:
                MediaController.t(this.f18019b);
                return;
            case 5:
                MediaController.W(this.f18019b);
                return;
            case 6:
                MediaController.c(this.f18019b);
                return;
            case 7:
                MediaController.V(this.f18019b);
                return;
            case 8:
                MediaController.C(this.f18019b);
                return;
            case 9:
                MediaController.Q(this.f18019b);
                return;
            default:
                MediaController.J(this.f18019b);
                return;
        }
    }
}
