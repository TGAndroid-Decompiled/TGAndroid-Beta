package org.telegram.messenger;
public final class ml implements Runnable {
    public final int f19011a;
    public final UnconfirmedAuthController f19012b;

    public ml(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f19011a = i10;
        this.f19012b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f19011a) {
            case 0:
                UnconfirmedAuthController.h(this.f19012b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f19012b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f19012b);
                return;
            default:
                UnconfirmedAuthController.f(this.f19012b);
                return;
        }
    }
}
