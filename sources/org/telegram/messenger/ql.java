package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f19020a;
    public final UnconfirmedAuthController f19021b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19020a = i10;
        this.f19021b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19020a) {
            case 0:
                UnconfirmedAuthController.h(this.f19021b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19021b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19021b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19021b);
                return;
        }
    }
}
