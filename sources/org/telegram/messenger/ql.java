package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f19031a;
    public final UnconfirmedAuthController f19032b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19031a = i10;
        this.f19032b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19031a) {
            case 0:
                UnconfirmedAuthController.h(this.f19032b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19032b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19032b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19032b);
                return;
        }
    }
}
