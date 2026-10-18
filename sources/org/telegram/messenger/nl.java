package org.telegram.messenger;
public final class nl implements Runnable {
    public final int f19091a;
    public final UnconfirmedAuthController f19092b;

    public nl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19091a = i10;
        this.f19092b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19091a) {
            case 0:
                UnconfirmedAuthController.h(this.f19092b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19092b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19092b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19092b);
                return;
        }
    }
}
