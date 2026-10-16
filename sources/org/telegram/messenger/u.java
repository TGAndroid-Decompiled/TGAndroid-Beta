package org.telegram.messenger;
public final class u implements Runnable {
    public final int f18240a;
    public final BetaUpdaterController f18241b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f18240a = i10;
        this.f18241b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f18240a) {
            case 0:
                BetaUpdaterController.b(this.f18241b);
                return;
            default:
                BetaUpdaterController.c(this.f18241b);
                return;
        }
    }
}
