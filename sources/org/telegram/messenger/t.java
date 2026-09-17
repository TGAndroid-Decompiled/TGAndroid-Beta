package org.telegram.messenger;
public final class t implements Runnable {
    public final int f19049a;
    public final BetaUpdaterController f19050b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19049a = i10;
        this.f19050b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19049a) {
            case 0:
                BetaUpdaterController.b(this.f19050b);
                return;
            default:
                BetaUpdaterController.c(this.f19050b);
                return;
        }
    }
}
