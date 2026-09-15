package org.telegram.messenger;
public final class rl implements Runnable {
    public final int f17267a;
    public final UnconfirmedAuthController f17268b;

    public rl(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f17267a = i10;
        this.f17268b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f17267a) {
            case 0:
                UnconfirmedAuthController.h(this.f17268b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f17268b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f17268b);
                return;
            default:
                UnconfirmedAuthController.f(this.f17268b);
                return;
        }
    }
}
