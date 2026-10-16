package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f16439a;
    public final long f16440b;
    public final long f16441c;
    public final int d;
    public final Object e;

    public a5(int i10, String str, long j10, long j11) {
        this.f16439a = 0;
        this.d = i10;
        this.e = str;
        this.f16440b = j10;
        this.f16441c = j11;
    }

    @Override
    public final void run() {
        switch (this.f16439a) {
            case 0:
                long j10 = this.f16440b;
                long j11 = this.f16441c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.e, j10, j11);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f16440b, this.f16441c, this.d);
                return;
            case 2:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$43(this.f16440b, this.f16441c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f16440b, this.f16441c, this.d);
                return;
        }
    }

    public a5(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f16439a = i11;
        this.e = baseController;
        this.f16440b = j10;
        this.f16441c = j11;
        this.d = i10;
    }
}
