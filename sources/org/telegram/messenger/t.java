package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17560a;
    public final BetaUpdaterController f17561b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17560a = i10;
        this.f17561b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17560a) {
            case 0:
                BetaUpdaterController.b(this.f17561b);
                return;
            default:
                BetaUpdaterController.c(this.f17561b);
                return;
        }
    }
}
