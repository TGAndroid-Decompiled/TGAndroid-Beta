package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f17410a;
    public final UnconfirmedAuthController f17411b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17410a = i10;
        this.f17411b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17410a) {
            case 0:
                UnconfirmedAuthController.h(this.f17411b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17411b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17411b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17411b);
                return;
        }
    }
}
