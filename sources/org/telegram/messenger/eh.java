package org.telegram.messenger;
public final class eh implements Runnable {
    public final int f17775a;
    public final NotificationsController f17776b;
    public final long f17777c;
    public final int d;

    public eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17775a = i11;
        this.f17776b = notificationsController;
        this.f17777c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17775a) {
            case 0:
                this.f17776b.lambda$processDeleteStory$15(this.f17777c, this.d);
                return;
            default:
                this.f17776b.lambda$processReadStories$16(this.f17777c, this.d);
                return;
        }
    }
}
