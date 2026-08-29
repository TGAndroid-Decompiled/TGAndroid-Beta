package org.telegram.messenger;
public final class u implements Runnable {
    public final int f21683a;
    public final BetaUpdaterController f21684b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f21683a = i10;
        this.f21684b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f21683a) {
            case 0:
                BetaUpdaterController.b(this.f21684b);
                return;
            default:
                BetaUpdaterController.c(this.f21684b);
                return;
        }
    }
}
