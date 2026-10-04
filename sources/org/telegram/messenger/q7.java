package org.telegram.messenger;
public final class q7 implements Runnable {
    public final int f18956a;
    public final long f18957b;
    public final long f18958c;
    public final int d;
    public final BaseController f18959e;

    public q7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f18956a = i11;
        this.f18959e = baseController;
        this.f18957b = j3;
        this.f18958c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18956a) {
            case 0:
                ((MediaDataController) this.f18959e).lambda$getMediaCounts$131(this.f18957b, this.f18958c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f18959e).lambda$deleteNotificationChannel$42(this.f18957b, this.f18958c, this.d);
                return;
            default:
                ((TopicsController) this.f18959e).lambda$updateMentionsUnread$21(this.f18957b, this.f18958c, this.d);
                return;
        }
    }
}
