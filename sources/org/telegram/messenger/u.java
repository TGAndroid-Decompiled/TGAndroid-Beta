package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19607a;
    public final BetaUpdaterController f19608b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19607a = i10;
        this.f19608b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19607a) {
            case 0:
                BetaUpdaterController.b(this.f19608b);
                return;
            default:
                BetaUpdaterController.c(this.f19608b);
                return;
        }
    }
}
