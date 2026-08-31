package org.telegram.messenger;
public final class w7 implements Runnable {
    public final int f20519a;
    public final long f20520b;
    public final long f20521c;
    public final int d;
    public final BaseController f20522e;

    public w7(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f20519a = i11;
        this.f20522e = baseController;
        this.f20520b = j10;
        this.f20521c = j11;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20519a) {
            case 0:
                ((MediaDataController) this.f20522e).lambda$getMediaCounts$131(this.f20520b, this.f20521c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f20522e).lambda$deleteNotificationChannel$42(this.f20520b, this.f20521c, this.d);
                return;
            default:
                ((TopicsController) this.f20522e).lambda$updateMentionsUnread$21(this.f20520b, this.f20521c, this.d);
                return;
        }
    }
}
