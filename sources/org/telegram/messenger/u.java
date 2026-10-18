package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19610a;
    public final BetaUpdaterController f19611b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19610a = i10;
        this.f19611b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19610a) {
            case 0:
                BetaUpdaterController.b(this.f19611b);
                return;
            default:
                BetaUpdaterController.c(this.f19611b);
                return;
        }
    }
}
