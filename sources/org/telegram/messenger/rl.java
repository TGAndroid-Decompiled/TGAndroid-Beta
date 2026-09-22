package org.telegram.messenger;
public final class rl implements Runnable {
    public final int f17263a;
    public final UnconfirmedAuthController f17264b;

    public rl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17263a = i10;
        this.f17264b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17263a) {
            case 0:
                UnconfirmedAuthController.h(this.f17264b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17264b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17264b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17264b);
                return;
        }
    }
}
