package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f18992a;
    public final UnconfirmedAuthController f18993b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18992a = i10;
        this.f18993b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18992a) {
            case 0:
                UnconfirmedAuthController.h(this.f18993b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18993b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18993b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18993b);
                return;
        }
    }
}
