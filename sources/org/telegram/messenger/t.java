package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17551a;
    public final BetaUpdaterController f17552b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17551a = i10;
        this.f17552b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17551a) {
            case 0:
                BetaUpdaterController.b(this.f17552b);
                return;
            default:
                BetaUpdaterController.c(this.f17552b);
                return;
        }
    }
}
