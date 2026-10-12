package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f17041a;
    public final long f17042b;
    public final long f17043c;
    public final int d;
    public final Object f17044e;

    public a5(int i10, String str, long j3, long j10) {
        this.f17041a = 0;
        this.d = i10;
        this.f17044e = str;
        this.f17042b = j3;
        this.f17043c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17041a) {
            case 0:
                long j3 = this.f17042b;
                long j10 = this.f17043c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.f17044e, j3, j10);
                return;
            case 1:
                ((MediaDataController) this.f17044e).lambda$getMediaCounts$131(this.f17042b, this.f17043c, this.d);
                return;
            case 2:
                ((NotificationsController) this.f17044e).lambda$deleteNotificationChannel$43(this.f17042b, this.f17043c, this.d);
                return;
            default:
                ((TopicsController) this.f17044e).lambda$updateMentionsUnread$21(this.f17042b, this.f17043c, this.d);
                return;
        }
    }

    public a5(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f17041a = i11;
        this.f17044e = baseController;
        this.f17042b = j3;
        this.f17043c = j10;
        this.d = i10;
    }
}
