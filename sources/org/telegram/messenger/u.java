package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19639a;
    public final BetaUpdaterController f19640b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19639a = i10;
        this.f19640b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19639a) {
            case 0:
                BetaUpdaterController.b(this.f19640b);
                return;
            default:
                BetaUpdaterController.c(this.f19640b);
                return;
        }
    }
}
