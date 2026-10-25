package org.telegram.messenger;
public final class x implements Runnable {
    public final int f21785a;
    public final BetaUpdaterController f21786b;

    public x(BetaUpdaterController betaUpdaterController, int i10) {
        this.f21785a = i10;
        this.f21786b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f21785a) {
            case 0:
                BetaUpdaterController.b(this.f21786b);
                return;
            default:
                BetaUpdaterController.c(this.f21786b);
                return;
        }
    }
}
