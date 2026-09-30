package org.telegram.messenger;
public final class q7 implements Runnable {
    public final int f17380a;
    public final long f17381b;
    public final long f17382c;
    public final int d;
    public final BaseController e;

    public q7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f17380a = i11;
        this.e = baseController;
        this.f17381b = j3;
        this.f17382c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17380a) {
            case 0:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f17381b, this.f17382c, this.d);
                return;
            case 1:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$42(this.f17381b, this.f17382c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f17381b, this.f17382c, this.d);
                return;
        }
    }
}
