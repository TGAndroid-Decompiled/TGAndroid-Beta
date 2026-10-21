package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19621a;
    public final BetaUpdaterController f19622b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19621a = i10;
        this.f19622b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19621a) {
            case 0:
                BetaUpdaterController.b(this.f19622b);
                return;
            default:
                BetaUpdaterController.c(this.f19622b);
                return;
        }
    }
}
