package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class a5 implements Runnable {
    public final int f17040a;
    public final long f17041b;
    public final long f17042c;
    public final int d;
    public final Object f17043e;

    public a5(int i10, String str, long j3, long j10) {
        this.f17040a = 0;
        this.d = i10;
        this.f17043e = str;
        this.f17041b = j3;
        this.f17042c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17040a) {
            case 0:
                long j3 = this.f17041b;
                long j10 = this.f17042c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.f17043e, j3, j10);
                return;
            case 1:
                ((MediaDataController) this.f17043e).lambda$getMediaCounts$131(this.f17041b, this.f17042c, this.d);
                return;
            case 2:
                ((NotificationsController) this.f17043e).lambda$deleteNotificationChannel$43(this.f17041b, this.f17042c, this.d);
                return;
            default:
                ((TopicsController) this.f17043e).lambda$updateMentionsUnread$21(this.f17041b, this.f17042c, this.d);
                return;
        }
    }

    public a5(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f17040a = i11;
        this.f17043e = baseController;
        this.f17041b = j3;
        this.f17042c = j10;
        this.d = i10;
    }
}
