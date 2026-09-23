package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f17169a;
    public final UnconfirmedAuthController f17170b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17169a = i10;
        this.f17170b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17169a) {
            case 0:
                UnconfirmedAuthController.h(this.f17170b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17170b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17170b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17170b);
                return;
        }
    }
}
