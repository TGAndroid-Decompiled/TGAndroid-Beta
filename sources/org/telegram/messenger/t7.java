package org.telegram.messenger;

public final class t7 implements Runnable {

    public final int f21612a;

    public final long f21613b;

    public final long f21614c;
    public final int d;

    public final BaseController f21615e;

    public t7(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f21612a = i11;
        this.f21615e = baseController;
        this.f21613b = j10;
        this.f21614c = j11;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f21612a) {
            case 0:
                ((MediaDataController) this.f21615e).lambda$getMediaCounts$131(this.f21613b, this.f21614c, this.d);
                break;
            case 1:
                ((NotificationsController) this.f21615e).lambda$deleteNotificationChannel$42(this.f21613b, this.f21614c, this.d);
                break;
            default:
                ((TopicsController) this.f21615e).lambda$updateMentionsUnread$21(this.f21613b, this.f21614c, this.d);
                break;
        }
    }
}
