package org.telegram.messenger;

public final class BotForumHelper$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final BotForumHelper f$0;
    public final long f$1;
    public final int f$2;
    public final long f$3;

    public BotForumHelper$$ExternalSyntheticLambda1(BotForumHelper botForumHelper, long j, int i, long j2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = botForumHelper;
        this.f$1 = j;
        this.f$2 = i;
        this.f$3 = j2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onBotForumDraftUpdate$1(this.f$1, this.f$2, this.f$3);
                break;
            default:
                this.f$0.lambda$onBotForumDraftUpdate$0(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
