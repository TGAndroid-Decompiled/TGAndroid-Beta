package org.telegram.messenger;
public final class ql implements Runnable {
    public final int f19337a;
    public final UnconfirmedAuthController f19338b;

    public ql(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19337a = i10;
        this.f19338b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19337a) {
            case 0:
                UnconfirmedAuthController.h(this.f19338b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19338b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19338b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19338b);
                return;
        }
    }
}
