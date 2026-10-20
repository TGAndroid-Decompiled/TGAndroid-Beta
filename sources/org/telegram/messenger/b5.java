package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class b5 implements Runnable {
    public final int f17927a;
    public final long f17928b;
    public final long f17929c;
    public final int d;
    public final Object e;

    public b5(int i10, String str, long j10, long j11) {
        this.f17927a = 0;
        this.d = i10;
        this.e = str;
        this.f17928b = j10;
        this.f17929c = j11;
    }

    @Override
    public final void run() {
        switch (this.f17927a) {
            case 0:
                long j10 = this.f17928b;
                long j11 = this.f17929c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.e, j10, j11);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f17928b, this.f17929c, this.d);
                return;
            case 2:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$43(this.f17928b, this.f17929c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f17928b, this.f17929c, this.d);
                return;
        }
    }

    public b5(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f17927a = i11;
        this.e = baseController;
        this.f17928b = j10;
        this.f17929c = j11;
        this.d = i10;
    }
}
