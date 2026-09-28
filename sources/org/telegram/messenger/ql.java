package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f17414a;
    public final UnconfirmedAuthController f17415b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17414a = i10;
        this.f17415b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17414a) {
            case 0:
                UnconfirmedAuthController.h(this.f17415b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17415b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17415b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17415b);
                return;
        }
    }
}
