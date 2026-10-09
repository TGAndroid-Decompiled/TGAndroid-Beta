package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f18988a;
    public final UnconfirmedAuthController f18989b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18988a = i10;
        this.f18989b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18988a) {
            case 0:
                UnconfirmedAuthController.h(this.f18989b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18989b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18989b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18989b);
                return;
        }
    }
}
