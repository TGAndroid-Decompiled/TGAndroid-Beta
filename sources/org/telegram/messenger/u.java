package org.telegram.messenger;
public final class u implements Runnable {
    public final int f19704a;
    public final BetaUpdaterController f19705b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19704a = i10;
        this.f19705b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19704a) {
            case 0:
                BetaUpdaterController.b(this.f19705b);
                return;
            default:
                BetaUpdaterController.c(this.f19705b);
                return;
        }
    }
}
