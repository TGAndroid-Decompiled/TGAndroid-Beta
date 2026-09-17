package org.telegram.messenger;
public final class t implements Runnable {
    public final int f19022a;
    public final BetaUpdaterController f19023b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19022a = i10;
        this.f19023b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19022a) {
            case 0:
                BetaUpdaterController.b(this.f19023b);
                return;
            default:
                BetaUpdaterController.c(this.f19023b);
                return;
        }
    }
}
