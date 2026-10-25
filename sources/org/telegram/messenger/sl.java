package org.telegram.messenger;
public final class sl implements Runnable {
    public final int f21279a;
    public final UnconfirmedAuthController f21280b;

    public sl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f21279a = i10;
        this.f21280b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f21279a) {
            case 0:
                UnconfirmedAuthController.h(this.f21280b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f21280b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f21280b);
                return;
            default:
                UnconfirmedAuthController.f(this.f21280b);
                return;
        }
    }
}
