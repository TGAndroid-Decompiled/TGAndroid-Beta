package org.telegram.messenger;
public final class rl implements Runnable {
    public final int f17481a;
    public final UnconfirmedAuthController f17482b;

    public rl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17481a = i10;
        this.f17482b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17481a) {
            case 0:
                UnconfirmedAuthController.h(this.f17482b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17482b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17482b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17482b);
                return;
        }
    }
}
