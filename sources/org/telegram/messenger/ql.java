package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f19015a;
    public final UnconfirmedAuthController f19016b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19015a = i10;
        this.f19016b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19015a) {
            case 0:
                UnconfirmedAuthController.h(this.f19016b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19016b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19016b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19016b);
                return;
        }
    }
}
