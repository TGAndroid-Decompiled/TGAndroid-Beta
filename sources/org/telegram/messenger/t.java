package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17313a;
    public final BetaUpdaterController f17314b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17313a = i10;
        this.f17314b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17313a) {
            case 0:
                BetaUpdaterController.b(this.f17314b);
                return;
            default:
                BetaUpdaterController.c(this.f17314b);
                return;
        }
    }
}
