package org.telegram.messenger;

public final class TopicsController$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final BaseController f$0;
    public final long f$1;
    public final long f$2;
    public final int f$3;

    public TopicsController$$ExternalSyntheticLambda2(BaseController baseController, long j, long j2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseController;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = i;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((TopicsController) this.f$0).lambda$updateMentionsUnread$21(this.f$1, this.f$2, this.f$3);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$getMediaCounts$131(this.f$1, this.f$2, this.f$3);
                break;
            default:
                ((NotificationsController) this.f$0).lambda$deleteNotificationChannel$42(this.f$1, this.f$2, this.f$3);
                break;
        }
    }
}
