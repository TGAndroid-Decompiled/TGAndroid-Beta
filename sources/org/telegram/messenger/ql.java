package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f18856a;
    public final UnconfirmedAuthController f18857b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18856a = i10;
        this.f18857b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18856a) {
            case 0:
                UnconfirmedAuthController.h(this.f18857b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18857b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18857b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18857b);
                return;
        }
    }
}
