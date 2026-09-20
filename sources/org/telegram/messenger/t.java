package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17556a;
    public final BetaUpdaterController f17557b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17556a = i10;
        this.f17557b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17556a) {
            case 0:
                BetaUpdaterController.b(this.f17557b);
                return;
            default:
                BetaUpdaterController.c(this.f17557b);
                return;
        }
    }
}
