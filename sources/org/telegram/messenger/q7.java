package org.telegram.messenger;
public final class q7 implements Runnable {
    public final int f17364a;
    public final long f17365b;
    public final long f17366c;
    public final int d;
    public final BaseController e;

    public q7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f17364a = i11;
        this.e = baseController;
        this.f17365b = j3;
        this.f17366c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17364a) {
            case 0:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f17365b, this.f17366c, this.d);
                return;
            case 1:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$42(this.f17365b, this.f17366c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f17365b, this.f17366c, this.d);
                return;
        }
    }
}
