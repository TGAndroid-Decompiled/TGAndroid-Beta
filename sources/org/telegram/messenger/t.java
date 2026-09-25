package org.telegram.messenger;
public final class t implements Runnable {
    public final int f17566a;
    public final BetaUpdaterController f17567b;

    public t(BetaUpdaterController betaUpdaterController, int i10) {
        this.f17566a = i10;
        this.f17567b = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.f17566a) {
            case 0:
                BetaUpdaterController.b(this.f17567b);
                return;
            default:
                BetaUpdaterController.c(this.f17567b);
                return;
        }
    }
}
