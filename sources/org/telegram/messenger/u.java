package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19709a;
    public final BetaUpdaterController f19710b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19709a = i10;
        this.f19710b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19709a) {
            case 0:
                BetaUpdaterController.b(this.f19710b);
                return;
            default:
                BetaUpdaterController.c(this.f19710b);
                return;
        }
    }
}
