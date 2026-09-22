package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17571a;
    public final BetaUpdaterController f17572b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17571a = i10;
        this.f17572b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17571a) {
            case 0:
                BetaUpdaterController.b(this.f17572b);
                return;
            default:
                BetaUpdaterController.c(this.f17572b);
                return;
        }
    }
}
