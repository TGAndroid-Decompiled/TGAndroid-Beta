package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f19016a;
    public final UnconfirmedAuthController f19017b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19016a = i10;
        this.f19017b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19016a) {
            case 0:
                UnconfirmedAuthController.h(this.f19017b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19017b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19017b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19017b);
                return;
        }
    }
}
