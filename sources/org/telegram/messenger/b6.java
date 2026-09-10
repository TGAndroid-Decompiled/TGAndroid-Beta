package org.telegram.messenger;
public final class b6 implements Runnable {
    public final int f14758a;
    public final MediaController f14759b;

    public b6(MediaController mediaController, int i10) {
        this.f14758a = i10;
        this.f14759b = mediaController;
    }

    @Override
    public final void run() {
        switch (this.f14758a) {
            case 0:
                MediaController.H(this.f14759b);
                return;
            case 1:
                MediaController.z(this.f14759b);
                return;
            case 2:
                MediaController.p(this.f14759b);
                return;
            case 3:
                MediaController.h(this.f14759b);
                return;
            case 4:
                MediaController.b(this.f14759b);
                return;
            case 5:
                MediaController.V(this.f14759b);
                return;
            case 6:
                MediaController.a(this.f14759b);
                return;
            case 7:
                MediaController.U(this.f14759b);
                return;
            case 8:
                MediaController.v(this.f14759b);
                return;
            case 9:
                MediaController.C(this.f14759b);
                return;
            default:
                MediaController.Q(this.f14759b);
                return;
        }
    }
}
