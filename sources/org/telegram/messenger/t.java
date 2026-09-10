package org.telegram.messenger;
public final class t implements Runnable {
    public final int f16357a;
    public final BetaUpdaterController f16358b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f16357a = i10;
        this.f16358b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f16357a) {
            case 0:
                BetaUpdaterController.b(this.f16358b);
                return;
            default:
                BetaUpdaterController.c(this.f16358b);
                return;
        }
    }
}
