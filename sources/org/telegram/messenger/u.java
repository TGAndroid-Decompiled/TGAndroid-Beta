package org.telegram.messenger;
public final class u implements Runnable {
    public final int f17604a;
    public final BetaUpdaterController f17605b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17604a = i10;
        this.f17605b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17604a) {
            case 0:
                BetaUpdaterController.b(this.f17605b);
                return;
            default:
                BetaUpdaterController.c(this.f17605b);
                return;
        }
    }
}
