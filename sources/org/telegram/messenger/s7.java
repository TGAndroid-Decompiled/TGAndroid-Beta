package org.telegram.messenger;
public final class s7 implements Runnable {
    public final int f18963a;
    public final long f18964b;
    public final long f18965c;
    public final int d;
    public final BaseController f18966e;

    public s7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f18963a = i11;
        this.f18966e = baseController;
        this.f18964b = j3;
        this.f18965c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18963a) {
            case 0:
                ((MediaDataController) this.f18966e).lambda$getMediaCounts$131(this.f18964b, this.f18965c, this.d);
                return;
            case 1:
                ((NotificationsController) this.f18966e).lambda$deleteNotificationChannel$42(this.f18964b, this.f18965c, this.d);
                return;
            default:
                ((TopicsController) this.f18966e).lambda$updateMentionsUnread$21(this.f18964b, this.f18965c, this.d);
                return;
        }
    }
}
