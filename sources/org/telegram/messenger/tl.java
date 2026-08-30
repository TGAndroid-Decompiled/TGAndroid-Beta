package org.telegram.messenger;
public final class tl implements Runnable {
    public final int f18537a;
    public final UnconfirmedAuthController f18538b;

    public tl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18537a = i10;
        this.f18538b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18537a) {
            case 0:
                UnconfirmedAuthController.h(this.f18538b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18538b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18538b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18538b);
                return;
        }
    }
}
