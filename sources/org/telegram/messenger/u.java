package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19282a;
    public final BetaUpdaterController f19283b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19282a = i10;
        this.f19283b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19282a) {
            case 0:
                BetaUpdaterController.b(this.f19283b);
                return;
            default:
                BetaUpdaterController.c(this.f19283b);
                return;
        }
    }
}
