package org.telegram.messenger;
public final class t7 implements Runnable {
    public final int f19047a;
    public final long f19048b;
    public final long f19049c;
    public final int d;
    public final BaseController f19050e;

    public t7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f19047a = i11;
        this.f19050e = baseController;
        this.f19048b = j3;
        this.f19049c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f19047a) {
            case 0:
                ((MediaDataController) this.f19050e).lambda$getMediaCounts$131(this.f19048b, this.f19049c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f19050e).lambda$deleteNotificationChannel$42(this.f19048b, this.f19049c, this.d);
                return;
            default:
                ((TopicsController) this.f19050e).lambda$updateMentionsUnread$21(this.f19048b, this.f19049c, this.d);
                return;
        }
    }
}
