package org.telegram.messenger;
public final class v implements Runnable {
    public final int f18626a;
    public final BetaUpdaterController f18627b;

    public v(BetaUpdaterController betaUpdaterController, int i10) {
        this.f18626a = i10;
        this.f18627b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f18626a) {
            case 0:
                BetaUpdaterController.b(this.f18627b);
                return;
            default:
                BetaUpdaterController.c(this.f18627b);
                return;
        }
    }
}
