package org.telegram.messenger;
public final class t implements Runnable {
    public final int f19185a;
    public final BetaUpdaterController f19186b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19185a = i10;
        this.f19186b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19185a) {
            case 0:
                BetaUpdaterController.b(this.f19186b);
                return;
            default:
                BetaUpdaterController.c(this.f19186b);
                return;
        }
    }
}
