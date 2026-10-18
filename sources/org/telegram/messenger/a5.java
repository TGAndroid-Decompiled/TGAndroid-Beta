package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f17837a;
    public final long f17838b;
    public final long f17839c;
    public final int d;
    public final Object e;

    public a5(int i10, String str, long j10, long j11) {
        this.f17837a = 0;
        this.d = i10;
        this.e = str;
        this.f17838b = j10;
        this.f17839c = j11;
    }

    @Override
    public final void run() {
        switch (this.f17837a) {
            case 0:
                long j10 = this.f17838b;
                long j11 = this.f17839c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.e, j10, j11);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f17838b, this.f17839c, this.d);
                return;
            case 2:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$43(this.f17838b, this.f17839c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f17838b, this.f17839c, this.d);
                return;
        }
    }

    public a5(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f17837a = i11;
        this.e = baseController;
        this.f17838b = j10;
        this.f17839c = j11;
        this.d = i10;
    }
}
