package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17339a;
    public final BetaUpdaterController f17340b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17339a = i10;
        this.f17340b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17339a) {
            case 0:
                BetaUpdaterController.b(this.f17340b);
                return;
            default:
                BetaUpdaterController.c(this.f17340b);
                return;
        }
    }
}
