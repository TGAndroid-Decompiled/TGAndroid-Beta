package org.telegram.messenger;
public final class ul implements Runnable {
    public final int f18322a;
    public final UnconfirmedAuthController f18323b;

    public ul(UnconfirmedAuthController unconfirmedAuthController, int i10) {
        this.f18322a = i10;
        this.f18323b = unconfirmedAuthController;
    }

    @Override
    public final void run() {
        switch (this.f18322a) {
            case 0:
                UnconfirmedAuthController.h(this.f18323b);
                return;
            case 1:
                UnconfirmedAuthController.a(this.f18323b);
                return;
            case 2:
                UnconfirmedAuthController.d(this.f18323b);
                return;
            default:
                UnconfirmedAuthController.f(this.f18323b);
                return;
        }
    }
}
