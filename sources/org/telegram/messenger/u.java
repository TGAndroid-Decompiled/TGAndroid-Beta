package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19623a;
    public final BetaUpdaterController f19624b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19623a = i10;
        this.f19624b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19623a) {
            case 0:
                BetaUpdaterController.b(this.f19624b);
                return;
            default:
                BetaUpdaterController.c(this.f19624b);
                return;
        }
    }
}
