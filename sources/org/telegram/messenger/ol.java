package org.telegram.messenger;
public final class ol implements Runnable {
    public final int f19183a;
    public final UnconfirmedAuthController f19184b;

    public ol(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19183a = i10;
        this.f19184b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19183a) {
            case 0:
                UnconfirmedAuthController.h(this.f19184b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19184b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19184b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19184b);
                return;
        }
    }
}
