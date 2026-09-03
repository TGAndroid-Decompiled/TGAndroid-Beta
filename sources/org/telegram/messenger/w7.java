package org.telegram.messenger;
public final class w7 implements Runnable {
    public final int f20521a;
    public final long f20522b;
    public final long f20523c;
    public final int d;
    public final BaseController f20524e;

    public w7(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f20521a = i11;
        this.f20524e = baseController;
        this.f20522b = j10;
        this.f20523c = j11;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20521a) {
            case 0:
                ((MediaDataController) this.f20524e).lambda$getMediaCounts$131(this.f20522b, this.f20523c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f20524e).lambda$deleteNotificationChannel$42(this.f20522b, this.f20523c, this.d);
                return;
            default:
                ((TopicsController) this.f20524e).lambda$updateMentionsUnread$21(this.f20522b, this.f20523c, this.d);
                return;
        }
    }
}
