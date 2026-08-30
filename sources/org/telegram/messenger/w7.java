package org.telegram.messenger;
public final class w7 implements Runnable {
    public final int f18881a;
    public final long f18882b;
    public final long f18883c;
    public final int d;
    public final BaseController e;

    public w7(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f18881a = i11;
        this.e = baseController;
        this.f18882b = j10;
        this.f18883c = j11;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18881a) {
            case 0:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f18882b, this.f18883c, this.d);
                return;
            case 1:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$42(this.f18882b, this.f18883c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f18882b, this.f18883c, this.d);
                return;
        }
    }
}
