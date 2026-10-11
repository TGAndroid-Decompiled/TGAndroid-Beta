package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class x4 implements Runnable {
    public final int f19799a;
    public final long f19800b;
    public final long f19801c;
    public final int d;
    public final Object f19802e;

    public x4(int i10, String str, long j3, long j10) {
        this.f19799a = 0;
        this.d = i10;
        this.f19802e = str;
        this.f19800b = j3;
        this.f19801c = j10;
    }

    @Override
    public final void run() {
        switch (this.f19799a) {
            case 0:
                long j3 = this.f19800b;
                long j10 = this.f19801c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.f19802e, j3, j10);
                return;
            case 1:
                ((MediaDataController) this.f19802e).lambda$getMediaCounts$131(this.f19800b, this.f19801c, this.d);
                return;
            case 2:
                ((NotificationsController) this.f19802e).lambda$deleteNotificationChannel$43(this.f19800b, this.f19801c, this.d);
                return;
            default:
                ((TopicsController) this.f19802e).lambda$updateMentionsUnread$21(this.f19800b, this.f19801c, this.d);
                return;
        }
    }

    public x4(BaseController baseController, long j3, long j10, int i10, int i11) {
        this.f19799a = i11;
        this.f19802e = baseController;
        this.f19800b = j3;
        this.f19801c = j10;
        this.d = i10;
    }
}
