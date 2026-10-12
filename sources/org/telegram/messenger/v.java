package org.telegram.messenger;
public final class v implements Runnable {
    public final int f19148a;
    public final BetaUpdaterController f19149b;

    public v(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19148a = i10;
        this.f19149b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19148a) {
            case 0:
                BetaUpdaterController.b(this.f19149b);
                return;
            default:
                BetaUpdaterController.c(this.f19149b);
                return;
        }
    }
}
