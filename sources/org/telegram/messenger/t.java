package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17586a;
    public final BetaUpdaterController f17587b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17586a = i10;
        this.f17587b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17586a) {
            case 0:
                BetaUpdaterController.b(this.f17587b);
                return;
            default:
                BetaUpdaterController.c(this.f17587b);
                return;
        }
    }
}
