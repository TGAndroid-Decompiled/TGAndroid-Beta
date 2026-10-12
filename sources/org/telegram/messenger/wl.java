package org.telegram.messenger;
public final class wl implements Runnable {
    public final int f19509a;
    public final UnconfirmedAuthController f19510b;

    public wl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19509a = i10;
        this.f19510b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19509a) {
            case 0:
                UnconfirmedAuthController.h(this.f19510b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19510b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19510b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19510b);
                return;
        }
    }
}
