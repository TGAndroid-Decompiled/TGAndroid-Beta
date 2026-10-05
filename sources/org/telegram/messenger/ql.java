package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f19025a;
    public final UnconfirmedAuthController f19026b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19025a = i10;
        this.f19026b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19025a) {
            case 0:
                UnconfirmedAuthController.h(this.f19026b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19026b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19026b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19026b);
                return;
        }
    }
}
