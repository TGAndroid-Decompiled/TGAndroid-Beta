package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19291a;
    public final BetaUpdaterController f19292b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19291a = i10;
        this.f19292b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19291a) {
            case 0:
                BetaUpdaterController.b(this.f19292b);
                return;
            default:
                BetaUpdaterController.c(this.f19292b);
                return;
        }
    }
}
