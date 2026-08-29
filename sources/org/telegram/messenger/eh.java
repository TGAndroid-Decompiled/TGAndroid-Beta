package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f20150a;
    public final NotificationsController f20151b;
    public final long f20152c;
    public final int d;

    public eh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f20150a = i11;
        this.f20151b = notificationsController;
        this.f20152c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20150a) {
            case 0:
                this.f20151b.lambda$processDeleteStory$15(this.f20152c, this.d);
                return;
            default:
                this.f20151b.lambda$processReadStories$16(this.f20152c, this.d);
                return;
        }
    }
}
