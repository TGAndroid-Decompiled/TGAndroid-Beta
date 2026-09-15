package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17342a;
    public final BetaUpdaterController f17343b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17342a = i10;
        this.f17343b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17342a) {
            case 0:
                BetaUpdaterController.b(this.f17343b);
                return;
            default:
                BetaUpdaterController.c(this.f17343b);
                return;
        }
    }
}
