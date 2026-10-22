package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class c5 implements Runnable {
    public final int f18006a;
    public final long f18007b;
    public final long f18008c;
    public final int d;
    public final Object e;

    public c5(int i10, String str, long j10, long j11) {
        this.f18006a = 0;
        this.d = i10;
        this.e = str;
        this.f18007b = j10;
        this.f18008c = j11;
    }

    @Override
    public final void run() {
        switch (this.f18006a) {
            case 0:
                long j10 = this.f18007b;
                long j11 = this.f18008c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.e, j10, j11);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f18007b, this.f18008c, this.d);
                return;
            case 2:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$43(this.f18007b, this.f18008c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f18007b, this.f18008c, this.d);
                return;
        }
    }

    public c5(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f18006a = i11;
        this.e = baseController;
        this.f18007b = j10;
        this.f18008c = j11;
        this.d = i10;
    }
}
