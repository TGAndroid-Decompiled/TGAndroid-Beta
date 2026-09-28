package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17569a;
    public final BetaUpdaterController f17570b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17569a = i10;
        this.f17570b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17569a) {
            case 0:
                BetaUpdaterController.b(this.f17570b);
                return;
            default:
                BetaUpdaterController.c(this.f17570b);
                return;
        }
    }
}
