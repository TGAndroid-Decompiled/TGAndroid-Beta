package org.telegram.messenger;
public final class tl implements Runnable {
    public final int f21356a;
    public final UnconfirmedAuthController f21357b;

    public tl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f21356a = i10;
        this.f21357b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f21356a) {
            case 0:
                UnconfirmedAuthController.h(this.f21357b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f21357b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f21357b);
                return;
            default:
                UnconfirmedAuthController.f(this.f21357b);
                return;
        }
    }
}
