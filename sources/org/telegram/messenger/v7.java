package org.telegram.messenger;
public final class v7 implements Runnable {
    public final int f21796a;
    public final long f21797b;
    public final long f21798c;
    public final int d;
    public final BaseController f21799e;

    public v7(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f21796a = i11;
        this.f21799e = baseController;
        this.f21797b = j10;
        this.f21798c = j11;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21796a) {
            case 0:
                ((MediaDataController) this.f21799e).lambda$getMediaCounts$131(this.f21797b, this.f21798c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f21799e).lambda$deleteNotificationChannel$42(this.f21797b, this.f21798c, this.d);
                return;
            default:
                ((TopicsController) this.f21799e).lambda$updateMentionsUnread$21(this.f21797b, this.f21798c, this.d);
                return;
        }
    }
}
