package org.telegram.messenger;
public final class t implements Runnable {
    public final int f19186a;
    public final BetaUpdaterController f19187b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19186a = i10;
        this.f19187b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19186a) {
            case 0:
                BetaUpdaterController.b(this.f19187b);
                return;
            default:
                BetaUpdaterController.c(this.f19187b);
                return;
        }
    }
}
