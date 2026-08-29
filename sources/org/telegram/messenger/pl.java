package org.telegram.messenger;
public final class pl implements Runnable {
    public final int f21291a;
    public final UnconfirmedAuthController f21292b;

    public pl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f21291a = i10;
        this.f21292b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f21291a) {
            case 0:
                UnconfirmedAuthController.h(this.f21292b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f21292b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f21292b);
                return;
            default:
                UnconfirmedAuthController.f(this.f21292b);
                return;
        }
    }
}
