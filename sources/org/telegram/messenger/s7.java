package org.telegram.messenger;
public final class s7 implements Runnable {
    public final int f18990a;
    public final long f18991b;
    public final long f18992c;
    public final int d;
    public final BaseController f18993e;

    public s7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f18990a = i11;
        this.f18993e = baseController;
        this.f18991b = j3;
        this.f18992c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18990a) {
            case 0:
                ((MediaDataController) this.f18993e).lambda$getMediaCounts$131(this.f18991b, this.f18992c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f18993e).lambda$deleteNotificationChannel$42(this.f18991b, this.f18992c, this.d);
                return;
            default:
                ((TopicsController) this.f18993e).lambda$updateMentionsUnread$21(this.f18991b, this.f18992c, this.d);
                return;
        }
    }
}
