package org.telegram.messenger;
public final class t7 implements Runnable {
    public final int f17579a;
    public final long f17580b;
    public final long f17581c;
    public final int d;
    public final BaseController e;

    public t7(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f17579a = i11;
        this.e = baseController;
        this.f17580b = j3;
        this.f17581c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17579a) {
            case 0:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f17580b, this.f17581c, this.d);
                return;
            case 1:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$42(this.f17580b, this.f17581c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f17580b, this.f17581c, this.d);
                return;
        }
    }
}
