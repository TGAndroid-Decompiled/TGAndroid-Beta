package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class x4 implements Runnable {
    public final int f19770a;
    public final long f19771b;
    public final long f19772c;
    public final int d;
    public final Object f19773e;

    public x4(int i10, String str, long j3, long j10) {
        this.f19770a = 0;
        this.d = i10;
        this.f19773e = str;
        this.f19771b = j3;
        this.f19772c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19770a) {
            case 0:
                long j3 = this.f19771b;
                long j10 = this.f19772c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.f19773e, j3, j10);
                return;
            case 1:
                ((MediaDataController) this.f19773e).lambda$getMediaCounts$131(this.f19771b, this.f19772c, this.d);
                return;
            case 2:
                ((NotificationsController) this.f19773e).lambda$deleteNotificationChannel$43(this.f19771b, this.f19772c, this.d);
                return;
            default:
                ((TopicsController) this.f19773e).lambda$updateMentionsUnread$21(this.f19771b, this.f19772c, this.d);
                return;
        }
    }

    public x4(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f19770a = i11;
        this.f19773e = baseController;
        this.f19771b = j3;
        this.f19772c = j10;
        this.d = i10;
    }
}
