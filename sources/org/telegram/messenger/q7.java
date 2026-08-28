package org.telegram.messenger;
public final class q7 implements Runnable {
    public final int f21300a;
    public final long f21301b;
    public final long f21302c;
    public final int d;
    public final BaseController f21303e;

    public q7(BaseController baseController, long j10, long j11, int i9, int i10) {
        this.f21300a = i10;
        this.f21303e = baseController;
        this.f21301b = j10;
        this.f21302c = j11;
        this.d = i9;
    }

    @Override
    public final void run() {
        switch (this.f21300a) {
            case 0:
                ((MediaDataController) this.f21303e).lambda$getMediaCounts$131(this.f21301b, this.f21302c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f21303e).lambda$deleteNotificationChannel$42(this.f21301b, this.f21302c, this.d);
                return;
            default:
                ((TopicsController) this.f21303e).lambda$updateMentionsUnread$21(this.f21301b, this.f21302c, this.d);
                return;
        }
    }
}
