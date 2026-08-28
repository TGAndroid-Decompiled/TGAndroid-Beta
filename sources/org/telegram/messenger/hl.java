package org.telegram.messenger;
public final class hl implements Runnable {
    public final int f20536a;
    public final UnconfirmedAuthController f20537b;

    public hl(UnconfirmedAuthController unconfirmedAuthController, int i9) {
        this.f20536a = i9;
        this.f20537b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f20536a) {
            case 0:
                UnconfirmedAuthController.h(this.f20537b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f20537b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f20537b);
                return;
            default:
                UnconfirmedAuthController.f(this.f20537b);
                return;
        }
    }
}
