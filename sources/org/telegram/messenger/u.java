package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19611a;
    public final BetaUpdaterController f19612b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19611a = i10;
        this.f19612b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19611a) {
            case 0:
                BetaUpdaterController.b(this.f19612b);
                return;
            default:
                BetaUpdaterController.c(this.f19612b);
                return;
        }
    }
}
