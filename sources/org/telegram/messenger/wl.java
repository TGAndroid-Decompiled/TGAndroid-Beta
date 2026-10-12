package org.telegram.messenger;
public final class wl implements Runnable {
    public final int f19508a;
    public final UnconfirmedAuthController f19509b;

    public wl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19508a = i10;
        this.f19509b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19508a) {
            case 0:
                UnconfirmedAuthController.h(this.f19509b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19509b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19509b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19509b);
                return;
        }
    }
}
