package org.telegram.messenger;
public final class t7 implements Runnable {
    public final int f17598a;
    public final long f17599b;
    public final long f17600c;
    public final int d;
    public final BaseController e;

    public t7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f17598a = i11;
        this.e = baseController;
        this.f17599b = j3;
        this.f17600c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17598a) {
            case 0:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f17599b, this.f17600c, this.d);
                return;
            case 1:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$42(this.f17599b, this.f17600c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f17599b, this.f17600c, this.d);
                return;
        }
    }
}
