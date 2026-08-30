package org.telegram.messenger;
public final class v implements Runnable {
    public final int f18621a;
    public final BetaUpdaterController f18622b;

    public v(BetaUpdaterController betaUpdaterController, int i10) {
        this.f18621a = i10;
        this.f18622b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f18621a) {
            case 0:
                BetaUpdaterController.b(this.f18622b);
                return;
            default:
                BetaUpdaterController.c(this.f18622b);
                return;
        }
    }
}
