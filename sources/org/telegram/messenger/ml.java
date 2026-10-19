package org.telegram.messenger;
public final class ml implements Runnable {
    public final int f19012a;
    public final UnconfirmedAuthController f19013b;

    public ml(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19012a = i10;
        this.f19013b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19012a) {
            case 0:
                UnconfirmedAuthController.h(this.f19013b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19013b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19013b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19013b);
                return;
        }
    }
}
