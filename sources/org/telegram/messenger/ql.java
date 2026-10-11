package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f18995a;
    public final UnconfirmedAuthController f18996b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18995a = i10;
        this.f18996b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18995a) {
            case 0:
                UnconfirmedAuthController.h(this.f18996b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18996b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18996b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18996b);
                return;
        }
    }
}
