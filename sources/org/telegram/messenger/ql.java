package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f17415a;
    public final UnconfirmedAuthController f17416b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17415a = i10;
        this.f17416b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17415a) {
            case 0:
                UnconfirmedAuthController.h(this.f17416b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17416b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17416b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17416b);
                return;
        }
    }
}
