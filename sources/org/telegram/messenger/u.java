package org.telegram.messenger;
public final class u implements Runnable {
    public final int f20144a;
    public final BetaUpdaterController f20145b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f20144a = i10;
        this.f20145b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f20144a) {
            case 0:
                BetaUpdaterController.b(this.f20145b);
                return;
            default:
                BetaUpdaterController.c(this.f20145b);
                return;
        }
    }
}
