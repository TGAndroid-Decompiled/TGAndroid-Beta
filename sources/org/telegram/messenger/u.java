package org.telegram.messenger;

public final class u implements Runnable {

    public final int f21667a;

    public final BetaUpdaterController f21668b;

    public u(BetaUpdaterController betaUpdaterController, int i10) {
        this.f21667a = i10;
        this.f21668b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f21667a) {
            case 0:
                this.f21668b.lambda$downloadUpdate$3();
                break;
            default:
                this.f21668b.lambda$new$0();
                break;
        }
    }
}
