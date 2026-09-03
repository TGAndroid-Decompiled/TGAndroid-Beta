package org.telegram.messenger;
public final class u implements Runnable {
    public final int f20146a;
    public final BetaUpdaterController f20147b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f20146a = i10;
        this.f20147b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f20146a) {
            case 0:
                BetaUpdaterController.b(this.f20147b);
                return;
            default:
                BetaUpdaterController.c(this.f20147b);
                return;
        }
    }
}
