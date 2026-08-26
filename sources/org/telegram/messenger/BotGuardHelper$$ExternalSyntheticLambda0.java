package org.telegram.messenger;

import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;

public final class BotGuardHelper$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final long f$2;
    public final long f$3;

    public BotGuardHelper$$ExternalSyntheticLambda0(long j, long j2, long j3, GiftSheet$$ExternalSyntheticLambda8 giftSheet$$ExternalSyntheticLambda8) {
        this.$r8$classId = 2;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = j3;
        this.f$0 = giftSheet$$ExternalSyntheticLambda8;
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
                long j = this.f$1;
                long j2 = this.f$2;
                CacheControlActivity.lastDeviceTotalSize = Long.valueOf(j * j2);
                Long lValueOf = Long.valueOf(this.f$3 * j2);
                CacheControlActivity.lastDeviceTotalFreeSize = lValueOf;
                ((GiftSheet$$ExternalSyntheticLambda8) this.f$0).run(CacheControlActivity.lastDeviceTotalSize, lValueOf);
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
