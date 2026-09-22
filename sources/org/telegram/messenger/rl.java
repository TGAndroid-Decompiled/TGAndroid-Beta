package org.telegram.messenger;
public final class rl implements Runnable {
    public final int f17496a;
    public final UnconfirmedAuthController f17497b;

    public rl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17496a = i10;
        this.f17497b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17496a) {
            case 0:
                UnconfirmedAuthController.h(this.f17497b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17497b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17497b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17497b);
                return;
        }
    }
}
