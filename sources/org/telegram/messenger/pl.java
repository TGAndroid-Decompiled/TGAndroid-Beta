package org.telegram.messenger;
public final class pl implements Runnable {
    public final int f19264a;
    public final UnconfirmedAuthController f19265b;

    public pl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19264a = i10;
        this.f19265b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19264a) {
            case 0:
                UnconfirmedAuthController.h(this.f19265b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19265b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19265b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19265b);
                return;
        }
    }
}
