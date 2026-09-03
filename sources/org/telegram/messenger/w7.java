package org.telegram.messenger;
public final class w7 implements Runnable {
    public final int f18864a;
    public final long f18865b;
    public final long f18866c;
    public final int d;
    public final BaseController e;

    public w7(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f18864a = i11;
        this.e = baseController;
        this.f18865b = j10;
        this.f18866c = j11;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f18864a) {
            case 0:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f18865b, this.f18866c, this.d);
                return;
            case 1:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$42(this.f18865b, this.f18866c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f18865b, this.f18866c, this.d);
                return;
        }
    }
}
