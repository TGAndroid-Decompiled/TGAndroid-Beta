package org.telegram.messenger;
public final class tl implements Runnable {
    public final int f18521a;
    public final UnconfirmedAuthController f18522b;

    public tl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18521a = i10;
        this.f18522b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18521a) {
            case 0:
                UnconfirmedAuthController.h(this.f18522b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18522b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18522b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18522b);
                return;
        }
    }
}
