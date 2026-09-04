package org.telegram.messenger;
public final class rl implements Runnable {
    public final int f18931a;
    public final UnconfirmedAuthController f18932b;

    public rl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18931a = i10;
        this.f18932b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18931a) {
            case 0:
                UnconfirmedAuthController.h(this.f18932b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18932b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18932b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18932b);
                return;
        }
    }
}
