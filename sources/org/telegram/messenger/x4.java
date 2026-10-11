package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class x4 implements Runnable {
    public final int f19763a;
    public final long f19764b;
    public final long f19765c;
    public final int d;
    public final Object f19766e;

    public x4(int i10, String str, long j3, long j10) {
        this.f19763a = 0;
        this.d = i10;
        this.f19766e = str;
        this.f19764b = j3;
        this.f19765c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19763a) {
            case 0:
                long j3 = this.f19764b;
                long j10 = this.f19765c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.f19766e, j3, j10);
                return;
            case 1:
                ((MediaDataController) this.f19766e).lambda$getMediaCounts$131(this.f19764b, this.f19765c, this.d);
                return;
            case 2:
                ((NotificationsController) this.f19766e).lambda$deleteNotificationChannel$43(this.f19764b, this.f19765c, this.d);
                return;
            default:
                ((TopicsController) this.f19766e).lambda$updateMentionsUnread$21(this.f19764b, this.f19765c, this.d);
                return;
        }
    }

    public x4(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f19763a = i11;
        this.f19766e = baseController;
        this.f19764b = j3;
        this.f19765c = j10;
        this.d = i10;
    }
}
