package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19286a;
    public final BetaUpdaterController f19287b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19286a = i10;
        this.f19287b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19286a) {
            case 0:
                BetaUpdaterController.b(this.f19287b);
                return;
            default:
                BetaUpdaterController.c(this.f19287b);
                return;
        }
    }
}
