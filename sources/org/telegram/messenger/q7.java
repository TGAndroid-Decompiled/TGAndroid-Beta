package org.telegram.messenger;
public final class q7 implements Runnable {
    public final int f18957a;
    public final long f18958b;
    public final long f18959c;
    public final int d;
    public final BaseController f18960e;

    public q7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f18957a = i11;
        this.f18960e = baseController;
        this.f18958b = j3;
        this.f18959c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18957a) {
            case 0:
                ((MediaDataController) this.f18960e).lambda$getMediaCounts$131(this.f18958b, this.f18959c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f18960e).lambda$deleteNotificationChannel$42(this.f18958b, this.f18959c, this.d);
                return;
            default:
                ((TopicsController) this.f18960e).lambda$updateMentionsUnread$21(this.f18958b, this.f18959c, this.d);
                return;
        }
    }
}
