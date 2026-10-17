package org.telegram.messenger;
public final class v implements Runnable {
    public final int f19700a;
    public final BetaUpdaterController f19701b;

    public v(BetaUpdaterController betaUpdaterController, int i10) {
        this.f19700a = i10;
        this.f19701b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f19700a) {
            case 0:
                BetaUpdaterController.b(this.f19701b);
                return;
            default:
                BetaUpdaterController.c(this.f19701b);
                return;
        }
    }
}
