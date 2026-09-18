package org.telegram.messenger;
public final class rl implements Runnable {
    public final int f17276a;
    public final UnconfirmedAuthController f17277b;

    public rl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17276a = i10;
        this.f17277b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17276a) {
            case 0:
                UnconfirmedAuthController.h(this.f17277b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17277b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17277b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17277b);
                return;
        }
    }
}
