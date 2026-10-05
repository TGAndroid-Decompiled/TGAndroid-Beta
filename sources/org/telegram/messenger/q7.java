package org.telegram.messenger;
public final class q7 implements Runnable {
    public final int f18961a;
    public final long f18962b;
    public final long f18963c;
    public final int d;
    public final BaseController f18964e;

    public q7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f18961a = i11;
        this.f18964e = baseController;
        this.f18962b = j3;
        this.f18963c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18961a) {
            case 0:
                ((MediaDataController) this.f18964e).lambda$getMediaCounts$131(this.f18962b, this.f18963c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f18964e).lambda$deleteNotificationChannel$42(this.f18962b, this.f18963c, this.d);
                return;
            default:
                ((TopicsController) this.f18964e).lambda$updateMentionsUnread$21(this.f18962b, this.f18963c, this.d);
                return;
        }
    }
}
