package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17351a;
    public final BetaUpdaterController f17352b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17351a = i10;
        this.f17352b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17351a) {
            case 0:
                BetaUpdaterController.b(this.f17352b);
                return;
            default:
                BetaUpdaterController.c(this.f17352b);
                return;
        }
    }
}
