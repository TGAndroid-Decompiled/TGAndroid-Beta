package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f17416a;
    public final UnconfirmedAuthController f17417b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17416a = i10;
        this.f17417b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17416a) {
            case 0:
                UnconfirmedAuthController.h(this.f17417b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17417b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17417b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17417b);
                return;
        }
    }
}
