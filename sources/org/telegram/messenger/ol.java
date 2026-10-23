package org.telegram.messenger;
public final class ol implements Runnable {
    public final int f19236a;
    public final UnconfirmedAuthController f19237b;

    public ol(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19236a = i10;
        this.f19237b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19236a) {
            case 0:
                UnconfirmedAuthController.h(this.f19237b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19237b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19237b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19237b);
                return;
        }
    }
}
