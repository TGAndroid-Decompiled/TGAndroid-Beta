package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f17431a;
    public final UnconfirmedAuthController f17432b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17431a = i10;
        this.f17432b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17431a) {
            case 0:
                UnconfirmedAuthController.h(this.f17432b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17432b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17432b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17432b);
                return;
        }
    }
}
