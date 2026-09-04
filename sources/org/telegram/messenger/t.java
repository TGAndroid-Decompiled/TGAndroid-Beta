package org.telegram.messenger;
public final class t implements Runnable {
    public final int f19014a;
    public final BetaUpdaterController f19015b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19014a = i10;
        this.f19015b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19014a) {
            case 0:
                BetaUpdaterController.b(this.f19015b);
                return;
            default:
                BetaUpdaterController.c(this.f19015b);
                return;
        }
    }
}
