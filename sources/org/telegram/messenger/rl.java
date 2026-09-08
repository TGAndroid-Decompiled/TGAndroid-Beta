package org.telegram.messenger;
public final class rl implements Runnable {
    public final int f18958a;
    public final UnconfirmedAuthController f18959b;

    public rl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18958a = i10;
        this.f18959b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18958a) {
            case 0:
                UnconfirmedAuthController.h(this.f18959b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18959b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18959b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18959b);
                return;
        }
    }
}
