package org.telegram.messenger;

public final class BetaUpdaterController$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final BetaUpdaterController f$0;

    public BetaUpdaterController$$ExternalSyntheticLambda1(BetaUpdaterController betaUpdaterController, int i) {
        this.$r8$classId = i;
        this.f$0 = betaUpdaterController;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$downloadUpdate$3();
                break;
            default:
                this.f$0.lambda$new$0();
                break;
        }
    }
}
