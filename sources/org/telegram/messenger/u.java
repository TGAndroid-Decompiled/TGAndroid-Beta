package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19614a;
    public final BetaUpdaterController f19615b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19614a = i10;
        this.f19615b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19614a) {
            case 0:
                BetaUpdaterController.b(this.f19615b);
                return;
            default:
                BetaUpdaterController.c(this.f19615b);
                return;
        }
    }
}
