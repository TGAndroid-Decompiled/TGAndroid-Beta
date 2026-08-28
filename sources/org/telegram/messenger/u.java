package org.telegram.messenger;
public final class u implements Runnable {
    public final int f21611a;
    public final BetaUpdaterController f21612b;

    public u(BetaUpdaterController betaUpdaterController, int i9) {
        this.f21611a = i9;
        this.f21612b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f21611a) {
            case 0:
                BetaUpdaterController.b(this.f21612b);
                return;
            default:
                BetaUpdaterController.c(this.f21612b);
                return;
        }
    }
}
