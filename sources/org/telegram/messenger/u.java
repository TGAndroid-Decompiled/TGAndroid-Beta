package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19284a;
    public final BetaUpdaterController f19285b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19284a = i10;
        this.f19285b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19284a) {
            case 0:
                BetaUpdaterController.b(this.f19285b);
                return;
            default:
                BetaUpdaterController.c(this.f19285b);
                return;
        }
    }
}
