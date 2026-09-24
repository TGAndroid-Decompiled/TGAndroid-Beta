package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f16282a;
    public final NotificationsController f16283b;
    public final long f16284c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f16282a = i11;
        this.f16283b = notificationsController;
        this.f16284c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f16282a) {
            case 0:
                this.f16283b.lambda$processDeleteStory$15(this.f16284c, this.d);
                return;
            default:
                this.f16283b.lambda$processReadStories$16(this.f16284c, this.d);
                return;
        }
    }
}
