package org.telegram.messenger;
public final class ol implements Runnable {
    public final int f19186a;
    public final UnconfirmedAuthController f19187b;

    public ol(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19186a = i10;
        this.f19187b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19186a) {
            case 0:
                UnconfirmedAuthController.h(this.f19187b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19187b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19187b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19187b);
                return;
        }
    }
}
