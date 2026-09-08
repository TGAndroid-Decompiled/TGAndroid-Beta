package org.telegram.messenger;
public final class t7 implements Runnable {
    public final int f19074a;
    public final long f19075b;
    public final long f19076c;
    public final int d;
    public final BaseController f19077e;

    public t7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f19074a = i11;
        this.f19077e = baseController;
        this.f19075b = j3;
        this.f19076c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19074a) {
            case 0:
                ((MediaDataController) this.f19077e).lambda$getMediaCounts$131(this.f19075b, this.f19076c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f19077e).lambda$deleteNotificationChannel$42(this.f19075b, this.f19076c, this.d);
                return;
            default:
                ((TopicsController) this.f19077e).lambda$updateMentionsUnread$21(this.f19075b, this.f19076c, this.d);
                return;
        }
    }
}
