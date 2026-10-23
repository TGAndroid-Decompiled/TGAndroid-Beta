package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19644a;
    public final BetaUpdaterController f19645b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19644a = i10;
        this.f19645b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19644a) {
            case 0:
                BetaUpdaterController.b(this.f19645b);
                return;
            default:
                BetaUpdaterController.c(this.f19645b);
                return;
        }
    }
}
