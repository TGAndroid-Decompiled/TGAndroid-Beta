package org.telegram.messenger;
public final class u implements Runnable {
    public final int f18523a;
    public final BetaUpdaterController f18524b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f18523a = i10;
        this.f18524b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f18523a) {
            case 0:
                BetaUpdaterController.b(this.f18524b);
                return;
            default:
                BetaUpdaterController.c(this.f18524b);
                return;
        }
    }
}
