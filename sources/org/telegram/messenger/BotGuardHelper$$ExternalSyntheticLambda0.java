package org.telegram.messenger;

import org.telegram.ui.CacheControlActivity;

public final class BotGuardHelper$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final long f$2;
    public final long f$3;

    public BotGuardHelper$$ExternalSyntheticLambda0(long j, long j2, long j3, Utilities.Callback2 callback2) {
        this.$r8$classId = 2;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = j3;
        this.f$0 = callback2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((BotGuardHelper) this.f$0).lambda$openGuardBotWebApp$0(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$loadMusic$142(this.f$1, this.f$2, this.f$3);
                break;
            default:
                CacheControlActivity.lambda$getDeviceTotalSize$2(this.f$1, this.f$2, this.f$3, (Utilities.Callback2) this.f$0);
                break;
        }
    }

    public BotGuardHelper$$ExternalSyntheticLambda0(BaseController baseController, long j, long j2, long j3, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = j3;
    }
}
