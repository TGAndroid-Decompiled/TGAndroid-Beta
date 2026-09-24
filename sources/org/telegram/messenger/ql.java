package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f17401a;
    public final UnconfirmedAuthController f17402b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17401a = i10;
        this.f17402b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17401a) {
            case 0:
                UnconfirmedAuthController.h(this.f17402b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17402b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17402b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17402b);
                return;
        }
    }
}
