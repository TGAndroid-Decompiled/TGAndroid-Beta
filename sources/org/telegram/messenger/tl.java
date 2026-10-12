package org.telegram.messenger;
public final class tl implements Runnable {
    public final int f18535a;
    public final UnconfirmedAuthController f18536b;

    public tl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18535a = i10;
        this.f18536b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18535a) {
            case 0:
                UnconfirmedAuthController.h(this.f18536b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18536b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18536b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18536b);
                return;
        }
    }
}
