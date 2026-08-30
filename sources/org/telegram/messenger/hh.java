package org.telegram.messenger;
public final class hh implements Runnable {
    public final int f17411a;
    public final NotificationsController f17412b;
    public final long f17413c;
    public final int d;

    public hh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.f17411a = i11;
        this.f17412b = notificationsController;
        this.f17413c = j10;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17411a) {
            case 0:
                this.f17412b.lambda$processDeleteStory$15(this.f17413c, this.d);
                return;
            default:
                this.f17412b.lambda$processReadStories$16(this.f17413c, this.d);
                return;
        }
    }
}
