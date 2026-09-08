package org.telegram.messenger;
public final class t implements Runnable {
    public final int f19041a;
    public final BetaUpdaterController f19042b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19041a = i10;
        this.f19042b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19041a) {
            case 0:
                BetaUpdaterController.b(this.f19042b);
                return;
            default:
                BetaUpdaterController.c(this.f19042b);
                return;
        }
    }
}
