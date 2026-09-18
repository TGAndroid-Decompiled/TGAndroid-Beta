package org.telegram.messenger;
public final class rl implements Runnable {
    public final int f17448a;
    public final UnconfirmedAuthController f17449b;

    public rl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17448a = i10;
        this.f17449b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17448a) {
            case 0:
                UnconfirmedAuthController.h(this.f17449b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17449b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17449b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17449b);
                return;
        }
    }
}
