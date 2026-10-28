package org.telegram.messenger;
public final class x implements Runnable {
    public final int f21798a;
    public final BetaUpdaterController f21799b;

    public x(BetaUpdaterController betaUpdaterController, int i10) {
        this.f21798a = i10;
        this.f21799b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f21798a) {
            case 0:
                BetaUpdaterController.b(this.f21799b);
                return;
            default:
                BetaUpdaterController.c(this.f21799b);
                return;
        }
    }
}
