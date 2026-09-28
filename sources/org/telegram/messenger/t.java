package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17570a;
    public final BetaUpdaterController f17571b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17570a = i10;
        this.f17571b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17570a) {
            case 0:
                BetaUpdaterController.b(this.f17571b);
                return;
            default:
                BetaUpdaterController.c(this.f17571b);
                return;
        }
    }
}
