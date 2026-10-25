package org.telegram.messenger;

import org.telegram.messenger.ImageLoader;
public final class d5 implements Runnable {
    public final int f19871a;
    public final long f19872b;
    public final long f19873c;
    public final int d;
    public final Object e;

    public d5(int i10, String str, long j10, long j11) {
        this.f19871a = 0;
        this.d = i10;
        this.e = str;
        this.f19872b = j10;
        this.f19873c = j11;
    }

    @Override
    public final void run() {
        switch (this.f19871a) {
            case 0:
                long j10 = this.f19872b;
                long j11 = this.f19873c;
                ImageLoader.AnonymousClass5.lambda$fileLoadProgressChanged$8(this.d, (String) this.e, j10, j11);
                return;
            case 1:
                ((MediaDataController) this.e).lambda$getMediaCounts$131(this.f19872b, this.f19873c, this.d);
                return;
            case 2:
                ((NotificationsController) this.e).lambda$deleteNotificationChannel$43(this.f19872b, this.f19873c, this.d);
                return;
            default:
                ((TopicsController) this.e).lambda$updateMentionsUnread$21(this.f19872b, this.f19873c, this.d);
                return;
        }
    }

    public d5(BaseController baseController, long j10, long j11, int i10, int i11) {
        this.f19871a = i11;
        this.e = baseController;
        this.f19872b = j10;
        this.f19873c = j11;
        this.d = i10;
    }
}
