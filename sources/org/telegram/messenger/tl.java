package org.telegram.messenger;
public final class tl implements Runnable {
    public final int f20144a;
    public final UnconfirmedAuthController f20145b;

    public tl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f20144a = i10;
        this.f20145b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f20144a) {
            case 0:
                UnconfirmedAuthController.h(this.f20145b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f20145b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f20145b);
                return;
            default:
                UnconfirmedAuthController.f(this.f20145b);
                return;
        }
    }
}
