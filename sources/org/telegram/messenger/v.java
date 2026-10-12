package org.telegram.messenger;
public final class v implements Runnable {
    public final int f19147a;
    public final BetaUpdaterController f19148b;

    public v(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19147a = i10;
        this.f19148b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19147a) {
            case 0:
                BetaUpdaterController.b(this.f19148b);
                return;
            default:
                BetaUpdaterController.c(this.f19148b);
                return;
        }
    }
}
