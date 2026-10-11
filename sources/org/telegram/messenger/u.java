package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19320a;
    public final BetaUpdaterController f19321b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19320a = i10;
        this.f19321b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19320a) {
            case 0:
                BetaUpdaterController.b(this.f19321b);
                return;
            default:
                BetaUpdaterController.c(this.f19321b);
                return;
        }
    }
}
