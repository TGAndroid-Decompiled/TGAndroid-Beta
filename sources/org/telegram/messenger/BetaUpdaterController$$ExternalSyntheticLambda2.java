package org.telegram.messenger;

import java.io.File;

public final class BetaUpdaterController$$ExternalSyntheticLambda2 implements Utilities.Callback {
    public final int $r8$classId;
    public final BetaUpdaterController f$0;

    public BetaUpdaterController$$ExternalSyntheticLambda2(BetaUpdaterController betaUpdaterController, int i) {
        this.$r8$classId = i;
        this.f$0 = betaUpdaterController;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$downloadUpdate$5((File) obj);
                break;
            default:
                this.f$0.lambda$downloadUpdate$6((Float) obj);
                break;
        }
    }
}
