package org.telegram.messenger;
public final class tl implements Runnable {
    public final int f20142a;
    public final UnconfirmedAuthController f20143b;

    public tl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f20142a = i10;
        this.f20143b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f20142a) {
            case 0:
                UnconfirmedAuthController.h(this.f20143b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f20143b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f20143b);
                return;
            default:
                UnconfirmedAuthController.f(this.f20143b);
                return;
        }
    }
}
