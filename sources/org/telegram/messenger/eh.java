package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f20010a;
    public final NotificationsController f20011b;
    public final long f20012c;
    public final int d;

    public eh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f20010a = i11;
        this.f20011b = notificationsController;
        this.f20012c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f20010a) {
            case 0:
                this.f20011b.lambda$processDeleteStory$16(this.f20012c, this.d);
                return;
            default:
                this.f20011b.lambda$processReadStories$17(this.f20012c, this.d);
                return;
        }
    }
}
