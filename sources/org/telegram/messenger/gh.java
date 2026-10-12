package org.telegram.messenger;
public final class gh implements Runnable {
    public final int f17701a;
    public final NotificationsController f17702b;
    public final long f17703c;
    public final int d;

    public gh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.f17701a = i11;
        this.f17702b = notificationsController;
        this.f17703c = j3;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f17701a) {
            case 0:
                this.f17702b.lambda$processDeleteStory$16(this.f17703c, this.d);
                return;
            default:
                this.f17702b.lambda$processReadStories$17(this.f17703c, this.d);
                return;
        }
    }
}
