package org.telegram.messenger;
public final class nl implements Runnable {
    public final int f19094a;
    public final UnconfirmedAuthController f19095b;

    public nl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19094a = i10;
        this.f19095b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19094a) {
            case 0:
                UnconfirmedAuthController.h(this.f19095b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19095b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19095b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19095b);
                return;
        }
    }
}
