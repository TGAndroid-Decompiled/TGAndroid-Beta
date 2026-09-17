package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f18883a;
    public final UnconfirmedAuthController f18884b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18883a = i10;
        this.f18884b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18883a) {
            case 0:
                UnconfirmedAuthController.h(this.f18884b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18884b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18884b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18884b);
                return;
        }
    }
}
